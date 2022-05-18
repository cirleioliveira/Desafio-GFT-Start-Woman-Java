package br.com.dio;

import br.com.dio.model.Gato; // Sift+Atl+o para limpar o import que esta sem uso.

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) { //main + Ctrl+espaço
       Gato gato = new Gato(); // fazer import Alt+enter
       System.out.println(gato);

        Livro livro = new Livro("O Senhor dos aneis", 300);
        System.out.println(livro);


        /*int a = 5;
       int b = 3;
        System.out.println("Hello World " + (a+b));*/ // sout + Ctrl+espaço


    }
}

class Livro{
   private String nome;
   private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
    // TECLAS DE ATALHO
//Ctrl + Shift + f10 para compilar.
// no "Eclipse" Selecione o bloco presione as teclas Ctrl+shir+c
// Selecione o bloco presione as teclas Ctrl+shir+/ ou Ctrl+/
//relatorar ex. classe Shitf+F6 "primeiro-programa"
// editor de texto shift+F12
// ordenar alinhamento Eclipse Ctrl+shift+6
// ordenar alinhamento Eclipse Ctrl+Alt+6
// duplicar linha ctrl+d
// apagar linha ctrl+y
// trocar linha ou bloco de lugar Ctrl+sift + seta cimna/baixo
// www.basef.com.br/index.php/Atalhos_do_IntelliJ-Idea
}

