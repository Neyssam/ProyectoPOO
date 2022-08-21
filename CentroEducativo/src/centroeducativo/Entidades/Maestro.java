
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Maestro extends Persona
{
    private Float Salario;
    private Integer Telefono;

    public Maestro(Float Salario, Integer Telefono, Integer Identificador, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Genero, String Tipo)
    {
        super(Identificador, Nombre_1, Nombre_2, Apellido_1, Apellido_2, Genero, Tipo);
        this.Salario = Salario;
        this.Telefono = Telefono;
    }

    public Float getSalario()
    {
        return Salario;
    }

    public void setSalario(Float Salario)
    {
        this.Salario = Salario;
    }

    public Integer getTelefono()
    {
        return Telefono;
    }

    public void setTelefono(Integer Telefono)
    {
        this.Telefono = Telefono;
    }
    
    public Object[][] getTodosMaestros()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.Select("Persona", "Tipo", "Maestro");
        
        return Datos;
    }
}
