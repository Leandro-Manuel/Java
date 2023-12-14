package Transporte;

public class Moto extends Motorizado{
	
	public Moto (String nome, String modelo, String preco) {
		super(nome,modelo,preco);
	}
	
	public String cortavento;
	
	public void Dargrau() {
		System.out.println("Deu um grau!");
	}
}
