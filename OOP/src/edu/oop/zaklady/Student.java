package edu.oop.zaklady;

public class Student {
	
	//vlastnosti triedy
	//instancne premenne
	
	String meno;
	String priezvisko;
	int vek;
	
	//konstruktory
	
	Student(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 5;
		System.out.println("Volany konstruktor bez parametra");
	}
	
	
	
	Student(String meno, String priezvisko, int vek) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
	}



	//metody
	//bez navratovej hodnoty
	
	void celeMeno() {
		System.out.println(meno + " " + priezvisko);
	}
	
	void info() {
		celeMeno();
		System.out.println("Vek: " + vek);
	}
	
	void info(boolean komplet) {
		if(komplet) {
			info();
			System.out.println("Typ skoly: " + typSkoly());
		}else {
			info();
		}
	}
	
	//s navratovou hodnotou
	String typSkoly() {
		String typ = "";
		if(vek < 15) {
			typ = "zakladna";
		}else if(vek < 19) {
			typ = "stredna";
		}else if(vek < 25){
			typ = "vysoka";
			
		}else {
			typ = "absolvent";
		}
		
		return typ;
	}
	
	
}
