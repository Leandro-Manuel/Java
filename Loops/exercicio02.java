//Escreva um aplicativo em Java que mostre todos os números ímpares de 1 até 100.
// ou poderia usar no if: if (x % 2 == 1)
package Loops;

public class exercicio02 {
	

	public static void main(String[] args) {
		int x = 1;
		while (x <= 100 ) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
			x++;
		}
		

	}

}
