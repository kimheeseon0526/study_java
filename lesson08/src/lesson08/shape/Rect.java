package lesson08.shape;

public class Rect extends Shape{
	int x , y;
	
	//생성자 두개
	public Rect() {}
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;	
	}
	
	//메서드 두개
	public double circum() {
		return ( x + y) * 2 ;
	}
	
	public double area() {
		return x * y;
	}
	
	
}
