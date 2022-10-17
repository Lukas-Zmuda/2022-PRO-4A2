import java.util.Scanner;

public class VstupDoProgramu {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ako sa volas?");
		
		String meno;
		
		meno = sc.nextLine();
		
		System.out.println("Ahoj " + meno + ". V ktorom roku si sa narodil?");
		
		int rokNarodenia = 0;
		
		rokNarodenia = sc.nextInt();
		System.out.println("Mas " + (2022 - rokNarodenia) + " rokov.");
		
		double tt = sc.nextDouble();
		System.out.println(tt);

	}

}
