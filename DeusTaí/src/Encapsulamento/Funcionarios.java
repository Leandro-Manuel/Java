package Encapsulamento;

public class Funcionarios {
	
	String nome;
	String endereco;
	private String CPF;
	private String RG;
	private String telefone;
	private String email;
	private double salario;
	private int qtdFilhos;
	
	// sem metodo construtor
	// o java cria um método construtor vazio: invisível, quando não tem o método construtor 
	// public Funcionarios(){
//  }
	
	public void ajustarcpf(String CPF) {
		this.CPF = CPF;
	}
	
	public String mostrarcpf () {
		return this.CPF;
	}
	
	public void ajustarRG(String RG) {
		this.RG = RG;
	}
	
	public String mostrarRG() {
		return this.RG;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	
	
} 

// get , set
