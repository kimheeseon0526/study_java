package student;



//핵심적인 로직 클래스 - service  /CRUD
public class StudentService {
	Student[] students = new Student[10];

	//등록
	void register() {
		System.out.println("등록 기능");
		//학생 정보 등록 후 출력
		
		
		//scanner를 가져다 쓴다...
		System.out.println(StudentUtils.nextLine("이름을 입력하세요 > "));
		System.out.println(StudentUtils.nextInt("학번을 입력하세요 > "));
		System.out.println(StudentUtils.nextInt("국어 점수를 입력하세요 > "));
		System.out.println(StudentUtils.nextInt("수학 점수를 입력하세요 > "));
		System.out.println(StudentUtils.nextInt("영어 점수를 입력하세요 > "));


	}
	
	//조회
	void read() {
		System.out.println("조회 기능");
	}
	
	//수정
	void modify() {
		System.out.println("수정 기능");
	}
	//삭제
	void remove(){
		System.out.println("삭제 기능");
	}
	
}
