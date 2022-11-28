
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");

		//cyklus s pevnym poctom opakovani
		for(int i = 0; i < 5; i++) {
			System.out.println("Ahoj");
		}
		
		System.out.println("Program pokracuje dalej ...");
		
		for(int i = 5; i > 0; i--) {
			System.out.println("Ah");
		}
		
		System.out.println("-----------");
		for(int i = 0; i < 11; i += 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for(int i = 1, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
		
		//cyklus s podmienkou na zaciatku
		
		int j = 1;
		while(j < 11) {
			System.out.print(j + ", ");
			j++;
		}
		
		System.out.println();
		//cyklus s podmienkou na konci
		
		j = 100;
		do {
			System.out.print(j + ", ");
			j++;
		}while(j < 11);
	}

}
