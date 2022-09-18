
public class PrintXs {
	// Exercise 1: Find an exact recursive formula for the running time of
	// the printXs() method below. Use the parameter n as the size of the
	// input. Use the System.out.print() method as the basic operation.

	// Exercise 2: Use the technique of expansion to obtain an exact
	// closed-form formula for the running time of the printXs() method
	// below.

	// Exercise 3: express the running time of the printXs() method using
	// big-Theta notation.

	/**
	 * Print a certain number of 'X' characters using recursion.
	 * 
	 * @param n A parameter that controls the number of recursive calls. It
	 *          does not have any meaning beyond that.
	 */
	public static void printXs(int n) {
		// base case
		if (n <= 1) {
			System.out.print("X");
			System.out.print("X");
			System.out.print("X");
		} else { // recursive case
			System.out.print("X");
			System.out.print("X");
			printXs(n - 1);
		}
	}

	public static void main(String[] args) {
		for (int n = 0; n < 10; n++) {
			System.out.println("n=" + n + ", output is");
			printXs(n);
			System.out.println();
		}
	}
	
}
