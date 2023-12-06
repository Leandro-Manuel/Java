package JavaPOO;

public class Carro {
	
	 String cor;
	 double preco;
	 String modelo;
	
		public Carro(double preco, String modelo) {
			
			this.cor = "Preto";
			this.modelo = modelo;
			this.preco = preco;
		}
			
		public Carro(String cor, String modelo, double preco) {
			
			this.cor = cor;
			this.preco = preco;
			this.modelo = modelo;
		}
}



