package Polimorfismo;

public class Cachorro extends Mamiferos {

	public Cachorro(String nome) {
		super(nome);	
	}
	
	int qtdpatas;
	String cor;
	String raca;
	
	public void latir() {
		System.out.println("O cachorro latiu!");
	}
	public void correr() {
		System.out.println("O cachorro correu!");
	}
}
