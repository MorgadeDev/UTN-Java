public class Figuras {

    private String color;
    private boolean coloreado;
    private double area;
    private double perimetro;
    public Figuras()
    {
    }
    public Figuras(String color,boolean coloreado)
    {
        this.color=color;
        this.coloreado=coloreado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColoreado() {
        return coloreado;
    }

    public void setColoreado(boolean coloreado) {
        this.coloreado = coloreado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String toString()
    {
        return "Color: "+color+"\nColoreado?: "+coloreado+"\nArea: "+area+"\nPerimetro: "+perimetro;
    }

}
