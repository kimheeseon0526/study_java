package lesson07_03;

public class InitEx {
	
	//생성자(클래스 이름과 동일)		
	InitEx(){
		System.out.println("생성자 호출");
	}
	
	//static 초기화 블럭 -> 클래스가 메모리에 로드될 때 딱 한 번 실행!
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	//인스턴스 초기화 블럭	-> 객체가 생성될 때
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 메서드 호출");
		System.out.println("main init1 객체 생성");
		new InitEx();				
		System.out.println("main init2 객체 생성");
		new InitEx();
		System.gc();
	}

}
