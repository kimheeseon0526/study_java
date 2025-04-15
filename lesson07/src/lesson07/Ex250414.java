package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		//피보나치수열 출력 - 반복문 관련
		//피보나치 수열 숫자 20개 출력
		//규칙 : 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
		//1 1 2 3 5 8 13 21 34 55 89 ............
	
		
//		int[] arr = new int[30];
//		int[] fib = new int[20];
//		
//		for(int i = 0 ; i <= arr.length ; i++) {
//			arr[0] = 1;
//			arr[i+2] = arr[i+1] + arr[i];
//			
//			fib[i] = arr[i+2];
//				
//			System.out.println(Arrays.toString(fib));
//		}
		
		/*
		arr[0] = 1
		arr[1] = arr[0] + arr[0-1]	1
		arr[2] = arr[1] + arr[0]	2
		arr[3] = arr[2] + arr[1]	3
		arr[4] = arr[3] + arr[2]	5
		arr[5] = arr[4] + arr[3]	8
		
		arr[i] = arr[i-1] + arr[i-2]
		*/
		
		//풀이
		
//		int a = 1;
//		int b = 1;
//		System.out.print(" 1 1 ");
//		int c = a + b;
//		
//		for(int i = 0 ; i < 18 ; i++) {
//			
//		System.out.print(c + " ");
//		a = b;
//		b = c;
//		c = a + b;
//		
//		}
		
		
		
		

		
		//50개의 길이를 가지는 정수 배열 생성. 각 값은 1 ~ 20사이의 숫자로 채우기
		//이후 중복된 값을 제거한 새로운 배열 생성 -> 값의 경우의 수 20개
		
//		int[] su = new int[20];
//		int[] num = new int [20];
//		
//		for(int i = 0 ; i < 20 ; i++) {
//			su[i] = (int)(Math.random() * 20) + 1;
//			num[i] = su[i];
//			for(int j = 0 ; j < num.length ; j++) {
//				if(	// j가 num.length에 도달할 때 값이 같을 경우 )
//			}
//		}
//		System.out.println(Arrays.toString(num));

//			}
//		}
		
		//풀이
		int[] arr = new int[50];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 20 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] tmp = new int[20];
		System.out.println(Arrays.toString(tmp));
		int length = 0;		//새롭게 생성될 배열의 길이
		
//		for(int n : arr) {
//			for(int i = 0; i < tmp.length ; i++) {
//			if(n == tmp[0])
//				}
//		}
		for(int n : arr) {
		boolean insert = true;
		for(int i = 0 ; i < tmp.length ; i++) {
			if(n == tmp[i]) {
				insert = false;
				break;
			}
		}
		if(insert) {
			tmp[length++] = n ;
			}
		}
		System.out.println(Arrays.toString(tmp));
		Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
//		if(arr[0] == tmp[0]) {
//			insert = false;
//		}
//		if(arr[0] == tmp[1]) {
//			insert = false;
//		}
//		if(arr[0] == tmp[2]) {
//			insert = false;
//		}
//		if(insert) {
//			tmp[length++] = arr[0];
//		}
		
		
		
		//2차원 배열
	   /*
		* **
		* **
		* **
		* *****
		*       */
		
		
		//시계방향 90도
		
		
		char[][] chs = {
				{'*', '*',' ',' ',' '},
				{'*', '*',' ',' ',' '},
				{'*', '*',' ',' ',' '},
				{'*', '*','*','*','*'},
				{'*', '*','*','*','*'},
		};
//		
//		//90도 시계방향으로 회전의 결과를 result에 담으시오
		char[][] result2 = new char[5][5];
		
		for(int i = 0 ; i < chs.length ; i++) {
			for(int j = 0 ; j < chs[i].length ; j++) {
				System.out.print(chs[i][j] + " ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		}
		for(char[] t : result2) {
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
//		int[][] val = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//		};
//		int[][] result = new int[3][3];
//		
//		result[0][2] = val[0][0];	//1
//		result[1][2] = val[0][1];	//2		
//		result[2][2] = val[0][2];	//3
//		
//		result[0][1] = val[1][0];	//4
//		result[1][1] = val[1][1];	//5
//		result[2][1] = val[1][2];	//6
//	
//		result[0][0] = val[2][0];	//7
//		result[1][0] = val[2][1];	//8
//		result[2][0] = val[2][2];	//9
//		
//		for(int i = 0 ; i < val.length ; i++) {
//			for(int j = 0 ; j < val[i].length ; j++) {
//				System.out.print(val[i][j] + " ");
//				result[j][3-1-i] = val[i][j];
//			}
//			System.out.println();
//		}
		
		
		/*
		 * 	1 2 3
		 *  4 5 6
		 *  7 8 9
		 */
		
		/*
		 * 	7 4 1
		 *  8 5 2
		 *  9 6 3
		 */

		
	}
}
