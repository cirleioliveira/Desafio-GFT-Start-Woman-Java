programa
{ //tabuada de multiplicação
	
	funcao inicio()
	{
		inteiro contador, limite, resultado,num
		contador = 0
		limite = 0
		
		escreva("Informe o numero para calculo da tabuada que deseja: ")
		leia(num)
		escreva("Informe o limite que deseja calcular: ")
		leia(limite)
		
		faca{
			resultado = num * contador
			escreva(num + " x " + contador + " = " + resultado + "\n")
			contador ++
			
		}enquanto (contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */