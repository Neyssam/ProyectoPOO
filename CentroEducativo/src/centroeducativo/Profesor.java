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
    
    
    public Profesor(){};

    public Profesor(int NumEmpleado) {
        this.NumEmpleado = NumEmpleado;
    }

    public Profesor(int NumEmpleado, String Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.NumEmpleado = NumEmpleado;
    }

    public void setNumEmpleado(int NumEmpleado) {
        this.NumEmpleado = NumEmpleado;
    }

    public int getNumEmpleado() {
        return NumEmpleado;
    }

    
    
    
    
}
