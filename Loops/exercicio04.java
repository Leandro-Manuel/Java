//Escreva um aplicativo em java que recebe inteiro e mostre os números pares e ímpares separados, de 1 até esse inteiro.
package Loops;

public class exercicio04 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.print(x+" ");
			}
			x+=1;
		}
		System.out.println();
		
		while (y <= 100) {
			if (y % 2 == 1) {
				System.out.print(y+" ");
			}
			y+=1;
		}
			
		

	}

}
