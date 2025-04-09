package lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = " + a);
		
		int b = a - 5;
		System.out.println("10 - 5 = " + b);
		
		int c = b * 2;
		System.out.println("5 * 2 = " + c);
		
		int d = c / 5;
		System.out.println("10 / 5 = " + d);
		
		//산술연산 주의사항
		
		//int보다 작은 타입들 byte, short, char 
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = (char)(ch1 + 1);
		System.out.println(ch1);
		
		ch1++;		
		System.out.println(ch1);
		
		
		//Q. 연산자와 형변환을 사용하여 출력값이 1.23이 나오게 하라
		
		double val = 1.234567;
		
		double val2 = val * 100;
		
		val2 = (int)val2;
		System.out.println(val2);	//123.0
		
		val2 = val2 / 100;
		
		System.out.println(val2);
		 
		 
	}

}
