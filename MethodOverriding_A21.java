package Assignments;
//WAP on method overriding
	// Multiple methods with same but with with different argunments as No of argunments, Order or argunments, type of argunments
//it will override from parent class

class ParentOverride{
	
	public void add(){
		
		System.out.println("Method override parent class");
		
		}
}

public class MethodOverriding_A21 extends ParentOverride  {
	
	
	public void add() {   // it will over ride the parent class of same method name
	// 	super.add();      // if we add super keyword then it will print the parent method as well
		System.out.println("Method override child class");
	}
	public static void main(String[] args) {
		
		MethodOverriding_A21 m1= new MethodOverriding_A21();
		m1.add();
		
	}

}
