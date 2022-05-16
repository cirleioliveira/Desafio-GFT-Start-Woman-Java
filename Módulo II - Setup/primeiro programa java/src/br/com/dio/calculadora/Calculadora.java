package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b); //ctrl+1
		double subtracao = subtracao(a, b); //ctrl+2
		double divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Sutracao: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicacao: " + multiplicacao);
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}//ctrl+alt+seta para baixo
