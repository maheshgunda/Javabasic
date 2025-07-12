package InterviewQuestion;

// Print the value of given array
public class ArrayProgram1 {

	public static void main(String[] args) {

		int[] rollno = new int[3];
		rollno[0] = 1;
		rollno[1] = 2;
		rollno[2] = 3;

		// Print first given array
		System.out.println(rollno[0]);

		// Print all given array
		for (int i = 0; i < rollno.length; i++) {
			System.out.println(rollno[i]);
		}
	}

}
