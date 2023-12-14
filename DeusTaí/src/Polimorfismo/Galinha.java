package Polimorfismo;

public class Galinha extends Aves{

	public Galinha(String nome) {
		super(nome);
	}
	
	String raca;
	
	public void botarOvo() {
		System.out.println("A galinha botou ovo!");
	}
}
