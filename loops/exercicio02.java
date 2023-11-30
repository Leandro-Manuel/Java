package loops;

public class exercicio02 {

	public static void main(String[] args) {
		int intArray [] = {2,5,46,12,34};
		
		for(int i= intArray.length-1;i>=0;i--) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
