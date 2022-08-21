
package centroeducativo.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ManagerJavaPostgreSQL
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
    }
    
    private Connection connection = null;
    
    public ManagerJavaPostgreSQL()
    {
        this.conectar();
    }
    
    public Connection conectar()
    {
        /*
        host Nombre del host o ip.
        port Puerto en el que escucha la base de datos.
        database Nombre de la base de datos para la conexión.
        user Nombre de usuario.
        password Password del usuario.
        */
        
        String host = "localhost";
        String port = "5432";
        String database = "CentroEducativo";
        String user = "postgres";
        String password = "1234";
        
        String url = "";
        try
        {
            // Registramos el driver de PostgresSQL
            try
            {
                Class.forName("org.postgresql.Driver");
            }
            catch (ClassNotFoundException ex)
            {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(url, user, password);           
            
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        }
        catch (java.sql.SQLException sqle)
        { 
            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + url + "): " + sqle);
        }
        
        return connection;
    }
    
    public void CerrarConexion()
    {
        try
        {
            connection.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerJavaPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int cantidadFilas(String Tabla)
    {
        int CantidadFilas = 0;
        
        try (Connection conn = this.conectar();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery("SELECT COUNT(*) FROM " + Tabla))
        {
            CantidadFilas = rs.getInt(1);
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return CantidadFilas;
    }
    
    public int cantidadColumnas(String Tabla)
    {
        int CantidadColumnas = 0;
        
        try
            (
                Connection conn = this.conectar();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery("SELECT COUNT(*) FROM information_schema.columns WHERE table_name = '" + Tabla + "'")
            )
        {
            while(rs.next())
            {
                CantidadColumnas = rs.getInt(1);
            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return CantidadColumnas;
    }
    
    public String nombreColumnaIdentificador(String Tabla)
    {
        String NombreColumna = "";
        
        try
            (
                Connection conn = this.conectar();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = '" + Tabla + "' AND ordinal_position = 1")
            )
        {
            while(rs.next())
            {
                NombreColumna = rs.getString(1);
            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return NombreColumna;
    }
    
    public boolean existe(String Tabla, Object Identificador)
    {
        boolean Existencia = false;
        
        String sql = "SELECT COUNT(*) FROM Letras WHERE " + Tabla + " = ?";
        
        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql);)
        {
            pstmt.setObject(1, Identificador);
            ResultSet rs = pstmt.executeQuery(sql);
                    
            if(rs.next())
            {           
                Existencia = rs.getBoolean(1);
            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return Existencia;
    }

    public Object[][] SelectTabla(String Tabla)
    {
        Object[][] Datos = null;
        
        String sql = "SELECT * FROM " + Tabla;
        
        try (Connection conn = this.conectar();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql))
        {
            
            int Columnas = cantidadColumnas(Tabla);
            int Filas = cantidadFilas(Tabla);
            
            Datos = new Object[Filas][Columnas];
            
            int i = 0;
            while (rs.next())
            {
                i++;
                
                for(int j=1; j<=Columnas; j++)
                {
                    Datos[i-1][j-1] = rs.getObject(j);
                }
            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return Datos;
    }    
    
    public Object[][] Select(String Tabla, String NombreColumna, Object Dato)
    {
        Object[][] Datos = null;
        
        String sql = "SELECT * FROM " + Tabla + "WHERE " + NombreColumna + " = ?";
        
        try (Connection conn = this.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setObject(1, Dato);
            ResultSet rs = pstmt.executeQuery(sql);
            
            int Columnas = cantidadColumnas(Tabla);
            int Filas = cantidadFilas(Tabla);
            
            Datos = new Object[Filas][Columnas];
            
            int i = 0;
            while (rs.next())
            {
                i++;
                
                for(int j=1; j<=Columnas; j++)
                {
                    Datos[i-1][j-1] = rs.getObject(j);
                }
            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
        return Datos;
    }
    
    public void Insert(ArrayList<Object> Datos)
    {   
        String Tabla = String.valueOf(Datos.get(0));
        
        if(this.existe(Tabla, Datos.get(1)) == false)
        {
            int Columnas = this.cantidadColumnas(Tabla);
            
            String ValueInterrogants = "";
            
            if(Tabla.equals("Mestro") || Tabla.equals("Padre") || Tabla.equals("Alumno"))
            {
                for(int i=1; i<=Columnas; i++)
                {
                    ValueInterrogants = ValueInterrogants + "?";
                    
                    if(i < Columnas)
                    {
                        ValueInterrogants = ValueInterrogants + ",";
                    }
                }
            }
            
            String sql = "INSERT INTO " + Tabla + " VALUES(" + ValueInterrogants + ")";
        
            try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql))
            {
                for(int i=1; i<=Columnas; i++)
                {
                    pstmt.setObject(i, Datos.get(i));
                }
            
                pstmt.executeUpdate();
            }
            catch (SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El registro " + Datos.get(1) + " ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Delete(String Tabla, Object Identificador)
    {
        String NombreColumna = nombreColumnaIdentificador(Tabla);
        
        String sql = "DELETE FROM " + Tabla + " WHERE " + NombreColumna + " = ?";

        try (Connection conn = this.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setObject(1, Identificador);
            
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
           System.err.println(e.getMessage());
        }
    }
    
    public void Update(String Tabla, Object Identificador, String NombreColumna, Object Dato)
    {
        String ColumnaIdentificador = nombreColumnaIdentificador(Tabla);
        
        if(this.existe(Tabla, Identificador) == true)
        {
            String sql = "UPDATE " + Tabla + " SET " + NombreColumna + " = ? WHERE " + ColumnaIdentificador + " = ?";

            try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql))
            {
                // set the corresponding param
                pstmt.setObject(1, Dato);
                pstmt.setObject(2, Identificador);
            
                // update 
                pstmt.executeUpdate();
            }
            catch (SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El registro " + Dato + " ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
