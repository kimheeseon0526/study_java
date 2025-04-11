package lesson06;

public class Sam {
	public static void main(String[] args) {
		
		for(int i = 0 ; i <= 10000 ; i++) {
			int count = 0;	//박수를 칠 횟수 저장
			int tmp = i;
			
			//박수횟수 반복
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					count++;
				}
			}while((tmp /= 10) != 0);
			
			
			if(count > 0) {
				for(int j = 0 ; j < count ; j++) {
					System.out.print("깍");
				}
				System.out.println();
				
			}else {
				System.out.println(i);
			}
		}
	}
}
