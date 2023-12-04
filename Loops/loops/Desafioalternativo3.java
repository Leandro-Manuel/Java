package loops;

import java.util.StringTokenizer;

public class Desafioalternativo3 {

	public static void main(String[] args) {
		String palavra = "Hello world!";
		
		String resultado = palavra.replace ("l","w");
		
		System.out.println(resultado);
		
		String resultado2 = palavra.substring(3,8);
		
		System.out.println(resultado2);
		
		String resultado3 = palavra.toUpperCase();
		
		System.out.println(resultado3);
		
		String resultado4 = resultado3.toLowerCase();
		
		System.out.println(resultado4);
		
		String palavra2 = "Hello";
		char c = palavra2.charAt(1);
		
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		
		System.out.println(b1);
		
		String sttr = "Hello World World2";
		int pos = sttr.lastIndexOf("l");
		
		System.out.println(pos);
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		
		System.out.println(exemplo.countTokens());
		
		
		
		
		
		
	}
	
	
}
