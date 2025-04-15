package lesson07;

public class Student {
	
	//필드
	String name;
	int grade;
	String department;
	
	
	//생성자 추가 - 반환타입 x, 클래스 이름과 동일
	Student() {}	//기본 생성자
	
	Student(String n, int g, String d) {		//매개변수를 가진 생성자
		name = n;
		grade = g;
		department = d;
	}
}
