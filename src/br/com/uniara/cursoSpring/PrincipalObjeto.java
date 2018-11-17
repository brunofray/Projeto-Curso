package br.com.uniara.cursoSpring;

import br.com.uniara.cursoSpring.representacao.Aluno;
import br.com.uniara.cursoSpring.representacao.Pessoa;
import br.com.uniara.cursoSpring.representacao.PessoaF;
import br.com.uniara.cursoSpring.representacao.PessoaJ;

public class PrincipalObjeto {
	public static void main(String[] args) {
		
		//ALUNO
		Aluno aluno1 = new Aluno();
		aluno1.ra = 8237;
		aluno1.idade = 25;
		aluno1.nome = "Julinho";
		
		System.out.println("Alunos: \n");
		
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("RA: " + aluno1.ra  + " \n ");
		
		Aluno aluno2 = new Aluno();
		aluno2.ra = 2145;
		aluno2.idade = 22;
		aluno2.nome = "Malaquias";
		
		System.out.println("Nome: " + aluno2.nome);
		System.out.println("Idade: " + aluno2.idade);
		System.out.println("RA: " + aluno2.ra + " \n ");
		
		//PESSOA
		
		PessoaF pessoaF = new PessoaF();
		pessoaF.cpf = 12345678900l;
		pessoaF.nome = "Jorge";
		pessoaF.endereco = "Rua uniara";
		
		PessoaJ pessoaJ = new PessoaJ();
		pessoaJ.cnpj = 123456789000000l;
		pessoaJ.nome = "Ronaldo Apresentacoes LTDA";
		pessoaJ.endereco = "Rua unip ";
		
		System.out.println("Pessoas: \n");
		
		System.out.println("Nome: " + pessoaF.nome);
		System.out.println("CPF: " + pessoaF.cpf);
		System.out.println("Endereço: " + pessoaF.endereco + " \n ");
		
		System.out.println("Nome: " + pessoaJ.nome);
		System.out.println("CNPJ: " + pessoaJ.cnpj);
		System.out.println("Endereço: " + pessoaJ.endereco + " \n ");
		
		// Teste get e set
		Pessoa p = new Pessoa();
		p.setIdade(-2);
		Pessoa p2 = new Pessoa();
		p2.setIdade(14);
		
	}
}
