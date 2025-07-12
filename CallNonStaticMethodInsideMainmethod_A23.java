package Assignments;

// Call Non-static method inside main method

public class CallNonStaticMethodInsideMainmethod_A23 {

	public void add() {
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	
		// To call a non static method in main method we need create an object by using class name and with with reference variable we can call the method name
		CallNonStaticMethodInsideMainmethod_A23 A23= new CallNonStaticMethodInsideMainmethod_A23();
		A23.add();
		
	}

}
