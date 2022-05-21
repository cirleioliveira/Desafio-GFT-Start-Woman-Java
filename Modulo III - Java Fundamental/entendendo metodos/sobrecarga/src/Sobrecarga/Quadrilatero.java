package Sobrecarga;

public class Quadrilatero {

    public static void area(double area){
        double totalArea = area * area;
        System.out.println("Total area do quadrado: " + totalArea);
    }

    public static void area(double base, double altura){
        double totalArea = base * altura;
        System.out.println("Total da area do retangulo: " + totalArea);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        double totalTrapezio = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Total da area do trapezio: " + totalTrapezio);
    }

    public static void area(float diagonalMaior, float diagonalMenor){
        float totalLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Total da area do losango: " + totalLosango);
    }


}
