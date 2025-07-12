package InterviewQuestion;

import java.util.Arrays;

public class Copy_OneArray_AnotherArray {

	public static void main(String[] args) {
		
		/*
		 * int[] array1 = new int[3]; array1[0]= 100; array1[1]= 200; array1[2]= 300;
		 * 
		 * int[] array2 = new int[array1.length]; for(int i=0;i<array1.length;i++) {
		 * array2[i] = array1[i]; System.out.println(Arrays.toString(array1)); }
		 */
		
		int[] a1= {10,20,30};
		
		int[] a2= a1;
		
		for(int i=0;i<a1.length;i++) {
			a2[i]=a1[i];
		
		}
		System.out.println(Arrays.toString(a2));
	}

}
