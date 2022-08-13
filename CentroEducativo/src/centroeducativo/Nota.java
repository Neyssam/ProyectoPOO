/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Nota {
    
    private String Asignatura;
    private String Alumno;
    private String Curso;
    private String NotaParcial;
    private String Promedio;
    
    public Nota(){};

    public Nota(String Asignatura, String Alumno, String Curso, String NotaParcial, String Promedio) {
        this.Asignatura = Asignatura;
        this.Alumno = Alumno;
        this.Curso = Curso;
        this.NotaParcial = NotaParcial;
        this.Promedio = Promedio;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setNotaParcial(String NotaParcial) {
        this.NotaParcial = NotaParcial;
    }

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public String getAlumno() {
        return Alumno;
    }

    public String getCurso() {
        return Curso;
    }

    public String getNotaParcial() {
        return NotaParcial;
    }

    public String getPromedio() {
        return Promedio;
    }
    
    
    
    
}
