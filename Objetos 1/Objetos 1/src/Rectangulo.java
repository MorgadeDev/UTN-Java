public class Rectangulo {

    double ancho;
    double largo;

    public Rectangulo()// Constructor, metodos no
    {
       double ancho = 1;
       double largo = 1;
    }

    public double calcula(double ancho,double largo)
    {
        double resu;
        resu = ancho * largo;
        return resu;
    }

    public double perimetro(double ancho,double largo)
    {
        double resu=2*(ancho+largo);
        return resu;
    }


    public double getAncho(double ancho)
    {
        return ancho;
    }
    public double getLargo(double largo)
    {
        return largo;
    }

    public void setAncho(double dato) {
        this.ancho = dato;
    }

    public void setLargo(double dato)
    {
        this.largo=dato;
    }

    public void ejecutable()
    {


    }



}







