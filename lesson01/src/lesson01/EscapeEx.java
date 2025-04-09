package lesson01;

public class EscapeEx {
	public static void main(String[] args) {
		
		String greet = "안녕하세요.\n저는 \"홍길동\" 입니다.";
		String greet2 = "\t 반갑습니다.";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		
		int i = 10;{
			
			System.out.println(i);
			double d = 10;
			System.out.println(d);
		}
//		System.out.println(d);
		
		long l = 10;
//		i = l;
		
		i = (int)l;
		System.out.println(i);
		
		//byte b = 128;	//byte 타입의 수치를 넘어서 오류(type missmatch오류 -> int 형으로 인식)
		byte b = (byte)128;
		System.out.println(b);
		
		System.out.println("1234567890123456789012345678901234567890");
		System.out.println(Integer.toBinaryString(300));
		System.out.println((byte)300);

		
	}

}
