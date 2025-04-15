package student;

//Data class
public class Student {
	
	//1. StidentMain의 나머지 기능 구현(메세지 출력)
	//2.Student의 생성자 구현
	//기본 생성자 + (학번, 이름) , ( 5개의 필드 다 사용)
	
	//학생 1인의 총점, 평균을 계산한다면?
	
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	int avg;
	
	Student(){	//기본 생성자
	}
	
	Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name , int kor, int eng, int mat){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Student(int kor , int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Student(int sum , int avg){		//합계와 평균
		this.kor = sum;
		this.eng = avg;
	}
	
	
	
}
