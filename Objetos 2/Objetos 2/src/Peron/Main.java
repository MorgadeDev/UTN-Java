package Peron;




import Peron.Autor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese opcion:");
        int op=teclado.nextInt();

        switch (op)
        {
            case 1:
                Autor nuevo = new Autor();

                nuevo.setNombre("Joshua");
                nuevo.setApellido("Bloch");
                nuevo.setMail("joshua@gmail.com");
                nuevo.setGenero("M");

                nuevo.imprimir(nuevo);

                Libro EfJava = new Libro();

                System.out.println();
                EfJava.setTitulo("Effective Java");
                EfJava.setAutor(nuevo,0);
                EfJava.setPrecio(450);
                EfJava.setStock(150);

                EfJava.imprimir(EfJava);

                EfJava.setPrecio(500);
                EfJava.setStock(200);

                System.out.println("\nAutor desde Libro\n");

                EfJava.imprimirAutor(EfJava,1);

                EfJava.imprimirMensaje(EfJava);

                Autor autor2= new Autor();

                autor2.setNombre("Martin");
                EfJava.setAutor(autor2,1);

                EfJava.imprimirAutor(EfJava,2);

            case 2:

                Cliente prueba = new Cliente();


                prueba.setEmail("martin@gmail.com");
                prueba.setNombre("Martin");
                prueba.setPorcentaje(10);
                prueba.imprimirCLiente(prueba);

                Factura factu = new Factura();

                factu.setCliente(prueba);
                factu.setMonto(100);

                //factu.imprimirFactura(factu);

                System.out.println();
                System.out.println("Factura luego del descuento: ");
                double monto=factu.calculoDescuento(factu.getAux(),factu.getMonto());
                factu.setMonto(monto);

                //factu.imprimirFactura(factu);


                ItemVenta nuevoItem= new ItemVenta();
                nuevoItem.setNombre("Caramelos");
                nuevoItem.setPrecio(5);

                factu.setListaItems(nuevoItem,0);

                factu.imprimirFactura(factu);
            case 3:

                ClienteBanco client = new ClienteBanco();
                client.setNombre("Jorge");

                Cuenta accont = new Cuenta();
                accont.setBalance(10000);

                accont.setClient(client);

                System.out.println("El balance actual es: "+accont.getBalance());
                accont.depositar(100);
                System.out.println("El balance luego del deposito es: "+accont.getBalance());
                accont.extraer(500);
                System.out.println("El balance luego del extracto es: "+accont.getBalance());
                accont.extraer(10000);
                System.out.println("El balance luego del extracto es: "+accont.getBalance());
                accont.extraer(10000);

                accont.imprimirHistorial();
















        }







    }
}