package Éverdade;

public class Pet {
	
	private String nome;
	private String animal;
	private int idade;
	
	public Pet (String nome, String animal,int idade) {
		
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;	
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
