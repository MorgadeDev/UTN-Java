public class Circulo extends Figuras {

    private double radio;

    public Circulo()
    {
        super();
    }
    public Circulo(double radio,String color,boolean coloreado)
    {
        super(color,coloreado);
        this.radio=radio;

    }
    public double calcularArea()
    {
        return Math.PI*Math.pow(radio,2);
    }

    public double calcularPerimetro()
    {
            return Math.PI*radio*2;
    }

    @Override
    public String toString()
    {
        System.out.println("Radio: "+radio);
        return super.toString();

    }

}
