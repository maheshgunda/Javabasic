package Assignments;


class Super_parent1{
	
	public void login() {
		System.out.println("super parent");
	}
}

public class Super_Keyword_A22 extends Super_parent1 {

	
	public void login() {
		super.login();   // super keyword will be used in method overriding to parent class as it will print first methid as well.
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		Super_Keyword_A22 A22= new Super_Keyword_A22();
		A22.login();
		
	}

}
