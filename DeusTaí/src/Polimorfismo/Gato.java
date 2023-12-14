package Polimorfismo;

public class Gato extends Mamiferos{

	public Gato(String nome) {
		super(nome);
	}
	
	int qtdpatas;
	String pelagem;
	String cor;
	
	public void miar() {
		System.out.println("O gato miou!");
	}
	
	public void escalar() {
		System.out.println("O gato escalou!");
	}
	

}
