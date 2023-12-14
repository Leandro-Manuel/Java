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
	
	//método abaixo
	
	public void locomover() {
		System.out.println("Movimentou-se");
	}
	
	public void frear() {
		System.out.println("Freiou");
	}
	
	public void buzinar () {
		System.out.println("Buzinou");
	}
	
	public void desviar () {
		System.out.println("Desviou-se");
	}
	
}

