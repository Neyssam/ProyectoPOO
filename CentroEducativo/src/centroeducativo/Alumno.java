/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Alumno extends Persona{
    
    
    protected int Cuenta;
    protected int AnioIngreso;
    protected String Padre;
    
    public Alumno(String Id, String Nombre, String Apellido, int Edad){
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    };
    
}
