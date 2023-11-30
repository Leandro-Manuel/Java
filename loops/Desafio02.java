package loops;

import java.util.Scanner;

// Escreva um código que receba uma nota de 5 alunos, guarde todas num array notas.
// depois calcule a média da turma.

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [] notas = new double[5];
		double soma = 0;
		
		for (int x = 0; x < notas.length;x++) {
			System.out.println("Digite a nota do aluno: ");
			notas[x] = entrada.nextDouble();
			soma += notas[x];
		}
		
		double media = (soma / 5);
		
		System.out.println("A media da turma foi: " + media);
	

	}

}
