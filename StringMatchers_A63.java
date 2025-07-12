package InterviewQuestion;

import java.util.Arrays;

// WAP using split and matches method	
public class StringMatchers_A63 {

	public static void main(String[] args) {

		String s1 = "world";

		Boolean b1 = s1.matches(".....");
		System.out.println(b1);
		
		// Check given string start with w
		Boolean b2 = s1.matches("w(.*)");
		System.out.println(b2);
		
		// Check given string start with d
		Boolean b3 = s1.matches("(.*)d");
		System.out.println(b3);
		
		// Check given string man is there or not
		String str1="Spider man";
		Boolean b4= str1.matches("(.*)man(.*)");
		System.out.println(b4);
		
		// Split
		
		String str2="my name is mahesh";
		
		String[] s2= str2.split("");
		System.out.println(Arrays.toString(s2));
		
		// split with limit
		String str3="my name is mahesh";
		String[] s3= str3.split(" ", 4);
		System.out.println(Arrays.toString(s3));
		
	}

}
