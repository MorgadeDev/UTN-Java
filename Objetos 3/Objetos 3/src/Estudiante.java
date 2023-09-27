

public class Estudiante extends Persona {

    private int anioIngreso;
    private int cuota;
    private String carrera;

    public Estudiante()
    {}

    public Estudiante(int anioIngreso,int cuota,String carrera,String nombre,int dni,String apellido,String direccion,String email)
    {
        super(dni,nombre,apellido,direccion,email);
        this.anioIngreso=anioIngreso;
        this.cuota=cuota;
        this.carrera=carrera;
    }

    public String toString()
    {
        return "\nAnio ingreso: "+anioIngreso+"\nCuota: "+cuota+"\nDNI: "+dni+
                "\nNombre: "+nombre+"\nApellido: "+apellido+"\neMail: "+email+
                "\nDireccion: "+direccion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
