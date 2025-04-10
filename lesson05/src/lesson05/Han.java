package lesson05;

import java.util.Scanner;

public class Han {
	public static void main(String[] args) {
		
		
		//한글의 총 개수
//		System.out.println('힣'-'가' + 1);	//11172
		
		//각 초성당 글자의 총 갯수 
//		System.out.println('싷'-'사' + 1);	//588
		
		//초성의 갯수 (ㄱ ~ ㅎ - 쌍자음포함)
//		System.out.println(11172 / 588);	//19(초성의 갯수)
//		System.out.println(19 * 588);	//11172		
		
		//종성간 거리(종성의 갯수)
//		System.out.println('개' - '가');	//28  가 + 28 = 개
		
		//특정 글자가 받침이 있는지 없는지 boolean
		//가의 코드 = 44032
		//종성 유무 확인하기 위해서는 마지막 글자의 유니코드값 확인해야한다
		
//		char ch = '나';
		
//		System.out.println((ch - '가') % 28 != 0);	//false
		
		//가의 시작코드 44032
		
		//은,는,이,가,을,를
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를 입력하세요 >");
		String inputStr = scanner.nextLine();
		
		//문자열 내의 특정 위치의 글자 하나만 char 타입으로 변환
		
		char ch = inputStr.charAt(inputStr.length() - 1);
		System.out.println(ch);
		boolean hasLast = (ch - '가') % 28 != 0;
		String output = "사용할 단어의 예시는 아래와 같습니다\n";
		output += inputStr + (hasLast ? "은" : "는") + "\n";
		output += inputStr + (hasLast ? "이" : "가") + "\n";
		output += inputStr + (hasLast ? "을" : "를") + "\n";
		
		System.out.println(output);
		
	}

}
