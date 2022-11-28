import java.util.Scanner;

public class PrikladCyklus {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int cislo = 0, suma = 0;

		for(int i = 0; i < 5; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislo = sc.nextInt();
			suma += cislo;
		}
		
		System.out.println("Suma: " + suma);
	}

}
