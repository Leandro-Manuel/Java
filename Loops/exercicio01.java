package Loops;

import java.util.Scanner;

//Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele. 
//Em seguinda, através de um laço while, pede ao usuário para que digite as notas de todos os
// alunos da sala, um por vez.

public class exercicio01 {
	public static void main(String[] args) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na sua sala?");
		double alunos = entrada.nextDouble();
		
		while (numero < alunos) {
			System.out.println("Digite a nota do aluno:");
			double notas = entrada.nextDouble();
			System.out.println(notas);
			numero+=1;
			
			
		}
		
		

}
}
