
package centroeducativo.Entidades;


public class Persona
{
    private Integer Identificador;
    private String Nombre_1;
    private String Nombre_2;
    private String Apellido_1;
    private String Apellido_2;
    private String Genero;
    private String Tipo;

    //public Persona(){}
    
    public Persona(Integer Identificador, String Nombre_1, String Nombre_2, String Apellido_1, String Apellido_2, String Genero, String Tipo)
    {
        this.Identificador = Identificador;
        this.Nombre_1 = Nombre_1;
        this.Nombre_2 = Nombre_2;
        this.Apellido_1 = Apellido_1;
        this.Apellido_2 = Apellido_2;
        this.Genero = Genero;
        this.Tipo = Tipo;
    }

    public Integer getIdentificador()
    {
        return Identificador;
    }

    public void setIdentificador(Integer identificador)
    {
        this.Identificador = identificador;
    }

    public String getNombre_1()
    {
        return Nombre_1;
    }

    public void setNombre_1(String Nombre_1)
    {
        this.Nombre_1 = Nombre_1;
    }

    public String getNombre_2()
    {
        return Nombre_2;
    }

    public void setNombre_2(String Nombre_2)
    {
        this.Nombre_2 = Nombre_2;
    }

    public String getApellido_1()
    {
        return Apellido_1;
    }

    public void setApellido_1(String Apellido_1)
    {
        this.Apellido_1 = Apellido_1;
    }

    public String getApellido_2()
    {
        return Apellido_2;
    }

    public void setApellido_2(String Apellido_2)
    {
        this.Apellido_2 = Apellido_2;
    }

    public String getGenero()
    {
        return Genero;
    }

    public void setGenero(String Genero)
    {
        this.Genero = Genero;
    }

    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String Tipo)
    {
        this.Tipo = Tipo;
    }
}
