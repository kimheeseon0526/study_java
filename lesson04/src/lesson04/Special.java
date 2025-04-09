package lesson04;

public class Special {
	public static void main(String[] args) {
		
	//나누기 계산시
	// A / B = C
	// A : 피제수 , B : 제수, C : 몫
	//NAN : Not a Number
		
	
	System.out.println(Double.POSITIVE_INFINITY);	//Infinity
	System.out.println("실행전");	
//	System.out.println(3/0);	//ArithmeticException(함수예외) 
	System.out.println(3/0d);	//Infinity
	System.out.println(0/0d);	//NaN
	System.out.println("실행후");	
	
	// && 와 & 차이
	// 거짓 && 참
	
//	System.out.println( 3/0 == 1 );
	System.out.println( false && 3/0 == 1 );	//터지지 않는다. 앞의 값이 이미 false이기 때문에 3/0 == 1의 값을 확인할 필요가 없다	
	}
}
