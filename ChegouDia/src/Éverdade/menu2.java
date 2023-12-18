package Éverdade;

public class menu2 {

	public static void main(String[] args) {
		
		Retangulo c1 = new Retangulo(3,2);
		
		double base = c1.getBase();
		System.out.println(base);
		
		c1.setAltura(5);
		c1.setBase(10);
		
		c1.setArea();
		c1.setPerimetro();
		
		double area = c1.getArea();
		double perimetro = c1.getPerimetro();
		
		System.out.println(area);
		System.out.println(perimetro);
		
		// sem parametros:
		
		Retangulo c2 = new Retangulo();
		c2.setAltura(10);
		c2.setBase(5);
		
		c2.setArea();
		c2.setPerimetro();
		
		double area2 = c2.getArea();
		double perimetro2 = c2.getPerimetro();
		
		System.out.println(area2);
		System.out.println(perimetro2);
	}
}
