package br.com.uniara.cursoSpring;

public class Principal {
	
	public static int somar(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " e " + num2 + " tem como resultado: " + resultado);
		return resultado;
	}
	
	public static void main(String[] args) {
		somar(22,30);
		
		//Exemplo metodos
		double casaDecimal1 = 0.0;							//Casas decimais
		float casaDecimal2 = 0.0f;							//Casas decimais menores com f no final
		String texto = "funciona bem por demais";			//Aceita um grupo de caracteres
		String textoDouble = "21.85";
		String texto2 = new String("a");					//String estanciada
		char caractere = 'k';								//Aceita um caractere
		long intMaior = 1234941209582323451l;				//Aceita numeros maiores inteiros com l no final
		int inteiro = 1111111111;							//Numeros inteiros ate 10 casas
		short pequeno = 32767;								//Aceita ate o numero 32767
		byte menorQuePequeno = 127;							//Aceita ate o numero 127	
		boolean bool1 = true;
		boolean bool2 = false;
		
		//Casas uteis
		casaDecimal1 = Double.parseDouble(textoDouble);
		System.out.println(casaDecimal1);
		Integer wrapperLong;
		Long wrapperFloat;
		short wrapperShort;
		Character wrapperChar;
		Byte wrapperByte;
		
		
	}
}
