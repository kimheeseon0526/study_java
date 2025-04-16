package lesson07_03;

public class Access {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.getI());
//		target.i = 30;
		target.setI(30);
		System.out.println(target.getI());
		
		
	}
}

class Target{
	private int i = 20;
	
	//getter : 가져오는것
	public int getI() {
		return i;
	}
	
	public void setI(int j) {
		// TODO Auto-generated method stub
		
	}

	//setter
	public void set( ) {
		if(i >= 0 && i <= 100) {
		this.i = i;
		}
	}
}