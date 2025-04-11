package lesson06;

public class MinMax {
	public static void main(String[] args) {
		int[] arr = {10, 1, 3, 5, 6};
		
		//최소값(1)과 최대값(10)을 구하라 
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {	//i가 문자열과 비교했을 때
			if(max < arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);				
		System.out.println("최소값 : " + min);				
		
		//합계, 평균
		
		int sum = 0;
		
		for(int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / arr.length);
	}

}
