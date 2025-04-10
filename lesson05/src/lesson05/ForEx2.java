package lesson05;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//3의 배수의 합계
		// x % 3 == 0
		
//		int sum = 0;
//		
//		for(int i = 0; i<=100; i=i+3 ) {
//			
//			sum += i;
//			
//			System.out.printf("i : %3d, sum : %d\n" , i, sum);
//		}
//		System.out.println(sum);
		
//		int sum2 = 0;
//		for(int i = 1; i <= 100/3; i++) {
//			sum2 += i * 3;
//			System.out.println(sum2);
//		}
//		System.out.println(sum2);
		
		
		//숫자 하나를 입력 받고 해당 숫자의 약수들을 출력
		// 10 -> 1 2 5 10
		
//		10 % i == 0;
		
		

		System.out.print("숫자를 입력하세요 > ");
		int num = scanner.nextInt();

		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
			
		}
		
		//for문을 while로 변경
		
		int i = 1;
		while(i <= num) {
			if(num % i == 0) {
				System.out.println(i);
			}
			i++;
			
		}
		
		
		
		
		
		
	}
}
