package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//학생 예제의 배열 > 리스트로 교체
//이름 유효성을 정규표현식으로 교체 - Matchs와 Pattern 클래스 사용

//핵심적인 로직 클래스 - service  /CRUD
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sorStudnets = new ArrayList<Student>(); //값이 변할 때 -> 등록, 수정, 삭제시	
	
	{
		students.add(new Student("개똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("새똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("말똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("개새똥이", randomScore(), randomScore(), randomScore()));
		
//		sortedstudents = Arrays.copyOf(students, students.length);
//		sortedstudents = students.clone();
//		rank();	//복제하고 정렬해라
	}
	//랜덤값 배정하는 것
	public int randomScore() {	
		return (int)(Math.random() * 41 + 60);
	}
	//입력 : 학번
	//출력 : 학생 
	
	//중복여부확인
	public Student findBy(int no) {
		Student student = null;
		for(int i = 0; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}
	public int checkRange(String subject , int input, int start, int end ) {
		boolean ret = true;
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위를 벗어났습니다." + start + "~" + end + "사이 값 입력하쇼");
	
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
		
	}
	public String checkName(String name) {
		//글자갯수 && 한글
		if(name.length() < 2|| name.length() >4 ){
			throw new IllegalArgumentException("이름은 2-4글자로 입력해");
		}
		for(int i = 0; i < name.length() ; i++) {
			if(name.charAt(i) < '가' || name.charAt(i) > '힣'){
				throw new IllegalArgumentException("이름은 한글로 입력해");
			}
		}
		return name;
	}
	//등록
	public void register() {
		
		System.out.println("등록 기능");
		//풀이
		int no = StudentUtils.nextInt("학번 : " );
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다. ");
			return;
		}
//		for(int i = 0 ; i < count ; i++) {
//			if(no == students[i].no) {
//				System.out.println("중복된 학번입니다.");
//				return ;	//초기메뉴로 돌아간다
//			}
//		}

		String name = StudentUtils.nextLine("이름 > " );
		
		int kor = StudentUtils.nextInt("국어 > ");
		checkRange("국어", kor);
		
		
		int eng = StudentUtils.nextInt("영어 > ");
		checkRange("국어", eng);
		
		
		int mat = StudentUtils.nextInt("수학 > ");
		checkRange("국어", mat);
		
		
	
//		if(count == students.size()) {
//			students = Arrays.copyOf(students, students.length * 2);
//		}	
//		students[count++] = new Student(no, name, kor, eng, mat);
//		//students[0]에 학생의 정보 입력
//		sortedstudents = Arrays.copyOf(students, students.length);
//		rank();	//복제하고 정렬해라
//		}	
	
	//조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}
	public void readOrder () {
		System.out.println("석차순 조회 기능");
		print(sortedstudents);
	}
	
	public void print(Student[] stu) {
		for(int i = 0; i < count ; i++) {
			System.out.println(stu[i]);
			}
		}
	
	
	//수정
	public void modify() {
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
				int no = StudentUtils.nextInt("수정할 학생 학번 > ");
				Student s = findBy(no);
				if(s == null) {
					System.out.println("입력된 학번이 존재하지 않습니다.");
					return ;
				}
				
//				for(int i = 0; i < count ; i++) {
//					if(students[i].no == no) {
//						s = students[i];
//						break;
//					}
//				}
				String name = StudentUtils.nextLine("이름 > " );
				s.setName(name);
				s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > " )));
				s.setEng(StudentUtils.nextInt("영어 > " ));
				s.setMat(StudentUtils.nextInt("수학 > " ));
				
				sortedstudents = Arrays.copyOf(students, students.length);
				rank();	//복제하고 정렬해라
			}
	
//		}
//	}
	//삭제
	public void remove(){
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
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return ;
		}
		
		for(int i = 0; i < count ; i++) {
			if(students[i].getNo() == no) {
				System.arraycopy(students, i+1, students, i, count - 1 - i);
				break;
			}
		}
		sortedstudents = Arrays.copyOf(students, students.length);
		rank();	//복제하고 정렬해라
	}
		
	public void allAvg() {
		//국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		//count
		for(int i = 0 ; i < count ; i++) {
			avgKor += students[i].getKor() ;
			avgEng += students[i].getEng() ;
			avgMat += students[i].getMat() ;
		}
		avgKor /= (double)count ;
		avgEng /= (double)count ;
		avgMat /= (double)count ;
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
			
		System.out.println(count + " 명의 학생 평균");
		System.out.println("국어 평균 : " + avgKor);
		System.out.println("영어 평균 : " + avgEng);
		System.out.println("수학 평균 : " + avgMat);
		System.out.println("전체 평균 : " + avgAll);
	}
	
	public void rank() {
			for(int i = 0 ; i < count - 1 ; i++) {
				int idx =  i;
				for(int j = 1 + i ;j < count ; j++) {		//비교 대상
					if(sortedstudents[idx].total() < sortedstudents[i].total()) {
						idx = j;
					}
				}
			Student tmp = sortedstudents[i];		//최소값 찾아서 두 자리의 idx를 바꾼다
			sortedstudents[i] = sortedstudents[idx];
			sortedstudents[idx] = tmp;
		
//			System.out.println(i + 1 + "회차 : " + Arrays.toString(students));
			}
		}
	
		
		
//		for(int i = 0 ; i < count ; i++) {
//			avgkor += students[i].kor ;
//			avgeng += students[i].eng ;
//			avgmat += students[i].mat ;
//				
//		}
//		System.out.println((avgkor/count) +"," + (avgeng/count) +","+ (avgmat/count)+"," + ((avgkor + avgeng + avgmat)/3d));
//	}

	
//		public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int idx = 0;
//		System.arraycopy(arr,  idx + 1, arr, idx , arr.length -1 -idx);
//		System.out.println(Arrays.toString(arr));
//	
//	}
			
//		public static void main(String[] args) {
//			int[] arr = {5,3,2,1,4};
			
			//탐색 n 최소값
			//1, 3, 2, 5, 4  > 1회차
			//1, 2, 3, 5, 4	 > 2회차
			//1, 2, 3, 5, 4  > 3회차
			//1, 2, 3, 4, 5  > 4회차     회차개수 n-1번
			
//			int min = arr[idx];
//			for(int i = 0 ; i < arr.length - 1 ; i++) {
//				int idx =  i;
//				for(int j = 1 + i ;j < arr.length; j++) {		//비교 대상
//					if(arr[idx] > arr[j]) {
//						idx = j;
//					}
//				}
//			int tmp = arr[i];		//최소값 찾아서 두 자리의 idx를 바꾼다
//			arr[i] = arr[idx];
//			arr[idx] = tmp;
//		
//			System.out.println(i + 1 + "회차 : " + Arrays.toString(arr));
//		}
//	}
	
}
//1. 중복학번 학생 등록 방지(학번을 기준으로 학생의 존재여부)
//2. 점수당 평균값 출력(여러 학생들의 국어, 영어, 수학 점수당 평균 출력 + 총평균
// -> 메인메서드 새로 생성 필요
//3. 총점의 석차순 정렬(고득점자 순)
//4. Student 클래스의 toString 정의 - 송성준.java 참고(MartMain
//-> 현재는 주소값 나오는데 그 안의 값 나오게

