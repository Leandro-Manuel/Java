package JavaPOO;

public class calculadora {

	public static void main(String[] args) {
		
		OtoNome s1 = new OtoNome();
		
		Multiplicar m1 = new Multiplicar();
		
		Subtrair sub1 = new Subtrair();
		
		
		int ResultadoSomar = s1.somar(5,20);
		int ResultadoSomar2 = s1.somar(5, 10, 5);
		
		System.out.println(ResultadoSomar + " " + ResultadoSomar2);
		
		int ResultadoMultiplicar = m1.multi(20, 30);
		int ResultadoMultiplicar2 = m1.multi(10,20,30);
		
		System.out.println(ResultadoMultiplicar + " " + ResultadoMultiplicar2);
	}
}
