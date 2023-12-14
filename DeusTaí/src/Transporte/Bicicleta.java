package Transporte;

public class Bicicleta extends Nmotorizado{
	public Bicicleta (String nome, String modelo, String preco) {
		super(nome,modelo,preco);
	}
	int bracadeira;
	
	public void babalu() {
		System.out.println("deu um babalu!");
	}
	
	public void pedalar() {
		System.out.println("Pedalou!");
	}
}
