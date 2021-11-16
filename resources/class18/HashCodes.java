/**
 * This program is a simple demonstration of the hash codes computed by
 * Java for several different types of objects.
 * 
 * @author jmac
 */
public class HashCodes {

	/**
	 * Print hash code information about an array of objects. The computed
	 * information assumes that objects would be placed into a hash table
	 * with a certain number of slots (numSlots).
	 * 
	 * @param objects  An array of objects whose code information will be
	 *                 printed.
	 * @param numSlots The number of slots in the hypothetical hash table
	 *                 where the objects would be placed.
	 */
	private static void printHashInfo(Object[] objects, int numSlots) {
		System.out.println(
				"Assuming " + numSlots + " slots in the hash table...");
		for (Object object : objects) {
			int h = object.hashCode();
			int slot = h % numSlots;
			System.out.println("object: " + object + ", hash: " + h
					+ ", slot: " + slot);
		}
	}

	public static void main(String[] args) {
		
		////////////////////////////////////////////////////////////
		//// Example 1: Integer, Double, String, Object (no collisions)
		////////////////////////////////////////////////////////////
		Object[] objects1 = { 5735, 5736, 27.50, 27.75, "a", "b", "aa",
				"ab", new Object() };
		int numSlots = 100;
		System.out.println("Example 1 (no collisions):");
		printHashInfo(objects1, numSlots);

		////////////////////////////////////////////////////////////
		//// Example 1: Strings with collisions
		////////////////////////////////////////////////////////////
		Object[] objects2 = { "a", "m", "abf", "gggl", "xyz" };
		numSlots = 20;
		System.out.println("\n\nExample 2 (with some collisions):");
		printHashInfo(objects2, numSlots);

	}

}
