package Peron;

import Peron.Autor;

import java.util.ArrayList;

public class Libro {

    private String titulo;
    private int precio;
    private int stock;

    private Autor Autores[] = new Autor[2];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutores(int posicion)
    {
        return Autores[posicion];
    }

    public void setAutor(Autor autor,int posicion) {
        Autores[posicion] = autor;
    }

    public void imprimir(Libro dato)
    {
        System.out.println("Libro");
        System.out.println("Titulo: "+dato.titulo);
        System.out.println("Precio: "+dato.precio);
        System.out.println("Stock: "+dato.stock);

        System.out.println("Autor (Nombre): "+dato.getAutores(0).getNombre());

    }

    public void imprimirAutor(Libro dato,int validos)
    {
        int val=0;
        while(val!=validos)
        {
            System.out.println("Autor:"+ dato.Autores[val].getNombre());
            val=val+1;
        }

    }

    public void imprimirMensaje(Libro dato)
    {
        System.out.println("“El libro, "+dato.titulo+" de "+ dato.Autores[0].getNombre()  +". Se vende a "+dato.precio+" pesos.”");

    }
}
