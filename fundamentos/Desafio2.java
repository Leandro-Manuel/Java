package fundamentos;
import java.util.Scanner;


// faça um código para verificar se um número é positivo, negativo ou neutro.
public class Desafio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		
		
		
		System.out.println(resp == 0 ? "Neutro!" : resp > 0 ? "Positivo!" : "Negativo!");
		// se resp == 0 faça "Neutro" senao se resp > 0 faça "positivo" senao "Negativo!"
}
}