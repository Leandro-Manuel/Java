package Polimorfismo;

public class Animais {
	
	String nome;
	String raca;
	
	public Animais (String nome,String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public void emitirSom() {
		System.out.println("Produziu som!");
	}
	
	public void comer() {
		System.out.println("Comeu!");
	}
	
	public void dormir() {
		System.out.println("Dormiu!");
	}
	
	public void respirar() {
		System.out.println("Respirar!");
	}
}
