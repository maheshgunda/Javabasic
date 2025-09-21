package InterviewQuestion;

public class PrimeNumbers {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int num : numbers) {
			if (isPrime(num)) {
				System.out.println(num + "number is prime");
			} else {
				System.out.println(num + "number is not prime");
			}

		}

	}

	static boolean isPrime(int n) {
		if (n <= 1)
			return false; // 0,1 and negatives are not prime
		if (n == 2)
			return true; // 2 is prime
		if (n % 2 == 0)
			return false; // even numbers >2 are not prime

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
