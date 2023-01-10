import java.util.Scanner;

public class U3KamenPapierNoznice {

	public static void main(String[] args) {
		
		//import potrebnych tried
		Scanner sc  = new Scanner(System.in);
		int pocetKol = 3, volbaUz = -1, volbaPc = -1, vyhraUz = 0, vyhraPc = 0;
		
		//v troch kolach>
		for(int i = 0; i < pocetKol; i++) {
			//uzivatel zada volbu (1-kamen, 2 - papier, 3 - noznice)
			System.out.println("Zadaj volbu [0-kamen, 1 - papier, 2 - noznice]");
			volbaUz = sc.nextInt();
			
			//pocitac vygeneruje volbu
			volbaPc = (int) (Math.random() * 3);
			System.out.println(volbaPc);
			//porovna sa volba uzivatela s volbou pc a nasledne sa vyhodnoti (vyhra, prehra, remiza)
			if(volbaUz == 0) {
				if(volbaPc == 0) {
					vyhraPc++;
					vyhraUz++;
				}else if(volbaPc == 1) {
					vyhraPc++;
				}else {
					vyhraUz++;
				}
			}
			if(volbaUz == 1) {
				if(volbaPc == 1) {
					vyhraPc++;
					vyhraUz++;
				}else if(volbaPc == 0) {
					vyhraUz++;
				}else {
					vyhraPc++;
				}
			}
			if(volbaUz == 2) {
				if(volbaPc == 2) {
					vyhraPc++;
					vyhraUz++;
				}else if(volbaPc == 0) {
					vyhraPc++;
				}else {
					vyhraUz++;
				}
			}
			
			System.out.println((i + 1) + ". kolo: " + (volbaPc) + " vs. " + volbaUz);
			
		}
		//po troch kolach program vypise vitaza a skore
		System.out.println("------------------");
		System.out.println("Skore:");
		System.out.println("Hrac: " + vyhraUz);
		System.out.println("PC: " + vyhraPc);
		//koniec programu

	}

}
