package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s.meno);
		s.meno = "Fero";
		s.priezvisko = "Mrkva";
		
		System.out.println(s.vek);
		
		s.vek = 15;
		
		Student s2 = new Student();
		
		//System.out.println("Cele meno: " + s.meno + " " + s.priezvisko);
		
		s.celeMeno();
		
		s2.meno = "Jan";
		s2.priezvisko = "Hrasko";
		s2.vek = 54;
		
		s2.celeMeno();
		
		System.out.println("--------------");
		s.info();
		s2.info();
		
		System.out.println(s.typSkoly());
		System.out.println(s2.typSkoly());
		
		Student s3 = new Student("Marienka", "Ciapockova", 47);
		
		s3.info();
		
		System.out.println("--------------");
		s3.info(false);
		
		
		
		
		

	}

}
