package Loops;

public class exercicio08 {

	public static void main(String[] args) {
		// Faça um programa que imprima na tela apenas os números ímpares entre 1 a 50.
		for (int i = 1; i <= 50;i=i+1) {
			if (i % 2 == 1) {
				System.out.println(i+" ");
			}else {
				continue;
			}
		}

	}

}
