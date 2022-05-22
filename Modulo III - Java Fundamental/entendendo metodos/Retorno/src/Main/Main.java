package Main;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicios");
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Total area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,7d);
        System.out.println("Total da area do retangulo: " + areaRetangulo);

        double areaTrapesio =  Quadrilatero.area(3,2,5);
        System.out.println("Total da area do trapezio: " + areaTrapesio);

        double areaLosango = Quadrilatero.area(5f,6f);
        System.out.println("Total da area do losango: " + areaLosango);

    }
    /*cria uma aplicação que calcula a área dos 3 quadrilateros
     * notavel: quadrado, retangulo e trapezio
     * use sobrecarga.*/
}
