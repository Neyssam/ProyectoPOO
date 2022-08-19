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
    
    public Alumno(){};

    public Alumno(int Cuenta, int AnioIngreso, String Padre, String Id, String Nombre, String Apellido, int Edad) {
        super(Id, Nombre, Apellido, Edad);
        this.Cuenta = Cuenta;
        this.AnioIngreso = AnioIngreso;
        this.Padre = Padre;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    public void setAnioIngreso(int AnioIngreso) {
        this.AnioIngreso = AnioIngreso;
    }

    public void setPadre(String Padre) {
        this.Padre = Padre;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public int getAnioIngreso() {
        return AnioIngreso;
    }

    public String getPadre() {
        return Padre;
    }
    
    
    
}
