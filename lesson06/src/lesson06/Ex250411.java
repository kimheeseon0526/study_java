package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		//187000원을 배열을 활용해서
		//1.50000,10000,5000,1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		
		
		
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];	//0,0,0,0
		int[] money = {187000};
		
		for(int i = 0 ; i < units.length ; i++) {
			count[i] = money[0] / units[i]; 	//3,18,37,187   5만원권 3장
		}
		System.out.println(Arrays.toString(count));
		
		
		
		
		
		//이하코드 작성 후 갯수 출력
		
		
		//2.임의의 문자열 생성 CAPTCHA 생성
		//문자열의 범위는 숫자, 영대, 영소 10글자
		
		
		
		//3.배열에 임의값 채우기
		//100개의 공간을 가지는 배열(0~9사이의 아무값)
		//[0, 1, 1, 3, 2, 1, ........]
		
		
		//3-2.빈도수 구하기(3번을 바탕으로)
		//배열의 길이는 10(1 - 몇개, 2 - 몇개......)
		
		
		
		//p.111
		//1번
		//1 ~ 100까지의 정수 중 5의 배수의 합계를 출력하라
		
//		int sum = 0;
//		
//		for(int i = 1 ; i <= 100 ; i++) {
//			if(i % 5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("5의 배수의 합계는 : " + sum);
		
		
		//1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하라.
		
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		for(int i = 1 ; i <= 100 ; i++) {
//			if( i % 2 == 0) {
//				evenSum += i;
//			}else {
//				oddSum += i;
//			}
//		}
//		System.out.println("짝수의 합은 : " + evenSum);
//		System.out.println("홀수의 합은 : " + oddSum);
		
		
		//3.두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수
		
		
		
		
		//4.이중for문을 사용해서 아래와 같은 실행 결과가 출력되도록 하라
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j < i ; j++) {
				if( i == j) {
					System.out.printf("%d %d %s]n", i , j , "*");
				}				
			}
		}
		System.out.println();
		

		
		//5.이중for
		
		//6.주사위를 6이 될때까지 굴리고, 눈이 6이 되면 몇번 굴렸는지 작성하라
		
//		int num = (int)(Math.random() * 6 + 1);
//		int count2 = 0 ;
//	
//		do {
//			if(num != 6) {
//			System.out.println(num);
//			}
//			count2 ++;
//		}while(num != 6);	//조건식
//		
//		System.out.println(num);
//		System.out.println(count2);
	}

}
