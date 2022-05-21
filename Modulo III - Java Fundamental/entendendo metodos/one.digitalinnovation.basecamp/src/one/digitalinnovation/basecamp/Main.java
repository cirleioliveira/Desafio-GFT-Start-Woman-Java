/* EXERCICIO
Criar uma aplicação que resolva as seguintes situações:
*Calccule as 4 operações básicas: soma, subtração, multiplicação, divisão. Sempre 2 valores devem ser pasados.
* A partir da hora do dia, informe a mensagem adequado: Bom dia, Boa tarde e Boa noite.
*Calcule o valor final de um emprestimo a partir do valor solicitado. Taxas e parcelas influenciam. Dedina arbitrariamente as faixas que influenciam nos valores.
*/
package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtração(9,1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println();
        System.out.println("Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(24);

        System.out.println();
        System.out.println("Emprestimo");
        Emprestimos.calcular(1000, Emprestimos.getduasparcelas());
        Emprestimos.calcular(1000, Emprestimos.gettresparcelas());
        Emprestimos.calcular(1500, 2);
        Emprestimos.calcular(1000, 5);
    }
}