package br.com.uniara.cursoSpring.decisoesRepeticoes;

public class Aplicacao {

	public static void main(String[] args) {
		executaIf(false);
		executaIfVarias(45);
		switchCase('d');
		repeticaoFor(10);
		repeticaoWhile(5);
		repeticaoDoWhile(100);
	}
	
	public static void executaIf(boolean bo) {
		
		if(bo) {
			System.out.println("Caiu o verdadeiro");
		} else {
			System.out.println("Caiu o falso");
		}
	}
	public static void executaIfVarias(int idade) {
		
		if (idade < 0) {
			System.out.println("Impossivel");
		} else if (idade == 0) {
			System.out.println("Idade zerada");
		} else {
			System.out.println("Idade então é: " + idade);
		}
	}
	public static void switchCase(char c) {
		
		switch (c) {
		case 'a':
			System.out.println("é a");
			break;
		case 'b':
			System.out.println("é b");
			break;
		default:
			System.out.println("Sou default");
			break;
		}
	}
	public static void repeticaoFor(int numero) {
		for (int i = 0; i < numero; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
	}
	public static void repeticaoWhile(int numero) {
		while(numero < 100) {
			System.out.println(numero);
			numero += 10;	
		}
		System.out.println("\n");
	}
	public static void repeticaoDoWhile(int numero) {
		do {
			System.out.println(numero);
			numero+= 10;
		}while(numero < 100);
		System.out.println("\n");
	}
	public static void lista() {
		int inteiroNormal;
		int[] inteiroDiferentao = null;
		
		inteiroDiferentao[0] = 1;
		inteiroDiferentao[1] = 4;
		inteiroDiferentao[2] = 9;
		
		for (int i : inteiroDiferentao) {
			System.out.println(inteiroDiferentao[i]);
		}
	}
}
