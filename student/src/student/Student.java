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
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", total()="
				+ total() + ", avg()=" + avg() + "]";
	}

	int eng;
	int mat;
	
	
	
	
	
	Student (){ }	//기본 생성자
	
	
	Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name , int kor, int eng, int mat){
		this(no, name);		//다른 생성자의 값을 가져오는 것 -> 반드시 첫줄에 실행!
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Student(int kor , int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {		//총점을 계산하는 메서드를 만들어라
		return kor + eng + mat ;
	}
	
	double avg() {
		return total() /3d;
	}
	
	
	
	
	
	//1. 평균 계산하기 double- 메서드 사용
	//2. studentService의 수정과 삭제 기능 채우고
	//3. 학번을 제외한 나머지 값 삭제 - 그냥 새로 입력 받아 채우기
	
}
