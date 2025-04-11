package lesson06;

import java.util.Arrays;

public class ArrEx1 {
	public static void main(String[] args) {
		//배열
		//길이로 초기화도 가능하고, 값을 직접 넣을 수도 있다
		int i = 10;
		int[] arr = {10, 20, 30, 50};
		
		//배열의 값에 접근 >> index
		//OS : 운영체제
		
		arr[0] = 60;	//60
		
		arr[1] = arr[2];
		
		arr[3] = i;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[3];	//길이를 통한 초기화
		//{0,0,0}
		
		
		int[] arr3 = new int[] {5,6,7,8};
		
		arr1 = new int[] {10,40,50};
		arr1 = new int[10];
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr));
		
		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));	//[null,null,null]
		
		
		char ch = '가';
		
		ch = 44032;
		ch = '\uAC00';
		ch = 0xac00;
	}
}

