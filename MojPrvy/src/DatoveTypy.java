
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne DT
		
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 187;
		int x = 123;
		int y, z, a;
		int aa = 12, bb = 12;
		
		int den1 = 123;
		
		System.out.println("cislo = " + cislo);
		
		int hex = 0xff;
		System.out.println("hex = " + hex);
		int bin = 0b10000000;
		System.out.println("bin = " + bin);
		int oct = 0123;
		System.out.println("oct = " + oct);
		
		int ss = 1_123_455;
		System.out.println(ss);
		
		
		byte bbb = 12;
		int bint = bbb;
		
		
		bbb = (byte)bint;
		
		//desatinne cisla
		float ff = 1.245f;
		double ddd = 12.999;
		System.out.println("ddd = " + ddd);
		
		ddd = bint;
		int dint = (int)ddd;
		System.out.println("dint = " + dint);
		
		
		//znaky
		char zavinac = '@';
		System.out.println(zavinac);
		char velkeA = 65;
		System.out.println(velkeA);
		
		char znak = '\u0123';
		System.out.println(znak);
		
		//logicke hodnoty
		boolean prsi = false;
		
		

	}

}
