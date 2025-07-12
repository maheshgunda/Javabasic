package InterviewQuestion;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(102);
		a1.add(20);
		a1.add(10);
		a1.add(102);
	
		System.out.println(a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(20);
		a2.add(202);
		a2.add(30);
		a2.add(40);
		a2.add(62);
		
		System.out.println(a2);
		
		// merge a2 and a1
		
		  a2.addAll(a1); 
		  System.out.println(a2);
		 
		
		//isEmpty
		Boolean b2 = a2.isEmpty();
		System.out.println(b2);
		
		/*
		 * // clear - it will clear the value a1.clear(); System.out.println(a1);
		 */
		
		// Contains is not part of a2 check 40 is present is or not
		Boolean b3= a2.contains(40);
		System.out.println(b3);
		
		// Contains all is  part of a1 and a2 or not
				Boolean b4= a2.containsAll(a1);
				System.out.println(b4);
		
		// remove specfic index
			a1.remove(1);
			System.out.println(a1);  // it will remove 102 value from a1
			
		// equals
			System.out.println(a1.equals(a2));
			
		// clone- copy of the collection
			
			System.out.println(a2);
			
			
		
	}

}
