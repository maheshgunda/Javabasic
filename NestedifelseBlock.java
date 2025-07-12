package Assignments;

public class NestedifelseBlock {

	public static void main(String[] args) {
		// Nested ifblock means in block we have different condition 
		// eg: like bus tickets
		
		int a=10;
		int b=20;
		
		// ntg will execute as in else block is not there in child 
		/*
		 * if(a==10) { if(a>b) System.out.println("If block executed"); } else {
		 * System.out.println("else block executed"); }
		 */
		
		if(a==13) {
			if(a>b) {
				System.out.println("block 1 will execute");
			}
		}
		else {
			System.out.println("Block 2 will execute");
		}
	}

}
