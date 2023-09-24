package Peron;

public class Autor {

    private String nombre;
    private String apellido;
    private String mail;
    private String genero; //(M o F)

    public Autor()
    {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimir(Autor dato)
    {
        System.out.println("Autor");
        System.out.println("Nombre: "+dato.nombre);
        System.out.println("Apellido: "+dato.apellido);
        System.out.println("Mail: "+dato.mail);
        System.out.println("Genero: "+dato.genero);

    }


}
