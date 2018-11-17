package br.com.uniara.cursoSpring.representacao;

public class Pessoa {
	//Pessoa como um todo
	public String nome;
	public String endereco;
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Impossivel");
		} else {
			this.idade = idade;
			System.out.println("Idade: " + this.idade);
		}
	}
}
