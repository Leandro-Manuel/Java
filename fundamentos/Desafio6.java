package fundamentos;
import java.util.Scanner;
/*Faça um programa que verifique (usando if e else) se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino*/

public class Desafio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'F') {
			System.out.println("Feminino!");
		}else if(letra == 'M') {
			System.out.println("Masculino!");
		}else {
			System.out.println("Letra inválida!");
		}
		
		

	}

}
