
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Alumno extends Persona
{
    private String MatriculaInicial;
    private String ID_GradoInicial;

    public Alumno(String MatriculaInicial, String ID_GradoInicial, Integer identificador, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Genero, String Tipo)
    {
        super(identificador, Nombre_1, Nombre_2, Apellido_1, Apellido_2, Genero, Tipo);
        this.MatriculaInicial = MatriculaInicial;
        this.ID_GradoInicial = ID_GradoInicial;
    }

    public String getMatriculaInicial()
    {
        return MatriculaInicial;
    }

    public void setMatriculaInicial(String MatriculaInicial)
    {
        this.MatriculaInicial = MatriculaInicial;
    }

    public String getID_GradoInicial()
    {
        return ID_GradoInicial;
    }

    public void setID_GradoInicial(String ID_GradoInicial)
    {
        this.ID_GradoInicial = ID_GradoInicial;
    }
    
    public Object[][] getTodosAlumnos()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.Select("Persona", "Tipo", "Alumno");
        
        return Datos;
    }
}
