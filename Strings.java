package InterviewQuestion;
// WAP to find number of albhabets,numeric digit,spaces and special characters in a string.
public class Strings {

	public static void main(String[] args) {
		
		String str= "Hello World! 123 @Java";
		
		int alphabets = 0, digits = 0, spaces = 0, specialChars = 0;
		
		for(int i=0; i<str.length();i++) {
			char cd= str.charAt(i);
			
			if(Character.isLetter(cd)) {
				alphabets++;
			}
			else if(Character.isDigit(cd)) {
				digits++;
			}
			else if(Character.isWhitespace(cd)) {
				spaces++;
			}
			else {
				specialChars++;
			}
		}
		System.out.println("alphabets " +alphabets);
		System.out.println("digits " +digits);
		System.out.println("spaces " +spaces);
		System.out.println("specialChars " +specialChars);
		
	}

}
