# 4. INTRODUÇÃO AO GIT E AO GITHUB

## 1. ENTENDENDO O QUE É GIT E SUA IMPORTANCIA
Intrutor: Otávio Reis 

- bitKeep
- CVS
- GitLabvergan 

	    1 - Controle de versão;
	    2 - Armazenamento em nuvem;
	    3 - trabalho em equipe;
	    4 - Melhorar seu código;
	    5 - Reconhecimento.

## 2. NAVEGAÇÃO VIA COMMAND LINE INTERFACE E INSTALAÇÃO

###  COMANDOS BÁSICOS PARA UM BOM DESEMPENHO NO TERMINAL
#### GUI x CLI

O que vamos aprender?
- mudar de pasta
- listar as pastas
- criar pastas/arquivos
- deletar pastas/arquivos

### **COMANDOS WINDOWS**
	. cd // navegar nas pastas ex. cd windows, cd ..
	. dir //listas de diretorios "pastas"
	. mkdir //criar uma pasta "workspace" 
		para entrar na pasta >cd workspace
		echo Hello > hello.txt
	. del/rmdir //deleta a pasta "workspace", deleta conteuno da pasta
	. cls //limpar o terminal
	. tab //completa pasta
	. rmdir workspace /S /Q //excluit pasta

### REALIZANDO A INSTALAÇÃO DO GIT
Na instalação do git, escolher a opção abaixo
	() Git Credential Manager Core

### 3. ENTENDENDO COMO O GIT FUNCIONA POR BAIXO DOS PANOS
**Topicos fundamentais para entender o funcionamento do Git**

- SHA1: (Secure Hash Algoritm (Algoritmos de Hash seguro)), é um conjunto
	de funções hash criptográficas projetadas pela NSA 
	(Agencia de seguranca nacional dos EUA).
	A encriptação gera conjunto de caracteres identificador de 40 digitos.
	é uma forma curta de repesentar um arquivo
		**Ex.:**

            1. echo "ola mundo" | openss1 sha1
		    2. (stdin)= f9fc856e559b9501 ...

	**Exemplo:** usar git bash
    - open ssl shal text.txt

    - objetos fundamentais
    - sistema distribuido - O GIT é SD e seguro
    - segurança

* Objetos internos do Git

	    BLOBS
	    TREES
	    COMMITS

* Chave SSH e Token

Chave SSH
privado/privado

**github, clicar seta imagem "Setting", painel lado esquerdo "SSH and GPG keys"**
 ## Criar chave pelo Git Bash
	. ssh-keygen -t ed25519 -C email
	. cd /c/users/cirlei/.ssh/
	. ls
	. cat id_ed25519.pub 
	//chave vai aparecer logo abaixo, selecionar e copiar para usar no git


	. eval $(ssd-agent -s)
	//resposta é o numero de resposta Agent pid 1382
	. ssh-add id-ed25519 


## criar repositorio no github
	 git clone //mas link do ssh do github

## 4. PRIMEIROS COMANDO COM GIT - INICIANDO o git e criando um commit
 ### Comandos

	> git init
	> git add
	> git commit
	> ls // listar
	> cd workspace // nome da pasta


---
	control + l // limpar tudo

	> mkdir livro-receitas  "nome da pasta que deseja $ ls livro-receitas
	> cd livro-receitas
### Criar
	> git init
	> ls
	> ls -a // listar oculto
	> cd . git/ // visualisa a pasta
	> cd..

### Criar arquivo
	> git config --global user.email "shirley..."
	> git config --global user.name cirl...
	> git add *
	> git commit -m "commit inicial"

-------------------------
# Markdown 	-  tamanho dos titulos		
# Titulo nivel 1 
## Titulo nivel 2
### Titulo nivel 3
#### Titulo nivel 4
##### Titulo nivel 5
###### Titulo nivel 6
-----------------------------
### Navegador 

    Titulo nivel 1
    ...
    Titulo nivel 6
-----------------------------
     HTML
     <h1 > Titulo nivel 1 </h1 >
    ...
    <h6 > Titulo nivel 6 </h6 >
-----------------------------

    ** negrito **
    _italico_
    espaço "-" espaço //para lista
    buscar em ajudar para ver a formação de markdown


## 5. CICLO DE VIDA DOS ARQUIVOS NO GIT 
#### **PASSO A PASSO NO CICLO DE VIDA**
 tracked

  
  	
    |untracked          |unmodified             |	 modified       |    staged
    |		        |	  		|	                |
    |----add o arquivo ------------------------------>                  | >git add nome arquivo
    |	                |--edita arquivo-------	|	                | >git add *
    | <--remove arq-	|			|	                | >git add.
    |	    	        |		        |    <-commit---        | >git commit -m "msg.."


				     |------------------------|
				     |    servidor	      |
				     |    Remote repository   |
				     -------------------------


	|        Ambiente de desencolvimento          |	
	|---------------|-------------|---------------|
	|  working      |   staging   |   local       |
	| directory     |   area      |  respocitory  |
	|---------------|---------------------------- |
	| > git add     |    > git commit -m          |
	|---------------|-----------------------------|


	> ls 
	> git status
	> mkdir receitas //criar pasta
	> mv strogonof.md ./receitas //remover
	> ls
	> git status
	> git add strogonof.md receitas/
	> git status
	> git commit -m "criar pasta receitas, mover arquivo para receitas"
	> git status
	> echo > README.md
	> git status
	> git add *
	> git ls
	> git status
	> git commit -m "add index"


## 6. INTROCUÇÃO AO GITHUB - TRABALHANDO COM GITHUB


    > git config -- list //para ver as configurações no git

### Configurar git

    //Se o git estive configurado o comando abaixo apaga a config existente

	    > git config --global --unset user.email
	    > git config --global --unset user.nickname
-------------------------------------------------------
	> git config --global user.email "shirley..."
	> git config --global --unset user.name "cir..."
	> git config -- list

--------
	> git remote add origin https:// ....   //add o link
	> git remote -v
	> git status
	> git push origin master


## 7. RESOLVENDO CONFLITOS
- como os conflitos acontece no GitHub e comoresolve-los

### Add alteração
	> git ls
	> git status
	> git add *
	> git ls
	> git status
	> git commit - m "add receita pave"
	> git push origin master
	// ! foi regeitado
----------

	> git pull origin master // corrigir o arquivo
	> git status
	> git add . ou git add *
	> git commit -m "Resolve conflito"
	> git push origin master

### Clonar repositorio existente no GitHub pelo git
	> git clone https://github.com/....
	> ls
	> cd cpython/
	> ls -a   
	> git remote -v
