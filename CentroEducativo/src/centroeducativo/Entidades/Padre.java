
package centroeducativo.Entidades;

import centroeducativo.BaseDatos.ManagerJavaPostgreSQL;


public class Padre extends Persona
{
    private Integer Telefono;

    public Padre(Integer Telefono, Integer Identificador, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Genero, String Tipo)
    {
        super(Identificador, Nombre_1, Nombre_2, Apellido_1, Apellido_2, Genero, Tipo);
        this.Telefono = Telefono;
    }

    public Integer getTelefono()
    {
        return Telefono;
    }

    public void setTelefono(Integer Telefono)
    {
        this.Telefono = Telefono;
    }
    
    public Object[][] getTodosPadres()
    {
        Object[][] Datos = null;
        
        ManagerJavaPostgreSQL managerDB = new ManagerJavaPostgreSQL();
        managerDB.Select("Persona", "Tipo", "Padre");
        
        return Datos;
    }
}
