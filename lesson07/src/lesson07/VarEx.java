package lesson07;

public class VarEx {
	public static void main(String[] args) {
		
		System.out.println("Avante 제조사 : " + Avante.company);	//Avante의 컴퍼니
		
		
		//객체 생성 (a1, a2)
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		
		a1.color = "화이트";
		a2.color = "블랙";
		
		System.out.println("a1의 색상 : " + a1.color);
		System.out.println("a2의 색상 : " + a2.color);
		
		System.out.println("a1의 제조사 : " +  a1.company);	//Avnate.company로 호출해라
		System.out.println("a2의 제조사 : " +  a2.company);
	
		a1.company = " 기아";
		
		System.out.println("Avante의 제조사 : " + Avante.company);
		System.out.println("a1의 제조사 : " +  a1.company);
		System.out.println("a2의 제조사 : " +  a2.company);
	}

}
// VarEx의 main 메서드 선언 전에 아래 클래스 먼저 작성하고 위의 메인 메서드 작업해야한다
class Avante{
	String color;		//인스턴스 변수 , 초기값 = null;
	static String company = "현대";		//클래스 변수
}
