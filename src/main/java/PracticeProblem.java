public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x) {
		x = Math.abs(x);
		if (x < 10 && x >= 0) {
			return x;
		}

		return x % 10 + sumOfDigits(x / 10);
	}

	public static int factorial(int x) {
		if (x == 0) {
			return 1;
		}

		if (x < 0) {
			return 0;
		}

		return x * factorial(x - 1);
	}

}
