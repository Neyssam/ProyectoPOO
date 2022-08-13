/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Curso {
    
    private String IdCurso;
    private String Grado;
    private String Seccion;
    private String ProfesorGuia;
    
    public Curso(){};

    public Curso(String IdCurso, String Grado, String Seccion, String ProfesorGuia) {
        this.IdCurso = IdCurso;
        this.Grado = Grado;
        this.Seccion = Seccion;
        this.ProfesorGuia = ProfesorGuia;
    }

    public void setIdCurso(String IdCurso) {
        this.IdCurso = IdCurso;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public void setProfesorGuia(String ProfesorGuia) {
        this.ProfesorGuia = ProfesorGuia;
    }

    public String getIdCurso() {
        return IdCurso;
    }

    public String getGrado() {
        return Grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public String getProfesorGuia() {
        return ProfesorGuia;
    }
    
    
}
