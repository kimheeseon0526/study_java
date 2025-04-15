package lesson07;

public class LocalValEx {
	
	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i = 0 ; i < 10 ; i++) {
			int temp = 0;
			temp += i;
		}
//		System.out.println(temp);
	}

}

class Local{
	String name;	//인스턴스 변수
	void process() {
		String name;	//메서드 내에 선언된 지역 변수 
		name = "홍길동";	
	}
	void printAge1() {
		int age = 20;		//지역변수
		System.out.println(age);
	}
		void printAge2() {
			int age = 30;		//지역변수
			System.out.println(age);
	}
}
