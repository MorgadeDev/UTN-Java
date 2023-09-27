

public class Persona {

    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;

    public Persona()
    {

    }
    public Persona(int dni,String nombre,String apellido,String email,String direccion)
    {

        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.direccion=direccion;
    }

}
