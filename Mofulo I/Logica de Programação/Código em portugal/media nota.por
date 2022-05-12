programa
{ //calcular media artimetica
	
	funcao inicio()
	{
		real nota1,nota2,nota3,nota4,soma,media
		cadeia aluno,sobrenome
		inteiro idade

		escreva("Digite o nome do aluno: ")
		leia(aluno)
		escreva("Digite seu sobrenome: ")
		leia(sobrenome)
		escreva("Digite sua idade: ")
		leia(idade)

		
		escreva("Digite a nota 1: ")
		leia(nota1)
		escreva("Digite a nota 2: ")
		leia(nota2)
		escreva("Digite a nota 3: ")
		leia(nota3)
		escreva("Digite a nota 4: ")
		leia(nota4)

		soma = nota1+nota2+nota3+nota4
		media = soma/4

		escreva("O aluno: " + aluno + " " + sobrenome + ". A sua idade é: " 
		+ idade + ". A soma da sua nota é: " + soma + ". A sua media é: " + media)

	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */