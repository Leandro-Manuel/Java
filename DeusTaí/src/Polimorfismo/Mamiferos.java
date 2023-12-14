package Polimorfismo;

public class Mamiferos extends Animais{

	public Mamiferos(String nome,String raca) {
		super(nome, raca);
	}
	int qtdMamas;
	
	public void mamar() {
		System.out.println("O mamifero mamou!");
	}
	
}
