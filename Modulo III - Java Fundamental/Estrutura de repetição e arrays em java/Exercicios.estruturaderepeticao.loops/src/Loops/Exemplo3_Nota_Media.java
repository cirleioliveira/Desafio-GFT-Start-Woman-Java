package Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Exemplo3_Nota_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0, contador = 0, maior = 0;

        do {
        System.out.println("Digite uma nota: ");
        int nota = scan.nextInt();
        soma = soma + nota;

        if (nota > maior)
            maior = nota;

        contador++;
        }while (contador<3);

        System.out.println("Media: " + soma/contador);
        System.out.println("Maior: " + maior);
    }
}
