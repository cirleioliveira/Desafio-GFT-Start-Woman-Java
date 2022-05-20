/*
Desafio 1

Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).

Entrada
A entrada contém 2 valores inteiros.
Saída

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("informe o segundo valor: ");
        B = sc.nextInt();

        PROD = A * B; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD    );

        sc.close();

    }
}