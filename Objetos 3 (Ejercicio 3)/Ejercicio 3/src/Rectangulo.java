
public class Rectangulo extends Figuras{

    private double largo;
    private double alto;

    public Rectangulo(double largo,double alto)
    {
        super();
        this.largo=largo;
        this.alto=alto;
    }
    public Rectangulo(double largo,double alto,String color,boolean coloreado)
    {
        super(color,coloreado);
        this.largo=largo;
        this.alto=alto;
    }

    public double calcularArea()
    {
        return largo*alto;
    }

    public double calcularPerimetro()
    {
        return (largo*2)+(alto*2);
    }

    @Override
    public String toString()
    {
            System.out.println("Largo: "+largo+"\nAlto: "+ alto);
        return super.toString();

    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
