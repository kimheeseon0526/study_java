package lesson04;

public class OpEx4 {
	public static void main(String[] args) {
		
		
		int a = 10;
//		int b = 5;
		/*
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = a == b;
		System.out.println("c : " + c);	//false
		boolean d = c == false;
		// boolean d !=c;
		System.out.println("d : " + d);	//true
		
		//가 ~ 힣의 갯수  11172개
		
//		char 가 = '가';
//		char 힣 = '힣';
//		int ga = (int)가; 
//		int hih = (int)힣;
//
//		System.out.println(hih - ga + 1);
		
		System.out.println('힣' - '가' + 1);
		
		//AND : 둘 다 참일 때만 참
		//OR : 둘 다 거짓일 때만 거짓
		
		//boolean e
		//a의 값이 양수이면서 20보다 작은지
		
		
		boolean e = a > 0 && a < 20;
//		e = 0 < a && a < 20;
//		e = 0 < a < 20;
		System.out.println(e);
		*/
		
		//a의 값이 홀수 이거나 5의 배수인지를 e에 저장
		
		
		boolean e;
		e = a % 2 == 1 || a % 5 == 1;
		
		
		
		
		//비트연산
		// 비트곱 &,  비트합 |, 비트부정 ~, 비트배타합 ^
		
		System.out.println(9 & 5);
		System.out.println(9 | 5);
		System.out.println(9 ^ 5);
		
		System.out.println(~0);		//-1
		
		
		System.out.println(9 << 2);	//36
		System.out.println(9 >> 2);	//2
		System.out.println(-9 >> 2);	//-3
		System.out.println(-4 >>> 2);
		
		
		System.out.println(Integer.toBinaryString(-4 >>> 2));
		
		
		
	}
}
