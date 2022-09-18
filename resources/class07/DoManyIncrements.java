
public class DoManyIncrements {

	public static long doManyIncrements(long n) {
		return doManyIncrements(n, 0);
	}	
	
	public static long doManyIncrements(long n, long counter) {
		if (n==0) {
			for (int i = 0; i < 5; i++) {
				counter++;
			}
			return counter;
		} else {
			long newCounter1 = doManyIncrements(n-1, counter);
			long newCounter2 = doManyIncrements(n-1, newCounter1);
			long newCounter3 = doManyIncrements(n-1, newCounter2);
			newCounter3++;
			newCounter3++;
			return newCounter3;
		}
	}
	
	public static void main(String[] args) {
		for (int n = 0; n < 10; n++) {
			System.out.format("n=%d, result=%d\n", n, doManyIncrements(n));
		}
	}
	
}
