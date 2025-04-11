package lesson06;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];	//배열 6개 받고
		int idx = 0;	//0으로 초기화
		
		while(true) {		//무한루프 구간 (즉, 항상 반복)
			int number = (int)(Math.random() * 45 + 1);	//1 ~ 45 중 난수 내려받기
			
			boolean insert = true;		//중복체크역할
			
			for(int i = 0 ; i <= idx ; i++) {
				if(lotto[i] == number) {		//if : 배열내의 값이 중복인지 체크
					insert = false;
					break;		//for문
				
				}
			}
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break;		//while문
		}
//		System.out.println(Arrays.toString(lotto));
		int[] arr = lotto ;
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
