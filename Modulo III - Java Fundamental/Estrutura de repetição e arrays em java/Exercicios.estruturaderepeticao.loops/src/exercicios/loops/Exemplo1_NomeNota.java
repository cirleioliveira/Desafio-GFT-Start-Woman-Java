package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Exemplo1_NomeNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite um nome: ");
            String nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Digite a idade: ");
            int idade = scan.nextByte();
        }
        System.out.println("Continue aqui...");

    }
}
