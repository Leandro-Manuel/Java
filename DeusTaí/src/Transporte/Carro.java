package Transporte;

public class Carro extends Motorizado{
	public Carro (String nome, String modelo, String preco) {
		super(nome,modelo,preco);
	}
	
	 int Portas;
	 
	 String combustível;
	 
	 public void drift () {
		 System.out.println("Fez um drift!");
	 }

}
