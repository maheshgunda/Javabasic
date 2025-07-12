package Assignments;

// WAP on super calling statement using non-parameterized super calling statement
// SuperClass_Parameterized

class University{
	
	public  University(int a, double d) {
		
		System.out.println("1");
	}
}

class Education extends University{
	
	Education(String s){
		super( 12, 12.3);
		System.out.println("2");
		
	}
}

public class SuperClass_Parameterized extends Education {
	
	SuperClass_Parameterized(){
		super("ram");
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		
		// we can call constructor using object creation
		new SuperClass_Parameterized();
		
	}

}
