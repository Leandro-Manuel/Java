package Loops;

public class exercicio07 {

	public static void main(String[] args) {
		//da mesma maneira, é possível obrigar o loop a executar o próximo laço.
		for (int i = 0; i < 100; i = i + 1) {
			if (i > 50 && i < 60) {
				continue; // volta o loop - para o laço e repete o laço - não vai para o print
			}
			System.out.println(i);
		}

	}

}
