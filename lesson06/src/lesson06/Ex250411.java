package lesson06;

import java.util.Arrays;


public class Ex250411 {
	public static void main(String[] args) {
		//187000원을 배열을 활용해서
		//1.50000,10000,5000,1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산   -> 결과값 3, 3, 1, 2
		
		
		
		int[] units = {50000, 10000, 5000, 1000};		//0, 1, 2, 3
		int[] count = new int[units.length];	//0,0,0,0
		int money = 187_000;
//		
//		for(int i = 0 ; i < units.length ; i++) {
//			count[i] = money / units[i];	//3, 18, 37, 187
//			System.out.println(Arrays.toString(count));
//			money = money % units[i];	//나머지
//		
//			
//		}
//		System.out.println(Arrays.toString(count));
		
		//풀이
		
		for(int i = 0; i < units.length ; i ++) {
		count[i] = money / units[i];	//187000 / 50000
		money %= units[i];	//187000 ->37000
		System.out.printf("%d원 %d장", units[i], count[i]);
		}
		
		System.out.println(Arrays.toString(count));
		System.out.println(money);
		
		
//	==============================================================================================
		
		//2.임의의 문자열 생성 CAPTCHA 생성 - 난수 생성
		//문자열의 범위는 숫자, 영대, 영소 10글자
		
		//풀이
		
		String captcha = "";
		//난수의 범위 > 0 ~ 61
		//0 ~ 9 그대로 숫자
		//10 ~ 35까지는 영대
		//36이상은 영소
		
		for(int i = 0; i < 10; i++) {
			int ch = (int)(Math.random() * 62);	//난수가 0 ~ 61
			if (ch < 10) { //i=0~9
				captcha += ch;
			}
			else if(ch < 36) {	//영대 10 A : 65 //i 10~35
				captcha += (char)(ch + 'A' - 10);
			}
			else { //36~61
				captcha += (char)(ch + 'a' - 36);
			}
		}
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println(captcha);
		
		
		
		
//	==============================================================================================
		
		//3.배열에 임의값 채우기  - ok
		//100개의 공간을 가지는 배열(0~9사이의 아무값)
		//[0, 1, 1, 3, 2, 1, ........]
		
//		int[] arr = new int [100];
//		
//		for(int i = 0; i <= arr.length; i++) {
//			int num = (int)(Math.random() * 10);
//			System.out.println(num);
//		}System.out.println(arr);
		
//	==============================================================================================
		
		
		//3-2.빈도수 구하기(3번을 바탕으로)
		//배열의 길이는 10(1 - 몇개, 2 - 몇개......)
		
		int[] arr = new int[10];
//		arr[0] = (int)(Math.random() * 100);
//		arr[1] = (int)(Math.random() * 100);
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] counts = new int[10];
		
		counts[arr[0]] ++;
		counts[arr[1]] ++;	//arr[1] 인덱스에 값을 추가한다
		// 결과값 [1,0,0,0,0,0,1,0,0]
		
		for(int i = 0 ; i < arr.length ; i++) {
			counts[arr[i]]++;
		}
		System.out.println(Arrays.toString(counts));
	
		
//	==============================================================================================
		
		//p.111
		//1번
		//1 ~ 100까지의 정수 중 5의 배수의 합계를 출력하라 - ok
		
//		int sum = 0;
//		
//		for(int i = 1 ; i <= 100 ; i++) {
//			if(i % 5 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("5의 배수의 합계는 : " + sum);
		
		//풀이
		
//		int sum = 0;
		
//		for(int i = 0; i <= 100; i+= 5) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
//	==============================================================================================
		//1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하라. - ok
		
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
				
		
//	==============================================================================================
			
		//3.두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수 - ok  독립실행
		
//		int su = 0;
//		for(int x = 1;x <= 6; x++) {
//			for(int y = 1; y <= 6; y++) {
//				if(x + y == 6) {
//					System.out.println("x는 : " + x + ", y는 " + y + " => " + (x + y) );
//					su++;
//					}
//			}
//		}System.out.println("두 눈의 합이 6이 되는 경우의 수는 : " + su + "번");
		
		
		//풀이
		
	
		

//	==============================================================================================
		
		//4.이중for문을 사용해서 아래와 같은 실행 결과가 출력되도록 하라 - ok
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 0 ; j < i ; j++) {
					System.out.print("*");
				}				
			System.out.println();
			}
		

//	==============================================================================================
		
		//5.이중for - ok
		 
//		for(int i = 0; i < 5; i++) {
//			for(int j = 5 ; j > i ; j--) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5 ; j++) {
//				if(true) {
//					System.out.printf("(%d , %d)", i , j);
////				}else {
////					System.out.printf("%5c", ' ');	//5칸 채워라
//				}
//			}System.out.println();
//		}
		
//		for(int i = 0 ; i < 5; i++) {
//			for(int j = 0 ; j < 5; j++) {
//				if(i + j <= 4) {
//					System.out.printf("(%d , %d)", i , j);
//				}
//				else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//		}
		
		
		//마름모 만들기
		for(int i = -2 ; i < 3 ; i++) {
			for(int j = -2 ; j < 3; j++) {
				if(i * j < 2 && i * j > -2) {
					System.out.printf("*", i , j);
				}else {
					System.out.printf("%c", ' ');
				}
			}
			System.out.println();
		}
		
		
		
//	==============================================================================================
		
		//6.주사위를 6이 될때까지 굴리고, 눈이 6이 되면 몇번 굴렸는지 작성하라
		
//		int count2 = 1 ;
//	
//		do {
//		int num3 = (int)(Math.random() * 6 + 1);	//1 ~ 6까지 난수 출력
//			System.out.println("숫자는 > " + num3);
//			if(num3 < 6) {
//				System.out.println("6이 아닙니다.");
//				
//			}else if(num3 == 6){
//				System.out.println("6입니다.");
//				System.out.println("주사위 굴린 횟수는 : " + count2);	
//			}
//			count2 ++;
////			System.out.println("나온 숫자는 : " + num);
//			
//		}while(num3 != 6);	//조건식		//6일때는 한 번만 실행되는데 6이 아닐 때는 무한루프ㅠ
		
		//풀이
		
		int count3 = 0;
		int dice = 0;
		while(dice != 6) {
			dice = (int)(Math.random() * 6 + 1);
			count3++;
			System.out.printf("(%d)\n", dice);
		}
		System.out.println("총 주사위 횟수 : " + count3);
		
		
		while(true) {
			dice = (int)(Math.random() * 6 + 1);
			count3++;
			System.out.printf("(%d)\n", dice);
			
			if(dice == 6) break;
		}
		System.out.println("총 주사위 횟수 : " + count3);
		
	}
}
