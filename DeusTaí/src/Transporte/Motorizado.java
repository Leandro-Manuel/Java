package Transporte;


public class Motorizado extends Veiculos {
	
	public Motorizado (String _nome, String modelo, String preco) {
		
		super(_nome, modelo, preco);
	}
	
	public String motor;
	
	public void passarmarcha() {
		System.out.println("Passou a marcha");
	}
	
	public void ligar() {
		
		Boolean ligado = false;
		
		if (ligado == false) {
			System.out.println("Ligou o veiculo!");
			ligado = true;
			
		}else {
			System.out.println("O veiculo já está ligado!");
		}
	}
	
	public void desligar() {
		
		System.out.println("Desligou o veículo");
	}

}
