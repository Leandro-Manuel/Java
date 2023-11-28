
//leia duas notas tira a media e diga se o aluno foi reprovado, está em recuperação ou foi aprovado!
package fundamentos;
import java.util.Scanner;
public class Desafio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite um número: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media < 4) {
			System.out.println("Aluno reprovado!");
		}else if (media < 7 && media >= 4) {
			System.out.println("Aluno em recuperação!");
		}else {
			System.out.println("Aluno aprovado!");
		}
		
		
		
		
	
	}

}
