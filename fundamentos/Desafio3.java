package fundamentos;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp1 = entrada1.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp2 = entrada2.nextDouble();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp3 = entrada3.nextDouble();
		
		if (resp1 > resp2 && resp1 > resp3) {
			System.out.println("Número 1 é o maior!");
			
		}else if (resp2 > resp3) {
			System.out.println("Número 2 é o maior!");
			
		}else {
			System.out.println("Número 3 é o maior!");
		}
		
		
		

	}

}
