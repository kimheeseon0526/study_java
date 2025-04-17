package student;

import java.util.Arrays;

//핵심적인 로직 클래스 - service  /CRUD
public class StudentService {
	Student[] students = new Student[2];
	int count = 0;		//-> 학생정보가 등록완료되면 담는다
	// { null,null,null,null,null,null,null,null,null,null }
	int avgkor, avgeng, avgmat = 0;
	
	{
		students[count++] = new Student(1,"개똥이", 80, 40, 90);
		students[count++] = new Student(2,"새똥이", 70, 65, 100);
	}
	

	//등록
	void register() {
		
		System.out.println("등록 기능");
		//학생 정보 등록 후 출력
		int no = StudentUtils.nextInt("학번 > " );
		for(int i = 0 ; i < count ; i++) {
			if(no == students[i].no) {
				System.out.println(StudentUtils.nextInt("중복된 학번입니다."));
				
				
			}
			System.out.println(StudentUtils.nextInt("중복된 학번입니다. 학번을 다시 입력하세요: > "));
		}
		String name = StudentUtils.nextLine("이름 > " );
		int kor = StudentUtils.nextInt("국어 > " );
		int eng = StudentUtils.nextInt("영어 > " );
		int mat = StudentUtils.nextInt("수학 > " );
		
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		
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
		//학생들 배열에서 입력받은 학번과 일치하는 학생
		System.out.println("수정 기능");
//		int input =  StudentUtils.nextInt("수정할 학번을 입력하세요 > " );	
//		for(int i = 0; i < count ; i++) {
//			if( input == students[i].no ) {	//
//				System.out.println(students[i].no);
//				String name = StudentUtils.nextLine("이름 > " );
//				int kor = StudentUtils.nextInt("국어 > " );
//				int eng = StudentUtils.nextInt("영어 > " );
//				int mat = StudentUtils.nextInt("수학 > " );
//				//수정된 학생 정보 저장
//				students[i] = new Student(input, name, kor, eng, mat);
//				System.out.println(students[i].no + " , " + students[i].name + " , " + students[i].total() + " , " + students[i].avg());			
			//풀이
				int no = StudentUtils.nextInt("수정할 학생 학번 : > ");
				Student s = null;
				for(int i = 0; i < count ; i++) {
					if(students[i].no == no) {
						s = students[i];
						break;
					}
				}
				s.name = StudentUtils.nextLine("이름 > " );
				s.kor = StudentUtils.nextInt("국어 > " );
				s.eng = StudentUtils.nextInt("영어 > " );
				s.mat = StudentUtils.nextInt("수학 > " );
			}
//		}
//	}
	//삭제
	void remove(){
//		System.out.println("삭제 기능");
//		int input =  StudentUtils.nextInt("삭제할 학생의 학번을 입력하세요 > " );	//변수
//		for(int i = 0; i < count ; i++) {
//			if( input == students[i].no ) {
//				 System.arraycopy(students, i+1,students, i, count - i -1);
//				 students[count - 1] = null;
//				 count--;		
//			}
//			System.out.println("삭제되었습니다.");
//		}
		//풀이
		int no = StudentUtils.nextInt("삭제할 학생의 학번 : ");
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count - 1 - i);
				break;
			}
		}
	}
		
	void average() {
		for(int i = 0 ; i < count ; i++) {
			avgkor += students[i].kor ;
			avgeng += students[i].eng ;
			avgmat += students[i].mat ;
				
		}
		System.out.println((avgkor/count) +"," + (avgeng/count) +","+ (avgmat/count)+"," + ((avgkor + avgeng + avgmat)/3d));
	}
	
	void rank() { //총점의 석차순 정렬(고득점자 순)
//		for(int i = 0; i < count ; i++) {
//			if() {
//				
//			}
//		}
	}
	
//		public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int idx = 0;
//		System.arraycopy(arr,  idx + 1, arr, idx , arr.length -1 -idx);
//		System.out.println(Arrays.toString(arr));
//	
//	}
		
}
//1. 중복학번 학생 등록 방지
//2. 점수당 평균값 출력(여러 학생들의 국어, 영어, 수학 점수당 평균 출력 + 총평균
// -> 메인메서드 새로 생성 필요
//3. 총점의 석차순 정렬(고득점자 순)
//4. Student 클래스의 toString 정의 - 송성준.java 참고(MartMain
//-> 현재는 주소값 나오는데 그 안의 값 나오게

