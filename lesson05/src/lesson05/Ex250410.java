package lesson05;

public class Ex250410 {
	public static void main(String[] args) {
		// 상자 갯수 세기
		// 사과를 한 상자당 10개씩 담을 수 있다
		//사과의 갯수를 123개라고 했을 때 필요한 상자의 갯수 구하기(연산자만 사용) 3항 연산자
		
		// 올림처리
		
		
//		int apple = 123;
//		
//		int box = apple / 10;	//사과를 10개씩 다 채웠을 때
//		int na = apple % 10 ;	// 사과가 10개 미만으로 남았을 때 -> 어떻게 박스를 하나 추가할것이냐 
		
		int apple = 123;
		int box = 10;
		
		System.out.println(apple / box + apple % box == 0 ? 0 : 1);
		System.out.println((apple + 9) / box);
		System.out.println(apple + 9);
		
				
		//합계 구하기
		// 1 + (-2) + 3 + (4) + ........(-98) + 99 + (-100)  -> 짝수에는 - 붙여서 출력
		//반복문 사용
		
//		
//		int hol ;
//		int zzak ;
		
//		for(int i = 1; i <=100 ; i++) {
//			if(i % 2 == 0) {	//짝수
//				zzak = (-i);
//				System.out.println(zzak);
//			}else {	//홀수
//				hol = i;
//		}//System.out.println(hol + zzak);		
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				sum += -i;
//			}else {
//				sum += i;				
//			}
			sum += i % 2 == 0 ? -i : i;
		}
			System.out.println(sum);

			
		
		
		
		// 소수판정(prime number)
		// 지정된 자연수가 소수인지 아닌지를 출력(약수가 1 과 자기 자신)
		//반복문 사용  11 ->1, 11
		//약수의 갯수 -> 2개

		
		
		int num = 13;
		int count = 0;
		
		for(int i = 2; i < num; i++) {
			System.out.printf("%d : %d >> %s\n", i, num % i, num % i == 0 ? " 약수" : "약수아님");
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 0 ? "소수" : "소수아님");
	
	
	}
}
