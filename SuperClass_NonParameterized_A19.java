package Assignments;

// WAP on super calling statement using parameterized super calling statement


 class SuperClass_NonParameterized1{
	 
	 SuperClass_NonParameterized1(){
		 System.out.println("1");
	 }
	 
 }
 
 class SuperClass_NonParameterized2 extends SuperClass_NonParameterized1 {
	 SuperClass_NonParameterized2(){
		 System.out.println("2");
		 
	 }
 }

public class SuperClass_NonParameterized_A19 extends SuperClass_NonParameterized2 {
	
	SuperClass_NonParameterized_A19(){
		System.out.println("3");
	}

	public static void main(String[] args) {
		// calling constructor using method name
		new SuperClass_NonParameterized_A19();
	}

}
