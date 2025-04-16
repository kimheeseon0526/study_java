package lesson07_03;

public class InitFinal {
	//초기화순서
	//클래스 변수 ->
	//클래스 초기화 블럭 ->
	//인스턴스 변수 ->
	//인스턴스 초기화 블럭 ->
	//생성자

	static int si = 1;
	int i = 2;
	
	static void sm() {
		System.out.println(si);
//		System.out.println(i);
//		System.out.println(this);
	}
	void m() {
		System.out.println(si);
		System.out.println(i);
		System.out.println(this);
		
	}
	
	public static void main(String[] args) {
		InitFinal.sm();
		new InitFinal().m();
	}
}
