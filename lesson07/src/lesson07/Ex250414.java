package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		//피보나치수열 출력 - 반복문 관련
		//피보나치 수열 숫자 20개 출력
		//규칙 : 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
		//1 1 2 3 5 8 13 21 34 55 89 ............
	
		
		int[] arr = new int[20];
		int[] fib = new int[20];
		
		for(int i = 0 ; i <= arr.length ; i++) {
			arr[0] = 1;
			arr[i+2] = arr[i+1] + arr[i];
			
			fib[i] = arr[i+2];
			
		
			System.out.println(Arrays.toString(fib));
//			System.out.println(Arrays.toString(arr));
		}
		
		/*
		arr[0] = 1
		arr[1] = arr[0] + arr[0-1]	1
		arr[2] = arr[1] + arr[0]	2
		arr[3] = arr[2] + arr[1]	3
		arr[4] = arr[3] + arr[2]	5
		arr[5] = arr[4] + arr[3]	8
		
		arr[i] = arr[i-1] + arr[i-2]
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//50개의 길이를 가지는 정수 배열 생성. 각 값은 1 ~ 20사이의 숫자로 채우기
		//이후 중복된 값을 제거한 새로운 배열 생성
		
//		int[] num = new int [50];
//		for(int i = 0 ; i < 20 ; i++) {
//			int[] su = new int[20];
//			su[i] = (int)(Math.random() * 20) + 1;
//			System.out.println(Arrays.toString(su));
//		}
		
		
		
		
		
		
		
		//2차원 배열
	   /*
		* **
		* **
		* **
		* *****
		*       */
		
//		char[][] chs = {
//				{'*', '*',' ',' ',' '},
//				{'*', '*',' ',' ',' '},
//				{'*', '*',' ',' ',' '},
//				{'*', '*','*','*','*'},
//				{'*', '*','*','*','*'},
//		};
//		
//		//90도 시계방향으로 회전의 결과를 result에 담으시오
//		char[][] result = new char[5][5];

		
	}
}
