package InterviewQuestion;

import java.util.Arrays;

public class Copy_OneArray_AnotherArray_Reverse {

	public static void main(String[] args) {
		
		int[] a1= {10,20,30};
		int[] a2= new int[a1.length];
		
		for(int i=0;i<a1.length;i++) {
            a2[i] = a1[a1.length - 1 - i];  // Reverse copy
		}
		System.out.println(Arrays.toString(a2));

	}

}
