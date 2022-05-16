package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;
	
	//criar construtor teclado: Ctrl + 3 - digitar constru "generation construtor using ...
	public Gato() {
	}

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	//Criar setters e gets: digitar Ctrl + 3 pequisar: ggas

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	//criar equals e hashCode
	
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	//criar toString

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	
	
	

}
