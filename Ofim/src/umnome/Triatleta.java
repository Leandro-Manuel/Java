package umnome;

public class Triatleta implements Ciclista,Nadador,Corredor{
	
	public Triatleta() {
		
	}

	public String Aquecer() {
		return "Foi aquecer!";
	}

	public String Correr() {
		return "Foi correr!";
	}

	public String Nadar() {
		return "Foi nadar!";
	}

	public String pedalar() {
		return "Foi pedalar!";
	}
}
