package Éverdade;

public class menu {

	public static void main(String[] args) {
		
		Pet a1 = new Pet("Gato", "Felino", 2);
		
		Pet a2 = new Pet("Cachorro","Canino",1);
		
		Pet a3 = new Pet("Papagaio","ave",2);
		
		a1.setNome("Onca pintada");
		
		String a1Info = a1.getNome() + " ," + a1.getAnimal()+ " , " + a1.getIdade();
		
		String a2Info = a2.getNome() + " ," + a2.getAnimal() + " , " + a2.getIdade();
		
		String a3Info = a3.getNome() + " ," + a3.getAnimal() + " , " + a3.getIdade();
 		
		System.out.println(a1Info);
		System.out.println(a2Info);
		System.out.println(a3Info);
	}
}
