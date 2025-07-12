package InterviewQuestion;

public class Palidrome {

	public static void main(String[] args) {
		
		String str="mom";
		String result ="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			result+= str.charAt(i);
		}
		System.out.println(result);
		 
		Boolean b= str.equals(result);
		if(b==true) {
			System.out.println("Given string is palidrome");
		}
		else {
			System.out.println("Given string is not a palidrome");
		}
	}
}
