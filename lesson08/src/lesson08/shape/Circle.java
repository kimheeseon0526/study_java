package lesson08.shape;

public class Circle extends Shape{
	int r;	//반지름
	public Circle(){}	//기본 생성자
	public Circle(int r) {	//필드 가지는 생성자
		this.r = r;
	}
	
	public double circum() {
		return 2 * r * Math.PI;
	}
	public double area() {
		return r * r * Math.PI;
	}
}
