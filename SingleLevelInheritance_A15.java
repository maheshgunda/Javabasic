package Assignments;

// WAP on Single Level Inheritance

class SingleParent{
	
	public static void add() {
		System.out.println("Single parent method calling");
	}
}

public class SingleLevelInheritance_A15 extends SingleParent{
	
	
	public static void sub() {
		System.out.println("Child method calling");
	}

	public static void main(String[] args) {
		add();
		sub();
		
		
	}

}
