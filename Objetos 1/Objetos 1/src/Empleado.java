public class Empleado {

    int dni;
    String nombre;
    String apellido;
    double salario;
    public Empleado()//Constructor
    {

    }

public double salarioAnual(double salario)
{
  double resu;
  resu = salario*12;
  return resu;
}

public double aumentoSalarial(double porcentaje, double salario)
{
   double resu;
   double dato= porcentaje/10;
   resu =(salario*dato);

   return resu;
}
   public void mostrar1(int dni, String nombre,String apellido,double salario)
    {
        System.out.println("Empleado");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario: " + salario);
        System.out.println();

    }


}
