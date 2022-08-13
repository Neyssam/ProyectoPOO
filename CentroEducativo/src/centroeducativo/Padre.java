/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author NeyEliuR
 */
public class Padre extends Persona{
    protected String Hijo;
    
    public Padre(){
        super();
    }
    
    public Padre(String Hijo){
        this.Hijo = Hijo;
    }
    
    public Padre(String Id, String Nombre, String Apellido, int Edad, String Hijo){
        super(Id, Nombre, Apellido, Edad);
        this.Hijo = Hijo;
    };
    
}
