package lesson07;

public class Tv {
	//필드 (멤버변수)
	//전원, 채널, 볼륨
	
	//메서드(함수, 기능)
	//전원온/오프, 채널업/다운, 볼륨업/다운
	
	boolean power;
	int channel;
	int volume;
	
	void doPower() {
		power = !power;	//false
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void volumeUp() {
		volume++;
	}
	void volumeDown() {
		volume--;
	}
}
