package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);	//객체 생성
//		System.out.println(circle.area());	//넓이
//		System.out.println(circle.circum());	//둘레
		
		Rect rect = new Rect(4 , 5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
		
		new Shape() {
			
			@Override
			public double circum() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Shape[] shapes = {circle, rect};
		
		for(int i = 0; i <shapes.length; i++) {
			System.out.println("=========" + shapes.getClass().getSimpleName() + "==========");
			System.out.println(shapes[i].area());
			System.out.println(shapes[i].circum());
			
		}
	}
}
