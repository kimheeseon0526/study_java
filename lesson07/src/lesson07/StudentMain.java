package lesson07;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
//		-> 불가능
		
		Student stu = new Student("홍길동", 4 , "소프트웨어공학과");	//객체 생성
		//타입 맞춰서 전달해야한다
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
	}
}
