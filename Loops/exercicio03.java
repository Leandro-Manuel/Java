//Programa em java que mostre os números pares
//Escreva um aplicativo em java que mostre todos os números pares de 1 até 100.
package Loops;

public class exercicio03 {

	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		}
		

	}

}
