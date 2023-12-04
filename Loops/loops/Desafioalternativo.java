package loops;

import java.util.Scanner;

public class Desafioalternativo {

	public static void main(String[] args) {
		
		double medias[] = new double[10];
		double notas[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner entrada = new Scanner(System.in);
		
		for (int x=0;x<10;x++) {
			System.out.println("Digite uma média: ");
			medias[x] = entrada.nextDouble();
		}
		
		for (int e =0;e<10;e++) {
			System.out.println(medias[e]);
		}
		
		for (double z : medias) {
			System.out.print(z+" ");
		}
		
		System.out.println(medias[3]);
	}

}
