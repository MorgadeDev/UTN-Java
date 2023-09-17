
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una opcion del sistema ");
        int op = teclado.nextInt();

        switch (op)
        {
            case 1:
            {
                double ancho =3;
                double largo =5;
                double area;
                double perimetro;

                Rectangulo rectangulo = new Rectangulo();
                rectangulo.setAncho(ancho);
                rectangulo.setLargo(largo);

                area = rectangulo.calcula(rectangulo.ancho,rectangulo.largo);

                perimetro = rectangulo.perimetro(rectangulo.ancho,rectangulo.largo);

                System.out.println("El Largo es: "+ rectangulo.largo + " El ancho es " + rectangulo.ancho);
                System.out.println("El area es: " + area + " El perimetro es: " + perimetro);

                Scanner input= new Scanner(System.in);

                System.out.println("Ingrese nuevo Largo: ");
                rectangulo.largo = input.nextDouble();
                System.out.println("Ingrese nuevo Ancho: ");
                rectangulo.ancho = input.nextDouble();

                area = rectangulo.calcula(rectangulo.ancho,rectangulo.largo);
                perimetro = rectangulo.perimetro(rectangulo.ancho,rectangulo.largo);

                System.out.println("El Largo es: "+ rectangulo.largo + " El ancho es " + rectangulo.ancho);
                System.out.println("El area es: " + area + " El perimetro es: " + perimetro);
            }break;

            case 2:
            {
                Empleado Carlos = new Empleado();

                Carlos.dni=23456345;
                Carlos.nombre="Carlos";
                Carlos.apellido= "Gutierrez";
                Carlos.salario= 25000;

                Carlos.mostrar1(Carlos.dni,Carlos.nombre,Carlos.apellido,Carlos.salario);

                Empleado Ana = new Empleado();

                Ana.dni=34234123;
                Ana.nombre= "Ana";
                Ana.apellido= "Sanchez";
                Ana.salario= 27500;

                Ana.mostrar1(Ana.dni,Ana.nombre,Ana.apellido,Ana.salario);


                System.out.println("El salario anual actual de Carlos es: "+Carlos.salarioAnual(Carlos.salario));
                Carlos.salario = Carlos.aumentoSalarial(15,Carlos.salario);
                System.out.println("El nuevo salario bajo 15% de aumento es: " + Carlos.salario);


            }break;

            case 3:
            {
                ItemVenta nuevo = new ItemVenta();

                nuevo.cantidad = 100;
                nuevo.id = 1;
                nuevo.descripcion =  "Autitos";
                nuevo.precio= 15;
                double total = nuevo.calcularPrecio(nuevo.cantidad,nuevo.precio);

                nuevo.imprimir(nuevo);


            }break;

            case 4:
            {
                Banco nuevo = new Banco();

                nuevo.nombre = "Felipe";
                nuevo.id = 123;
                nuevo.balance = 15000;

                System.out.println("El balance actual es: " + nuevo.balance);
                nuevo.Deposito(nuevo,2500);
                System.out.println("Deposito 2500: " + nuevo.balance);
                nuevo.Debito(nuevo,1500);
                System.out.println("Debito 1500: " + nuevo.balance);
                nuevo.Debito(nuevo,30000);
                System.out.println("Debito 30000: " + nuevo.balance);


            }break;


            case 5:
            {
                    Hora reloj = new Hora();

                    reloj.hora=0;
                    reloj.segundo=0;
                    reloj.minuto=0;

                    while(true)
                    {
                        reloj.imprimir(reloj);
                        reloj.aumentar(reloj);
                        Thread.sleep(10);
                    }

            }


            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }



    }
}