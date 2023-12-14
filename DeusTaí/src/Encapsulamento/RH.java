package Encapsulamento;

public class RH {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios();
		
		f1.nome = "Maria";
		f1.endereco = "Rua Feira Nova, n8";
		
		f1.ajustarcpf("12952306400");
		
		f1.ajustarRG("9034255");
		
		String cpf = f1.mostrarcpf();
		
		System.out.println(cpf);
		
	}

}
