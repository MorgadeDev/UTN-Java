public class ItemVenta {

    int id;
    String descripcion;
    int cantidad;
    double precio;

    public double calcularPrecio(int cantidad, double precio)
    {
        double resu;
        resu = cantidad*precio;
        return resu;
    }

    public void imprimir(ItemVenta uno)
    {
        System.out.println("ItemVenta:");
        System.out.println("ID: "+ uno.id);
        System.out.println("Descripcion: " + uno.descripcion);
        System.out.println("Cantidad: " + uno.cantidad);
        System.out.println("P.Unitario: " + uno.precio);
        System.out.println("P.Total: " + calcularPrecio(uno.cantidad,uno.precio));
    }

    
    


}
