package fundamentos;

import java.util.Scanner;


//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
//As perguntas são:

//telefonou para a vitima?
//Esteve no local do crime?
//Mora perto da vítima?
//devia para a vítima?
//Já trabalhou com a vítima?

//1 = sim , 2 = não

//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//Se a pessoa responder positivamente a 2 questoes, ela deve ser classificada como "Suspeita".
//entre 3 a 4 como "cúmplice" e 5 como "Assassino".
//Caso contrário, ele será classificado como "inocente"
public class Desafio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Telefonou para a vítima? ");
		double perg1 = entrada.nextDouble();
		double verific = 0;
		
		
		
		if (perg1 == 1) {
			verific = 1;
		}
		System.out.println("Esteve no local do crime? ");
		double perg2 = entrada.nextDouble();
	
		
		if (perg2 == 1) {
			verific = perg2++;
		}
		System.out.println("Mora perto da vítima? ");
		double perg3 = entrada.nextDouble();
	
		
		if (perg3 == 1) {
			verific = perg3++;
		}
		System.out.println("Devia dinheiro para a vítima? ");
		double perg4 = entrada.nextDouble();
	
		
		if (perg4 == 1) {
			verific = perg4++;
		}
		System.out.println("Já trabalhou com a vítima? ");
		double perg5 = entrada.nextDouble();
	
		
		if (perg5 == 1) {
			verific = perg5 ++;
		}
		
		if (verific == 2) {
			System.out.println("Pessoa suspeita!");
		}else if (verific == 3 || verific == 4) {
			System.out.println("Cúmplice!");
		}else if (verific == 5) {
			System.out.println("Assassino!");
		}else {
			System.out.println("Inocente!");
		}
		
		

	}

}
