// crie dois arrays de tamanho 5. o primeiro peça ao usuario os valores e preencha. 
// os valores do segundo array, deverá ser o valor do primeiro array de acordo com o indice e multiplique
// o valor por dois

//o 3 array deverá ser a soma dos dois arrays anteriores.

package loops;

import java.util.Scanner;

public class Desafioalternativo2 {

	public static void main(String[] args) {
		
		int abbc[] = new int[5];
		int mtp2x[] = new int[5];
		
		int soma[] = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int x = 0; x < 5; x++) {
			System.out.print("Digite um valor inteiro: ");
			abbc[x] = entrada.nextInt();
		}
		
		for (int y = 0; y < 5; y++) {
			mtp2x[y] = abbc[y] * 2;
		}
		
		for (int z = 0; z < 5; z++) {
			soma[z] = abbc[z] + mtp2x[z];
		}
		
		for (int j = 0; j < 5; j++) {
			System.out.print(mtp2x[j]+" ");
		}
		
		System.out.println(); 
		
		for (int k = 0; k < 5; k++) {
			System.out.print(soma[k] + " ");
		}
		
//for (int o : soma) {
//System.out.print(o + " ");
//

	}

}
