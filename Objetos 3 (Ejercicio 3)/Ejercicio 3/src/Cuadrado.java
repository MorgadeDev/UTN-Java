public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado)
    {
        super(lado,lado);
    }
    @Override
    public String toString()
    {
        System.out.println("El lado es: "+getAlto());
        return super.toString();
    }

}
