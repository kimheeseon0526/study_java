package student;

import java.util.Scanner;

public class StudentUtils {
	static final Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {	//클래스변수로 어디서든 사용 가능
		System.out.println(msg);
		return scanner.nextLine();		//입력 대기 상태의 값 반환
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	static int nextInt(int msg) {
		return scanner.nextInt();
	}

}
