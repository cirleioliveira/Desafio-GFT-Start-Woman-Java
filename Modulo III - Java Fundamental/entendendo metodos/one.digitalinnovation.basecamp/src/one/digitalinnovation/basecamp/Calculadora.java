package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("Total da soma de " + num1 + " + " + num2 + " = " + resultado);
    }

    public static void subtração(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Total da subtração é: " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Total multiplicão: " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void divisao (double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Total da divisão: " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
