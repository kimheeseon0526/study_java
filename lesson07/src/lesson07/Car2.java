package lesson07;

public class Car2 {
	
	String color;
	String company;
	String type;
	
	Car2() {
		this("white", "기아", "경차");
	}
	Car2(String color, String compnay, String type){
		this.color = color;
		this.company = compnay;
		this.type = type;
	}
	Car2(String com , String t){
		this("white", com , t);
	}
	Car2(String t){
		this("화이트", "기아", t);
	}
	public String toString() {
		return color + " " + company + "-" + type;
	}

}
