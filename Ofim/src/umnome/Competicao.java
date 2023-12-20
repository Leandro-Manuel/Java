package umnome;

public class Competicao {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta();
		
		t1.nome = "Leandro";
		t1.idade = 23;
		
		String aquecer = t1.Aquecer();
		System.out.println(t1.nome+ " tem " + t1.idade + " e foi aquecer!");

	}

}
