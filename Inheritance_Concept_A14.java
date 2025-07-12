package Assignments;

// WAP on Inheritance Concept

class Concept1{
	
	public void teacher() {
		System.out.println("teacher 1 Parent class");
	}
}

public class Inheritance_Concept_A14 extends Concept1{
	
	public void student1() {
		System.out.println("student 1 child class");
	}
		public static void main(String[] args) {
			
			Inheritance_Concept_A14 c1=  new Inheritance_Concept_A14();
			c1.teacher();
			c1.student1();
			
		}

}
