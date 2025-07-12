package InterviewQuestion;

public class ReplaceAll_String_A61 {

	public static void main(String[] args) {
		
		String str="Automation testing";
		
		// Replace String
		System.out.println(str.replaceAll(str, "API Automation Testing"));
		
		// Replace particular value of the String
		String str1= "Automation testing";
		System.out.println(str1.replace("A", "a"));
		
		// Replace all small letters with nothig
		String str2="Automation Testing";
		// same like we can mention replace captial letters ,numeric values
		System.out.println(str2.replaceAll("[A-Z]", ""));
		
		
		// Replace Captial letters to Small letters
		
		String str3="APi AUTOMATIOn TESTINg";
		System.out.println(str3.toLowerCase());
	}

}
