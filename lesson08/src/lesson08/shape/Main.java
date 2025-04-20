package lesson08.shape;

public class Main {
	public static void main(String[] args) {
//		Circle circle = new Circle(3);	//객체 생성
//		System.out.println(circle.area());	//넓이
//		System.out.println(circle.circum());	//둘레
		
//		Rect rect = new Rect(4 , 5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
		
//		Tri tri = new Tri(3,4,5);		//삼각형 인스턴스 생성
//		System.out.println(tri.area());
//		System.out.println(tri.circum());
		
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

			@Override
			public double area2() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double bupi() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		
//		Shape[] shapes = {circle, rect, tri};	//[0],[1],[2]
//		
//		for(int i = 0; i <shapes.length; i++) {
//			System.out.println("=========" + shapes.getClass().getSimpleName() + "==========");
//			System.out.println(shapes[i].area());
//			System.out.println(shapes[i].circum());
//			
//		}
//		System.out.println("===================원,Rect , 삼각형의 둘레 및 넓이 구하기 끝=================");
		
		CircleDoong cld = new CircleDoong(3, 5);
		System.out.println(cld.area2());
		System.out.println(cld.bupi());
		//원기둥의 겉넓이 및 부피
		
		TriDoong trd = new TriDoong(3,4,5,6,7);
		System.out.println(trd.area2());
		System.out.println(trd.bupi());
		
		
	
	}
}
