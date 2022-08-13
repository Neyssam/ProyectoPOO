/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Profesor extends Persona{
    
    protected int NumEmpleado;
    
    public Profesor(){
        super();
    }
    
    public Profesor(int NumEmpleado){
        this.NumEmpleado = NumEmpleado;
    }
    
    public Profesor(String Id, String Nombre, String Apellido, int Edad, int NumEmpleado){
        super(Id, Nombre, Apellido, Edad);
        this.NumEmpleado = NumEmpleado;
    };
    
    
    
}
