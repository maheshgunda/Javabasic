package InterviewQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListProgram1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(102);
		a1.add(20);
		a1.add(10);
	//	a1.add(null);
		a1.add(102);
		
		// if object is null then sort will not work
		Collections.sort(a1);	
		System.out.println(a1);
		

	
	}

}
