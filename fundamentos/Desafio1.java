package fundamentos;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		double resp = entrada.nextDouble();
		
		if (resp > 0) {
			System.out.println("É um número positivo!");
		}else {
			System.out.println("É um número negativo!");
		}
			
			
		System.out.println(resp);
		
		

	}

}
