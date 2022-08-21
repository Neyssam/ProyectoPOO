
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Calificaciones
{
    private Integer Codigo;
    private String Año;
    private String ID_Grado;
    private String ID_Clase;
    private String ID_Persona;
    private Float Parcial_1;
    private Float Parcial_2;
    private Float Parcial_3;
    private Float Parcial_4;
    private Float Promedio;
    private String Observación;

    public Calificaciones(Integer Codigo, String Año, String ID_Grado, String ID_Clase, String ID_Persona, Float Parcial_1, Float Parcial_2, Float Parcial_3, Float Parcial_4, Float Promedio, String Observación)
    {
        this.Codigo = Codigo;
        this.Año = Año;
        this.ID_Grado = ID_Grado;
        this.ID_Clase = ID_Clase;
        this.ID_Persona = ID_Persona;
        this.Parcial_1 = Parcial_1;
        this.Parcial_2 = Parcial_2;
        this.Parcial_3 = Parcial_3;
        this.Parcial_4 = Parcial_4;
        this.Promedio = Promedio;
        this.Observación = Observación;
    }

    public Integer getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(Integer Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getAño()
    {
        return Año;
    }

    public void setAño(String Año)
    {
        this.Año = Año;
    }

    public String getID_Grado()
    {
        return ID_Grado;
    }

    public void setID_Grado(String ID_Grado)
    {
        this.ID_Grado = ID_Grado;
    }

    public String getID_Clase()
    {
        return ID_Clase;
    }

    public void setID_Clase(String ID_Clase)
    {
        this.ID_Clase = ID_Clase;
    }

    public String getID_Persona()
    {
        return ID_Persona;
    }

    public void setID_Persona(String ID_Persona)
    {
        this.ID_Persona = ID_Persona;
    }

    public Float getParcial_1()
    {
        return Parcial_1;
    }

    public void setParcial_1(Float Parcial_1)
    {
        this.Parcial_1 = Parcial_1;
    }

    public Float getParcial_2()
    {
        return Parcial_2;
    }

    public void setParcial_2(Float Parcial_2)
    {
        this.Parcial_2 = Parcial_2;
    }

    public Float getParcial_3()
    {
        return Parcial_3;
    }

    public void setParcial_3(Float Parcial_3)
    {
        this.Parcial_3 = Parcial_3;
    }

    public Float getParcial_4()
    {
        return Parcial_4;
    }

    public void setParcial_4(Float Parcial_4)
    {
        this.Parcial_4 = Parcial_4;
    }

    public Float getPromedio()
    {
        return Promedio;
    }

    public void setPromedio(Float Promedio)
    {
        this.Promedio = Promedio;
    }

    public String getObservación()
    {
        return Observación;
    }

    public void setObservación(String Observación)
    {
        this.Observación = Observación;
    }
    
    public Object[][] getTodasCalificaciones(String NombreColumna, Object Dato)
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.SelectTabla("Calificaciones");
        
        return Datos;
    }
    
    public Object[][] getCalificaciones(String NombreColumna, Object Dato)
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.Select("Calificaciones", NombreColumna, Dato);
        
        return Datos;
    }
}
