
public class Operatory {

	public static void main(String[] args) {
		
		
		System.out.println(10 % 5);
		
		int a = 10;
		
		a = a + 3;
		a += 3;
		
		
		a *= 2;// a = a * 2
		
		//POZOR
		a =+ 3;
		
		a += 1;
		a++;
		++a;
		
		System.out.println("a = " + a);
		int b = ++a;
		
		System.out.println("b = " + b);
		System.out.println("a = " + a);
				
		a--;
		
		System.out.println("a = " + a);
		System.out.println((a > 2) | (a++ > 0));
		
		System.out.println("a = " + a);

	}

}
