package Membros;

import java.util.Date;

// professor, aluno, funcionario. 

public class Escola {

	public static void main(String[] args) {
		
		Aluno i = new Aluno("jose Francisco","129.523.064-00", new Date());
		
		System.out.println("Veja como os atributos foram preenchidos \n \n Nome: " + i.nome);
		
		System.out.println("CPF: " + i.cpf);
		
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
	}
}
