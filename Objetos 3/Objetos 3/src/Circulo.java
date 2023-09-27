public class Circulo{

    protected double radio; ///Protected significa que comparte los atributos con las subClases
    protected String color;

    public Circulo() {
        this.radio = 1;
        this.color = "Rojo";
    }

    public Circulo(double radio, String color) {

        this.radio = radio;
        this.color = color;
    }


    public double calcularArea() {
        double resu = (Math.pow(radio, 2)); ///Funcion para potencias
        return resu;
    }

    public String imprimir() {
        return "El radio es: " + radio + "\nEl color es: " + color;
    }

    public double calcularPerimetro()
    {
        return 2*Math.PI*radio;
    }


}

