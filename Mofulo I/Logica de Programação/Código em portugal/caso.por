programa
{
	
	funcao inicio()
	{
		/*
		//utiliza comando 'se' para escolha
		escreva("1 - abrir Netflix 2 - abrir Amazon Prime 3 - Abrir HBO GO 4 - Sair")
		inteiro menu = 0
		escreva("\n" + "Sua opção: ")
		leia(menu)
		
		
		se(menu==1){
			escreva("Ok! Abrir Netflix!")
		}

		se(menu==2){
			escreva("Ok! Abrir Amazon Prime!")
		}

		se(menu==3){
			escreva("Ok! Abrir HBO GO!")
		}*/

		escreva("\n" + "Escolha uma das opções: ") 
		escreva("\n" + "1 - abrir Netflix")
		escreva("\n" + "2 - abrir Amazon Prime")
		escreva("\n" + "3 - Abrir HBO GO")
		escreva("\n" + "4 - Sair")
		inteiro menu = 0

		escreva("\n" + "Sua escolha: ")
		leia(menu)
		
		escolha(menu){
			
		caso 1: //testar se o valor é igual a 1
		escreva("Ok! Abrir Netflix!")
		pare

		caso 2:
		escreva("Ok! Abrir Amazon Prime!")
		pare

		caso 3:
		escreva("Ok! Abrir HBO GO!")
		pare

		caso 4:
		escreva("saindo do menu....")
		pare

		caso contrario:
		escreva("Você deve escolher as opções 1, 2, ou 3")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */