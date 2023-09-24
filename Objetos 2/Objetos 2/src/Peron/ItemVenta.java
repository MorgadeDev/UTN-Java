package Peron;
import java.util.concurrent.ThreadLocalRandom;

public class ItemVenta {

    private int id;
    private String nombre;
    private String descripcion;

    private int precio;

    public ItemVenta()
    {
        this.id=id;

    }

    public static final int id()
    {
        int resultado=java.util.UUID.randomUUID().hashCode();
        if(resultado<0)
        {
            resultado=resultado*(-1);
        }
        return resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
