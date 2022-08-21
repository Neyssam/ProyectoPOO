
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Seccion
{
    private Integer Codigo;
    private String Nombre_Seccion;
    private String ID_Grado;
    private String ID_MaestroGuía;
    private String ID_CentroEstudio;

    public Seccion(Integer Codigo, String Nombre_Seccion, String ID_Grado, String ID_MaestroGuía, String ID_CentroEstudio)
    {
        this.Codigo = Codigo;
        this.Nombre_Seccion = Nombre_Seccion;
        this.ID_Grado = ID_Grado;
        this.ID_MaestroGuía = ID_MaestroGuía;
        this.ID_CentroEstudio = ID_CentroEstudio;
    }

    public Integer getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getNombre_Seccion()
    {
        return Nombre_Seccion;
    }

    public void setNombre_Seccion(String Nombre_Seccion)
    {
        this.Nombre_Seccion = Nombre_Seccion;
    }

    public String getID_Grado()
    {
        return ID_Grado;
    }

    public void setID_Grado(String ID_Grado)
    {
        this.ID_Grado = ID_Grado;
    }

    public String getID_MaestroGuía()
    {
        return ID_MaestroGuía;
    }

    public void setID_MaestroGuía(String ID_MaestroGuía)
    {
        this.ID_MaestroGuía = ID_MaestroGuía;
    }

    public String getID_CentroEstudio()
    {
        return ID_CentroEstudio;
    }

    public void setID_CentroEstudio(String ID_CentroEstudio)
    {
        this.ID_CentroEstudio = ID_CentroEstudio;
    }
    
    public Object[][] getTodasSecciones()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("Seccion");
        
        return Datos;
    }
}
