package student;

import java.util.Arrays;

//핵심적인 로직 클래스 - service  /CRUD
public class StudentService {
	Student[] students = new Student[2];
	int count = 0;		//-> 학생정보가 등록완료되면 담는다
	// { null,null,null,null,null,null,null,null,null,null }
	int num = 0;

	//등록
	void register() {
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		System.out.println("등록 기능");
		//학생 정보 등록 후 출력
		int no = StudentUtils.nextInt("학번 > " );
		String name = StudentUtils.nextLine("이름 > " );
		int kor = StudentUtils.nextInt("국어 > " );
		int eng = StudentUtils.nextInt("영어 > " );
		int mat = StudentUtils.nextInt("수학 > " );
		
		students[count++] = new Student(no, name, kor, eng, mat);
		//students[0]에 학생의 정보 입력

	}
	
	//조회
	void read() {
		System.out.println("조회 기능");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i].no + " , " + students[i].name + " , " + students[i].total() + " , " + students[i].avg());
		}
	}
	
	//수정
	void modify() {
		System.out.println("수정 기능");
		int input =  StudentUtils.nextInt("수정할 학번을 입력하세요 > " );	
		for(int i = 0; i < count ; i++) {
			if( input == students[i].no ) {	//
				System.out.println(students[i].no);
				//새로 입력값 출력
				String name = StudentUtils.nextLine("이름 > " );
				int kor = StudentUtils.nextInt("국어 > " );
				int eng = StudentUtils.nextInt("영어 > " );
				int mat = StudentUtils.nextInt("수학 > " );
				//수정된 학생 정보 저장
				students[i] = new Student(input, name, kor, eng, mat);
				System.out.println(students[i].no + " , " + students[i].name + " , " + students[i].total() + " , " + students[i].avg());			
			}
		}
	}
	//삭제
	void remove(){
		System.out.println("삭제 기능");
		int input =  StudentUtils.nextInt("삭제할 학생의 학번을 입력하세요 > " );	//변수
		for(int i = 0; i < count ; i++) {
			if( input == students[i].no ) {
				 System.arraycopy(students, i+1,students, i, count - i -1);
				 students[count - 1] = null;
				 count--;		
			}
			System.out.println("삭제되었습니다.");
		}
	}
		
}
	

