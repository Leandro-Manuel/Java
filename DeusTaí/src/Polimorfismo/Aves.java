package Polimorfismo;

public class Aves extends Animais{

	public Aves(String nome) {
		super(nome);
	}
	
	String corPena;
	int qtdAsas;
	
	public void cantar() {
		System.out.println("A ave cantou!");
	}

}
