
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Grado
{
    private Integer Codigo;
    private String Nombre_Grado;
    private String Descripcion;

    public Grado(Integer Codigo, String Nombre_Grado, String Descripcion)
    {
        this.Codigo = Codigo;
        this.Nombre_Grado = Nombre_Grado;
        this.Descripcion = Descripcion;
    }

    public Integer getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getNombre_Grado()
    {
        return Nombre_Grado;
    }

    public void setNombre_Grado(String Nombre_Grado)
    {
        this.Nombre_Grado = Nombre_Grado;
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }
    
    public Object[][] getTodosGrados()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("Grado");
        
        return Datos;
    }
}
