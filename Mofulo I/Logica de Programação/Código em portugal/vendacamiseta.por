programa
{ //calcular desconto camiseta
	
	funcao inicio()
	{
		real camiseta1, camiseta2, total,descp,descontoreal, totalpagar,desconto
		//caddeia e para string

		escreva("digite o valor da camisseta 1: ")
		leia(camiseta1)
		escreva("digite o valor da camisseta 2: ")
		leia(camiseta2)
		escreva("Informe valor desconto: ")
		leia(desconto)

		total=camiseta1+camiseta2
		//descp=total*0.2
		descp=total*desconto/100
		totalpagar=total-descp

		escreva("Total: " + total)
		escreva("\n" + "Desconto: " + descp)
		escreva("\n" + "valor total a pagar: " + totalpagar)
		escreva("\n")


//media de venda do funcionario jan a abril, somar vendar, calcular media, exibir total de venda e media
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */