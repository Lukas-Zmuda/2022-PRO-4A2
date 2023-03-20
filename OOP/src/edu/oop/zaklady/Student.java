package edu.oop.zaklady;

public class Student {
	
	//vlastnosti triedy
	//instancne premenne
	
	String meno;
	String priezvisko;
	int vek;
	
	//metody
	//bez navratovej hodnoty
	
	void celeMeno() {
		System.out.println(meno + " " + priezvisko);
	}
	
	void info() {
		celeMeno();
		System.out.println("Vek: " + vek);
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
