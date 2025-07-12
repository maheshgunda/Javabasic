package InterviewQuestion;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(102);
		a1.add(20);
		a1.add(10);
		a1.add(102);
		
		// while loop
		
	//	hasNext() -> it will check next value is preset is there or not
    //	next() -> it will print the value
		
		ListIterator<Integer> i2 = a1.listIterator();
		System.out.println("Forward iterator using ListIterator");
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("Backward iterator using ListIterator");
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		
		System.out.println("Lastindex iterator using ListIterator");
		
		System.out.println(a1.lastIndexOf(10));
		
	}

}
