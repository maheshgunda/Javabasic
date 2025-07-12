package Assignments;

// WAP on this calling

public class ThisCallingStatement_A20 {
	
	// This keyword means if global types and  method parameterized name are same 
	// This keyword can only be used in non static
	int student_id;
	double salary;
	String name;
	
	
	public void studentdetails(int student_id, double salary, String name)
	{
		System.out.println("Student details");
		this.student_id=student_id;
		this.salary=salary;
		this.name=name;
		System.out.println(student_id);
		System.out.println(salary);
		System.out.println(name);
	}
	public static void main(String[] args) {
		ThisCallingStatement_A20 t1= new ThisCallingStatement_A20();
		t1.studentdetails(12, 1200.40, "Mahesh");
		
		
	}

}
