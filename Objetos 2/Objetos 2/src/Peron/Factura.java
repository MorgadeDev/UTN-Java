package Peron;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.time.format.*;



public class Factura {


    ItemVenta listaItems[] = new ItemVenta[2];
    private int id;

    public ItemVenta[] getLista() {
        return listaItems;
    }

    public void setListaItems(ItemVenta lista,int posicion) {
        this.listaItems[posicion] = lista;
    }

    private double monto;

    LocalDate isoFecha = LocalDate.now();

    LocalTime isoHora = LocalTime.now();

    private Cliente aux;

    public Factura()
    {
        this.id=id();
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
    public void setCliente(Cliente aux)
    {
        this.aux=aux;
    }

    public Cliente getCliente()
    {
        return aux;
    }

    public void imprimirFactura(Factura clas)
    {
        System.out.println();
        System.out.println("Factura para: " +clas.aux.getNombre());
        System.out.println("Monto: " +clas.monto);
        System.out.println("ID: " + clas.id);
        System.out.println("Fecha: "+ clas.isoFecha);
        System.out.println("Hora: "+ clas.isoHora);
        System.out.println("Items: "+clas.listaItems[0].getNombre());
    }

    public double calculoDescuento(Cliente aux,double monto)
    {
        double resu = monto-((monto * aux.getPorcentaje())/100);
        return resu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public LocalDate getIsoFecha() {
        return isoFecha;
    }

    public void setIsoFecha(LocalDate isoFecha) {
        this.isoFecha = isoFecha;
    }

    public LocalTime getIsoHora() {
        return isoHora;
    }

    public void setIsoHora(LocalTime isoHora) {
        this.isoHora = isoHora;
    }

    public Cliente getAux() {
        return aux;
    }

    public void setAux(Cliente aux) {
        this.aux = aux;
    }
}
