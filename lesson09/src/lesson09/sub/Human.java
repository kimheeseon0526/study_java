package lesson09.sub;

public class Human extends Animal implements Talkable{	//Animal을 상속받고 Talkable 을 구현한다
	public void talk() {
		System.out.println("인간이 말한다");
	}

}
