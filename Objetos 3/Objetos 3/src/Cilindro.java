

public class Cilindro extends Circulo { ///Esto quiere decir que la clase cilindro es una sub clase de Circulo

    private double altura;


    public Cilindro()
    {
        super();
        this.altura=1;

    }

    public Cilindro(double altura, double radio,String color)
    {
        super(radio,color);
        this.altura=altura;
        
    }


    public double volumen()
    {
        double resu=Math.PI*super.calcularArea()*altura; //Llamando a super, estoy utilzando metodos de la clase Padre
        return resu;
    }

    public String imprimirCilindro()//Metodo toString
    {
        return "\n\nSubClase de: "+ super.imprimir()+"\nAltura: "+ altura + "\nVolumen: "+ volumen();

    }
    @Override//El override se utiliza para sobreescribir una funcion de una clase Padre para poder utilizarla en la Clase hijo sin tener que cambiar el nombre
    public double calcularArea()
    {
        double resu= 2*Math.PI *radio*altura + 2*Math.PI*Math.pow(radio,2);
        return resu;
    }

}
