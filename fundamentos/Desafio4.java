package fundamentos;
import java.util.Scanner;
//Faça um programa que leia um número e exiba o dia correspondente da semana fundamentos.
//1- domingo, 2- segunda, 3-terça... se digitar outro valor deve aparecer "valor inválido".

public class Desafio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		
		if (resp == 1) {
			System.out.println("Domingo!");
		}else if (resp == 2) {
			System.out.println("Segunda!");
		}else if (resp == 3) {
			System.out.println("Terça!");
		}else if (resp == 4) {
			System.out.println("Quarta!");
		}else if (resp == 5) {
			System.out.println("Quinta!");
		}else if (resp == 6) {
			System.out.println("Sexta!");
		}else if (resp == 7) {
			System.out.println("Sábado!");
		}else {
			System.out.println("Valor inválido!");
		}


}
}
