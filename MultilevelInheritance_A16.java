package Assignments;

// WAP on Multi Level Inheritance
// A Single sub class more then one super class
class parent_multi{
	
	int a=100;
	int b=200;
	
	public void add()
	{
		System.out.println(Math.addExact(a,b));
	}
}

class parent_multi1 extends parent_multi{
	
	public void sub() {
		System.out.println(Math.subtractExact(b, a));
	}
	
}
public class MultilevelInheritance_A16 extends parent_multi1  {
	
	public void mul() {
		System.out.println(Math.multiplyExact(b, a));
	}

	public static void main(String[] args) {
		
		MultilevelInheritance_A16 al6= new MultilevelInheritance_A16();
		al6.add();
		al6.sub();
		al6.mul();
		
		
		
		
	}

}
