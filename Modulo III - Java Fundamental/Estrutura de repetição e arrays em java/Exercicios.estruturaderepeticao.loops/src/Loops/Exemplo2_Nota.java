package Loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Exemplo2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma nota: ");
        int nota = scan.nextInt();

        while (nota < 0 | nota >= 10){
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }



}
