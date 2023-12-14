package Transporte;

public class Cidade {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Opala","manual 2.0","32000");
		
		c1.Portas = 2;
		c1.motor = "2000";
		c1.combustível = "diesel";
		c1.Portas = 2;
		
		Bicicleta b1 = new Bicicleta("Caloi","Gravel","2500");
		
		b1.tracaoManual = "Leigo";
		b1.bracadeira = 1;
		
		b1.locomover();
		
		c1.ligar();
		c1.ligar();
		
		
		
		

	}
}
