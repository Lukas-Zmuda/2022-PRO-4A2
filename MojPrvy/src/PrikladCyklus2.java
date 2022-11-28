import java.util.Scanner;

public class PrikladCyklus2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int cislo = -1, suma = 0;

		while(cislo != 0) {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			suma += cislo;
			
		}
		
		System.out.println("Suma: " + suma);
	}

}
