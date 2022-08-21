
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Paternidad
{
    private Integer Codigo;
    private String ID_Padre;
    private String ID_Madre;
    private String ID_Hijo;

    public Paternidad(Integer Codigo, String ID_Padre, String ID_Madre, String ID_Hijo)
    {
        this.Codigo = Codigo;
        this.ID_Padre = ID_Padre;
        this.ID_Madre = ID_Madre;
        this.ID_Hijo = ID_Hijo;
    }

    public Integer getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getID_Padre()
    {
        return ID_Padre;
    }

    public void setID_Padre(String ID_Padre)
    {
        this.ID_Padre = ID_Padre;
    }

    public String getID_Madre()
    {
        return ID_Madre;
    }

    public void setID_Madre(String ID_Madre)
    {
        this.ID_Madre = ID_Madre;
    }

    public String getID_Hijo()
    {
        return ID_Hijo;
    }

    public void setID_Hijo(String ID_Hijo)
    {
        this.ID_Hijo = ID_Hijo;
    }
    
    public Object[][] getTodasPaternidades()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("Paternidad");
        
        return Datos;
    }
}
