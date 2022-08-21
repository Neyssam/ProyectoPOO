
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Clase
{
    private Integer Codigo;
    private String Nombre;
    private String Descripcion;
    private String ID_Maestro;

    public Clase(Integer Codigo, String Nombre, String Descripcion, String ID_Maestro)
    {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.ID_Maestro = ID_Maestro;
    }

    public Integer getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }

    public String getID_Maestro()
    {
        return ID_Maestro;
    }

    public void setID_Maestro(String ID_Maestro)
    {
        this.ID_Maestro = ID_Maestro;
    }
    
    public Object[][] getTodasClases()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("Clase");
        
        return Datos;
    }
}
