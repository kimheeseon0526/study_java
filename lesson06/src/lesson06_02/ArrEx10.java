package lesson06_02;

public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3} , {4,5,6} ,{7,8,9} }; //arr[0] 인덱스는 {1,2,3}		//2차원 배열
		
//		System.out.println(arr[1][0]);	//4
		
		String[][][] strs = { {} , {{"A", "B", "C"}, {"가","나","다"} }, {{"0", "1"}} };
		
		//strs.length => 3개라고 나온다
		//{}
		//{{"A", "B", "C"}, {"가","나","다"} }
		//{{"0", "1"}}
		
		System.out.println(strs.length);	//3
		System.out.println(strs[1].length);		//2 String 2차원 배열
		System.out.println(strs[1].length);	// 2
		System.out.println(strs[1][1].length);	// 3
		System.out.println(strs[1][1][1]);	// 나 출력 -> 문자열
		
		
	}
}
