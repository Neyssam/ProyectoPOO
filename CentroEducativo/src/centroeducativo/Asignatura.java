/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Asignatura {
    
    private String Asinatura;
    private String Curso;
    private String Profesor;
    
    public Asignatura(){};

    public Asignatura(String Asinatura, String Curso, String Profesor) {
        this.Asinatura = Asinatura;
        this.Curso = Curso;
        this.Profesor = Profesor;
    }

    public void setAsinatura(String Asinatura) {
        this.Asinatura = Asinatura;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public String getAsinatura() {
        return Asinatura;
    }

    public String getCurso() {
        return Curso;
    }

    public String getProfesor() {
        return Profesor;
    }
    
    
    
    
}
