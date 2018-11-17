package br.com.uniara.cursoSpring.polimorfismo;

public class PrincipalAnimal {
	
	public static void main(String[] args) {
		Leao leao = new Leao();
		leao.emitirSom();
		
		Peixe peixe = new Peixe();
		peixe.emitirSom();
		
		emitirSomAnimal(leao);
	}
	
	private static void emitirSomAnimal(Animal animal) {
		animal.emitirSom();
	}
}
	
