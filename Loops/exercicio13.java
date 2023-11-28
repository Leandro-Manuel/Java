package Loops;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x
		// de acordo com a seguinte regra:
		// se x é par, x = x / 2;
		// se x é ímpar, x = 3 * x + 1;
		// imprime x;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int nmr = entrada.nextInt();
		
		if (nmr % 2 == 0) {
			nmr = nmr / 2;
			System.out.println(nmr);
		}else {
			nmr = 3 * nmr + 1;
			System.out.println(nmr);
		}
		

	}

}
