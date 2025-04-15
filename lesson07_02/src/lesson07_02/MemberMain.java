package lesson07_02;


public class MemberMain {
	public static void main(String[] args) {
		//this 미래에 생성될 객체의 주소값
		Member m = new Member(20);	//생성자 호출
		System.out.println(m.num);	//출력값 : 20
		System.out.println(m);	//출력값 : lesson07_02.Member@49097b5d
		Member member = m.m1();
		System.out.println(member); //출력값 : lesson07_02.Member@49097b5d
		m.m2(m);
	}
}
class Member{
	int num = 10;
	Member(int num){
		this.num = num;
	}
	Member m1() {
		return this;
	}
	void m2(Member m) {
		System.out.println(m);
	}
}