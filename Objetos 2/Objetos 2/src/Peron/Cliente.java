package Peron;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.time.*; //Contiene LocalDate, LocalTime y LocalDateTime
import java.time.format.*; // Contiene DateTimeFormatter;

public class Cliente {

    private int id;
    private String contra;

    private String nombre;

    private String email;

    private int porcentaje;

    public Cliente ()
    {
        this.contra=clave();
        this.id=id();
    }

/* Crear claves alfanumericas random....

       public static int numeroAleatorioEnRagno(int minimo, int maximo)
    {
        return ThreadLocalRandom.current().nextInt(minimo,maximo+1);
    }
    public static String contraAleatoria(int logintud)
    {
        String banco="abcdfghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String contra="";

        for(int x=0; x< logintud; x++)
        {
            int indiceAleatorio= numeroAleatorioEnRagno(0,banco.length()-1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            contra += caracterAleatorio;
        }
        return contra;
    }
*/

    public static final String clave()
    {
        String resultado=java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);

        return resultado;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void imprimirCLiente(Cliente dat)
    {
        System.out.println("Cliente:");
        System.out.println("ID: "+dat.getId());
        System.out.println("Nombre: "+dat.getNombre());
        System.out.println("Email: "+dat.getEmail());
        System.out.println("Descuento: "+dat.getPorcentaje()+"%");

    }


}
