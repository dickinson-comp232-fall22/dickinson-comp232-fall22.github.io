
/**
 * Demonstration of how to estimate the running time of a recursive
 * algorithm.
 * 
 * @author jmac
 *
 */
public class SayHi {

	/**
	 * What is the running time T(n) of the following method? We can write
	 * T(n) as a recurrence relation, then solve the recurrence relation to
	 * obtain a closed form for T(n).
	 * 
	 * @param n A parameter that controls the number of recursive calls. It
	 *          does not have any meaning beyond that.
	 */
	public static void sayHi(int n) {
		if (n <= 2) {
			for (int i = 0; i < 5; i++) {
				System.out.print("Hi! ");
			}
		} else {
			System.out.print("Hi! ");
			System.out.print("Hi! ");
			sayHi(n - 3);
		}
	};

	public static void main(String[] args) {
		for (int n = 0; n < 10; n++) {
			System.out.println("n=" + n + ", output is");
			sayHi(n);
			System.out.println();
		}
	}
}
