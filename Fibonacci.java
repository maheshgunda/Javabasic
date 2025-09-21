package InterviewQuestion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long Fibonacci = 1;

		for (int i = 1; i <= num; i++) {

			Fibonacci *= i;

		}
		System.out.println(Fibonacci);
	}

}
