package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Exemplo4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int par = 0, impar = 0;
        System.out.println("Digite a quantidade de numero: ");
        int qtdnumero = scan.nextInt();

        int contador = 0;

        do {
            System.out.println("Digite um numero ");
            int numero = scan.nextInt();

            if (numero % 2 == 0)
                par++;
            else impar++;

        contador++;
        }while (contador < qtdnumero);
        System.out.println("Quantidade par: " + par);
        System.out.println("Quantidade impar: " + impar);

    }
}
