package exercicios.loops;

import java.util.Scanner;

public class Exemplo5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para calcular tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }
    }
}
