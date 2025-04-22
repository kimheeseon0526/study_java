package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
	
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";

		//Protocol ://Domain/FileName?QueryString(parameter)
		//1. Cut down the url into the parts listed above.	
		//QuesryString Key1 = value1 & key2=value2 &

		String[] list = url.split("://");
		String pt = list[0];
		System.out.println("프로토콜은 : " + pt); //https
		
		url = list[1];
		list = url.split("/");
		String dm = list[0];
		System.out.println("도메인은 : " + dm);	//search.naver.com

		url = list[1];
		list = url.split("\\?");
		String fn = list[0];
		url = list[1];
		System.out.println("파일 이름은 : "+ fn);		//search.naver
		list = url.split("&");

		//subString

		for(int i = 0 ; i < list.length ; i++) {
			if(list[i].indexOf("=") != -1) {
				String[] qs = list[i].split("=");			
				System.out.println("쿼리스트링 " + (i +1) + "은 : " +Arrays.toString(qs));
			}
		}
		//풀이
			

	}
}
