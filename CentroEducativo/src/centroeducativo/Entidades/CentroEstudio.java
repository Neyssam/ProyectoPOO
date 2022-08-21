
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class CentroEstudio
{
    private Integer Codigo;
    private String Nombre;
    private String Direccion;

    public CentroEstudio(Integer Codigo, String Nombre, String Direccion)
    {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
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

    public String getDireccion()
    {
        return Direccion;
    }

    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }
    
    public Object[][] getTodosCentrosEstudio()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("CentroEstudio");
        
        return Datos;
    }
}
