package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexerMain {
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		
		com.print();
		com.scan();
		com.send("028765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c;		//구현되기 위해 만든 아이
		Comparator<?> c2;		//객체로 만들기 위해 쓴 아이

//		Comparable<?> i;		
//		Comparator<?> i2;		

		Iterable<?> i;		
		Iterator<?> i2;		
	}
}
