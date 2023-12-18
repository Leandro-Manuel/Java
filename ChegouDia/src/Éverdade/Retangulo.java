package Éverdade;

public class Retangulo {
	
	private double Base;
	private double Altura;
	
	private double Area;
	private double Perimetro;
	
	public Retangulo(double Base, double Altura) {
		this.Base = Base;
		this.Altura = Altura;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public double getArea() {
		return Area;
	}

	public void setArea() {
		this.Area = Base * Altura;
	}

	public double getPerimetro() {
		return Perimetro;
	}

	public void setPerimetro() {
		this.Perimetro = 2 * (Base * Altura);
	}
	
	public Retangulo() {
		this.Base = Base;
		this.Altura = Altura;
		
	}
	
	
	
	
	
	

}
