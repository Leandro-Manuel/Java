// Escreva um programa que calcule a soma dos multiplos de 3 e 5, no intervalo entre 1 e 20. 
// No final, mostre a soma dos multiplos de 3  5 e a soma total.

package loops;


public class exercicio01 {

	public static void main(String[] args) {
		
		int soma3 = 0, soma5 = 0;
		
		for(int i=1;i<=20;i++) {
			if (i % 3 == 0) {
				soma3 += i;
				
			}
		}
		
		for (int x=1;x<=20;x++) {
			if (x % 5 == 0) {
				soma5 += x;
			}
		}
		
		int somatotal = soma3 + soma5;
		
		System.out.println("A soma dos multiplos de 3 e: " + soma3);
		
		System.out.println("A soma dos multiplos de 5 e: " + soma5);
		
		System.out.println("A soma total dos multiplos e: " + somatotal);
	}

}
