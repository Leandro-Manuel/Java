// Para cada conjunto de valores abaixo, escreva o código Java, usando laços, que preencha um array com 
// os valores:

// a) 10 9 8 7 6 5 4 3 2 1
// b) 0 1 4 9 16 25 36 49 64 81
// c) 1 2 3 4 5 10 20 30 40 50
// d) 3 4 7 12 19 28 39 52 67 84



package loops;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[]a = new int[10];
		int[]b = new int[10];
		int[]c = new int[10];
		int[]d = new int[10];
		
		
		for (int i=0 ;i<a.length;i++) {
			System.out.println("Digite um número: ");
			a[i] = entrada.nextInt();
		}
		
		for (int x=0 ; x<b.length; x++) {
			
			System.out.println("Digite um número: ");
			b[x] = entrada.nextInt();	
		}
		
		for (int z =0 ; z<c.length; z++) {
			System.out.println("Digite um número: ");
			c[z] = entrada.nextInt();	
		}
		
		for (int y=0 ; y<d.length; y++) {
			System.out.println("Digite um número: ");
			d[y] = entrada.nextInt();
		} ;
		
		// prints
		
		for (int os : a) {
			System.out.print(os + " ");
		}
		
		System.out.println();
			
		for (int num : b) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		for (int ta : c) {
			System.out.print(ta + " ");
		}
		
		System.out.println();
		
		for (int oxe : d) {
			System.out.print(oxe + " ");
		}	
	}
}
