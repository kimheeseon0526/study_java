package lesson06;

import java.util.Arrays;

public class ShuffleEx {
	public static void main(String[] args) {
		int[] arr = new int [45];
		for(int i = 0 ; i < arr.length ; i++) {	//45번 반복
			arr[i] = i + 1 ;	//1 ~ 45
		}
		for(int i = 0; i < arr.length ; i++) {
			int idx = (int)(Math.random() * 45);	// 0 ~ 44
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[i] = tmp;
		}
		int[] result = new int[6];	// 0,0,0,0,0,0
		for(int i = 0 ; i <result.length ; i++) {
			result[i] = arr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
