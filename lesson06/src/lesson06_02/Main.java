package lesson06_02;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int a = 10;
		int c = a;
		int[] arr = {1,2,3};
		int[] arr2 = arr;
		int[][] arr3 = {{1,2}, {3}};
		arr3[1] = arr3[0];	//arr3의 0번째 인덱스({2,3})를 arr3의 1번째 인덱스에 넣어라~
		
		
		System.out.println(Arrays.deepToString(arr3));	
		arr3[0][0] = 10;
		System.out.println(Arrays.deepToString(arr3));	
		arr3[0] = arr;
		System.out.println(Arrays.deepToString(arr3));	
	}

}
