package lesson06_02;

import java.util.Arrays;

public class ArrayEx13 {
	public static void main(String[] args) {
		
		//초기의 배열
		//5개의 int 배열 생성
		
		int[] arr = {10, 20, 30, 40, 50};
		
		//기존 배열의 2배의 길이를 가지는 배열을 생성 - 타입 일치 시켜야됨!
		
		int[] tmp = new int[arr.length * 2];	//길이 10개 , 초기값 [0, 0, 0, 0, .....]
		
//		//1번 - 배열 내부의 값 복사
//		for(int i = 0 ; i < arr.length ; i++) {
//			tmp[i] = arr[i];	//[10,20,30,40,50,0,0,0,0,0]
//		}
 		
		//2번 - 배열의 참조값 복사
		
		System.out.println(Arrays.toString(arr));	//[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
		
		//arraycopy - 배열의 복사
		
		System.arraycopy(arr, 0, tmp, 0, arr.length);	//[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
//		System.arraycopy(복사할 주체의 원본, 몇번 인덱스부터 복사할 것이냐(시작인덱스), 복사할 대상, 복사할 대상의 시작 위치, 몇개 복사할 것이냐);	
		
		System.arraycopy(arr, 0, tmp, 2, arr.length);	
		arr = tmp;
		System.out.println(Arrays.toString(arr));	//[0, 0, 10, 20, 30, 40, 50, 0, 0, 0] 2번인덱스부터!
		
		System.arraycopy(arr, 0, tmp, 2, 3);	
		System.out.println(Arrays.toString(arr));	//[10, 20, 10, 20, 10, 40, 50, 0, 0, 0]
		
		
		
		//for문을 이용한 복사, arraycopy / copyof 를 이용한 복사는 복사될 대상을 미리 생성해야된다
		
		int[] arr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr2));	//[10, 20, 10, 20, 10, 40, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		
		int[] result = {1,2,3};
		//copyof : Arrays.copyof(원본배열, 원본배열에서 복사해올 길이)
		result = Arrays.copyOf(result, result.length * 2);
		System.out.println(Arrays.toString(result));	//[1, 2, 3, 0, 0, 0]
		
		
		
		
	}
}
