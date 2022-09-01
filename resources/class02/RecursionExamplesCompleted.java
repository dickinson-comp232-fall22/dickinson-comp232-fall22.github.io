package class2;

/**
 * The RecursionExamplesCompleted class contains the solutions to the
 * textbook exercises in the accompanying RecursionExamples class.
 * 
 * @author jmac
 *
 */
public class RecursionExamplesCompleted {

	static long Fibonacci(int n) {
		if (n < 2) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	static public int largest(int[] numbers, int index) {
		if (index == 0) {
			return numbers[0];
		}

		return Math.max(numbers[index], largest(numbers, index - 1));
	}

	public static int addOdd(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n % 2 != 0) { // Odd value
			return addOdd(n - 2) + n;
		} else { // Even value
			return addOdd(n - 1);
		}
	}

	public static int countChr(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = 0;
		if (str.substring(0, 1).equals("A")) {
			count = 1;
		}
		return count + countChr(str.substring(1));
	}

	static int paths(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		return paths(n - 1) + paths(n - 2) + paths(n - 3);
	}

	public static void main(String[] args) {
//		long x = Fibonacci(3);

//		int[] someNumbers = new int[] { 5, 9, 6, 25, 7, 3, 3 };
//		int x = largest(someNumbers, someNumbers.length - 1);
//		System.out.println(x);

//		int x = addOdd(6);
//		System.out.println(x);

//		int x = countChr("fhjkAfhdsjkAdfhsAhj");
//		System.out.println(x);

//		int x = paths(10);
//		System.out.println(x);

	}
}
