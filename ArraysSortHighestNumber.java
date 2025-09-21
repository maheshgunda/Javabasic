package InterviewQuestion;

import java.util.Arrays;

// In given number find highest value
public class ArraysSortHighestNumber {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0]=10;
		a[1]=50;
		a[2]=30;
		a[3]=40;
		
		
		Arrays.sort(a);
		for(int s:a) {
			
		}
		System.out.println(Arrays.toString(a));
		
		// In given number find highest value
		 System.out.println(a[a.length-1]);
	
	}

}
