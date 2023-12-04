package loops;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Desafio4 {

	public static void main(String[] args) {
		//Faça um programa que, a partir de um texto digitado pelo usuario, conte o numeros de palavras
		//(palavra é definida por qualquer sequência de caracteres delimitada por espaços em branco)
		// e exiba o resultado
		
		String texto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		
		texto = entrada.toString();
		
		StringTokenizer frase = new StringTokenizer(texto);
		
		System.out.println(frase.countTokens());
		
		// compare os 2 textos abaixo e diga se são iguais.
		
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean b1 = texto01.equals(texto02);
		
		System.out.println(b1);
		
		//Faça um programa que receba de um usuario, um texto e exiba esse texto em letras maiusculas.
		
		String texto03 = "sou lindo";
		
		String resultado00 = texto03.toUpperCase();
		
		System.out.println(resultado00);
		
		

	}

}
