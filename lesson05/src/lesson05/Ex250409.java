package lesson05;

import java.util.Scanner;

public class Ex250409 {
	public static void main(String[] args) {
		
		//로그인 인증
		//사용자로부터 아이디, 비밀번호를 입력받고, 그 아이디가 admin, 비밀번호가 1234일 때 로그인 성공
		//단, 아이디가 admin, 비밀번호가 틀렸을 때 로그인 실패 > 잘못된 비밀번호
		//아이디가 admin이 아니면 없는 계정 메세지 출력
		
		
		Scanner scanner = new Scanner(System.in);		//입력기
		
		
//		System.out.print("아이디를 입력하세요 : ");
//		String id = scanner.nextLine();	
//		System.out.println("입력한 아이디 : " + id);
//		//아이디가 admin일 경우
//		if(id.equals("admin")) {
//			System.out.print("비밀번호를 입력하세요 : ");
//			String pw = scanner.nextLine();
//			if(pw.equals("1234")) {
//				System.out.println("로그인 성공!");
//			}
//			else {
//				System.out.println("로그인 실패");
//				System.out.println("잘못된 비밀번호 입니다");
//				}
			
//		}
		//아이디가 admin 아닐 경우
//		else {
//			System.out.println("없는 계정입니다");
//			 }
		
		
//		if(!id.equals("admin")) {	//로그인 성공
//			System.out.println("없는 계정입니다");
//		}else if(pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("비번 틀림");
//		}
		
		
		//==============================================================================
		//숫자 하나를 입력받아서 3의 배수, 그리고 짝수 여부를 동시 판별
		//3의 배수, 짝수, 3의 배수이면서 짝수, 둘다 아닌 경우
//		System.out.println( );
//		System.out.println("==============================================================" );
//		System.out.println( );
//		System.out.println("숫자를 입력해주세요 > ");
//		
//		int num = scanner.nextInt();
		
//		if(!(num % 3 == 0) && !(num % 2 == 0 )){
//			System.out.println("3의 배수도 짝수도 아님");	//11 , 77
//		}
//		else if(num % 3 == 0) {	//3의 배수
////			System.out.println("3의 배수");
//			if(num % 2 == 0) {
//				System.out.println("3의 배수이면서 짝수");	//30
//			}
//			else {
//				System.out.println("3의 배수이기는 하나 짝수는 아님");	//3
//			}
//		}
//		else if(!(num % 3 == 0) && num % 2 == 0){		
//			System.out.println("짝수(3의 배수는 아님)");		//8
//		}
		
		
		int input = scanner.nextInt();
		boolean 삼의배수 = input % 3 == 0;
		boolean 짝수 = input % 2 == 0;
		
		if(삼의배수 && 짝수) {
			
		}else if(삼의배수) {
			
		}else if (짝수) {
			
		}else {
			
		}
		
		//비트 마스크 플래그
	
		int result = 0;
		result = 0;
		result += 삼의배수 ? 1 : 0;
		result += 짝수 ? 2 : 0;
		String str = " ";
		
		switch(result) {
		case 1 :
			str += "3의 배수";
		case 2 :
			str += "짝수";
		case 3 :
			str += "3의 배수 짝수";
		
		}
		
		
		
//		
//		System.out.println( );
//		System.out.println("==============================================================" );
//		System.out.println( );
//		System.out.println("월을 입력해주세요 > " );
		
		//월(month)을 입력받아서 계절을 출력
		//3~5 : 봄 , ~
		
//		int month = scanner.nextInt();
//		System.out.println(month);
//		
//		switch(month) {
//		
//		case 3 : case 4 : case 5:
//			System.out.println("봄");
//			break;
//		case 6 : case 7 : case 8:
//			System.out.println("여름여름");
//			break;
//		case 9 : case 10 : case 11 :
//		System.out.println("가을가을가을");
//			break;
//		case 12 : case 1 : case 2:
//			System.out.println("겨울겨울겨울겨울");
//			break;		
//		default :
//			System.out.println("1 ~ 12 중 입력해주세요");
//		}
		
		
		//3번
		
//		int pen = 12 * scanner.nextInt();
//		int student = scanner.nextInt();
//		
//		System.out.println("각 학생에게 나눠줄 수 있는 색연필 수는 " + pen / student);
//		System.out.println("나눠주고 남은 색연필 수는 " + pen % student);
		
		
		//6세 이상 탑승 가능(키가 120 이상이면 보호자 동반하에 탑승 가능), 키 120이상 탑승 가능, 심장관련 질환자 탑승 불가
		//변수 나이, 키 , 보호자 여부 , 심장질환여부
		
//		int age = 10, height = 150 ;
//		boolean parent = false , hearchDease = false ;
//		
//		boolean isRide = !hearchDease && height >= 120 && (age >= 6 || parent) ;
//		System.out.println(isRide);
		//  탑승가능조건 = 심장질환 x & 키가 120 이상 & 나이가 6살 이상 이거나 부모님 o
		
		
//		int year = 2024;
//		boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
//		System.out.println(leapYear);
		
		//year % 4 == 0 윤년
		//year % 400 == 0 윤년
		//year % 100 != 0 윤년 아님
		
		
		//지불해야될 금액이 187,000원인데 오만원권, 만원권, 오천원권, 천원권 
//		
//		int price = 187_000;
//		
//		int oman = price / 50_000;	//3
//		int ilman = price % 50_000 / 10_000;
//		int ochun = price % 10_000 / 5_000;
//		int ilchun = price % 5_000 / 1_000;
//		
//		System.out.println(oman);
//		System.out.println(ilman);
//		System.out.println(ochun);
//		System.out.println(ilchun);
		
		
//		int num = 1234;
//		int result = num / 100 * 100;
//		result = num - num % 100 ;
//		System.out.println(result);
		
	
		
		
	}
}
