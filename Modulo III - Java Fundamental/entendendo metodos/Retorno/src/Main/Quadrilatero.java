package Main;

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double base, double altura){
        return base * altura;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonalMaior, float diagonalMenor){
       return (diagonalMaior * diagonalMenor) / 2;
    }
    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }
}
