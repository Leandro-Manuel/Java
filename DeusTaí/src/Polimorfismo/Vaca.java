package Polimorfismo;

public class Vaca extends Mamiferos{

	public Vaca(String nome,String raca) {
		super(nome,raca);
	}
	
	int qtdChifre;
	
	public void emitirSom() {
		System.out.println("A vaca está murgindo!");
	}

}
