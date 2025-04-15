package lesson07;

public class MethodEx {
	public static void main(String[] args) {		//main메서드의 선언부
		int result = add(10, 20);		//메서드 호출
		System.out.println(result);
		print("Hello");
		System.out.println(addAll(1,2,3));
		
		
		//stack
		//메서드의 호출 순서는 stack 따라간다
		return;
//		int a = 10;		return 다음에는 도달할 수 없다
	}
	static int add(int a , int b 	/*매개변수*/) {
//		int a;
		return a + b;
	}
	
	static int addAll(int...nums) {	//갯수의 제한이 없다
		int ret = 0;
		for(int n : nums) {
			ret += n;
		}
		return ret;
	}
	
	
	static void print(String s) {
		System.out.println(s);
	}
}

