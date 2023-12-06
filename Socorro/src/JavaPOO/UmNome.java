package JavaPOO;

public class UmNome {
	

	public static void main(String[]args) {
		
		JavaMetodos Pessoa = new JavaMetodos();
		
		int age = Pessoa.idade();
		
		double amounty = Pessoa.valor();
		
		String nome = Pessoa.nome();
		
		boolean state = Pessoa.estado();
		
		System.out.printf("%s %s %s %s.",age,amounty,nome,state);
	}	
}

