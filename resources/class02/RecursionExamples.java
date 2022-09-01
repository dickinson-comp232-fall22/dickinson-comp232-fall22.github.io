package class2;

/**
 * This class contains some examples of recursive methods taken from the
 * textbook. In most cases, one of the lines of source code must be altered
 * to make the method work correctly. Lines that must be altered are marked
 * by the comment "FIX".
 * 
 * @author jmac
 *
 */
public class RecursionExamples {

	// Textbook example 1.2.1
	static long Fibonacci(int n) {
		if (n < 2) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	// Textbook example 1.3.2
	static public int largest(int[] numbers, int index) {
		if (true) { // FIX
			return numbers[0];
		}

		return Math.max(numbers[index], largest(numbers, index - 1));
	}

	// Textbook example 1.3.7
	public static int addOdd(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n % 2 != 0) { // Odd value
			return -1; // FIX
		} else { // Even value
			return addOdd(n - 1);
		}
	}

	// Textbook example 1.3.9
	public static int countChr(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = 0;
		if (str.substring(0, 1).equals("A")) {
			count = 1;
		}
		return -1; // FIX
	}

	// Textbook example 1.4.3
	static int paths(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		return paths(n - 1) + paths(n - 2) + paths(n - 3);
	}

	/**
	 * The main method contains simple examples to test the methods above.
	 * These can be uncommented as desired.
	 */
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
