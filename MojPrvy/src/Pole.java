
public class Pole {

	public static void main(String[] args) {
		
		int a = 10;
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[2] = 4;
		
		System.out.println(cisla[2]);
		
		cisla[0] = 11;
		cisla[1] = -3;
		System.out.println("-------------");
		for(int i = 0; i < cisla.length; i++) {
			System.out.print(cisla[i] + " ");
		}
		
		
		String[] mena = {"David", "Martin", "Robo", "Oliver", "Erik", "Gabriel"};
		
		int[] vyska4A = {198, 170, 168, 189, 175, 194};
		
		
		System.out.println("\nDruhy v zozname je " + mena[1]);
		
		System.out.println("Pocet ziakov: " + mena.length);
		System.out.println("-------------");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska4A[i] + " cm");
		}
		
		
		System.out.println("Posledny v zozname je " + mena[mena.length - 1]);
		
		
	}
}