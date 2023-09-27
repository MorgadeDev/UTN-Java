public class Main {
    public static void main(String[] args) {

        Rectangulo primero = new Rectangulo(10,5,"Rojo",true);

        primero.setArea(primero.calcularArea());
        primero.setPerimetro(primero.calcularPerimetro());

        System.out.println("\n El Rectangulo:");
        System.out.println(primero.toString());

        Circulo segundo = new Circulo(5,"Azul",true);

        segundo.setArea(segundo.calcularArea());
        segundo.setPerimetro(segundo.calcularPerimetro());

        System.out.println("\n El circulo:");
        System.out.println(segundo.toString());

        Cuadrado tercero = new Cuadrado(2);

        tercero.setArea(tercero.calcularArea());
        tercero.setPerimetro(tercero.calcularPerimetro());

        System.out.println("\n El cuadrado:");
        System.out.println(tercero.toString());






    }
}