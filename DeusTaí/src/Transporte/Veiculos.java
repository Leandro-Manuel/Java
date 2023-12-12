package Transporte;


public class Veiculos {
	
	public String nome;
	public String modelo;
	public String preco;
	
	public Veiculos (String nome, String modelo, String preco){
		
		this.nome = nome;
		this.modelo = modelo;
		this.preco = preco;
	}
	//metodo abaixo
	public void locomover() {
		System.out.println("Movimentou-se");
		
	}
}

