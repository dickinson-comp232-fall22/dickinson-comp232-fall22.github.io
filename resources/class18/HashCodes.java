
public class HashCodes {

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
		Object[] objects1 = { 5735, 5736, 27.50, 27.75, "a", "b", "aa",
				"ab", new Object() };
		int numSlots = 100;
		System.out.println("Example 1:");
		printHashInfo(objects1, numSlots);
		
		Object[] objects2 = { "a", "m", "abf", "gggl",
				"xyz" };
		numSlots = 20;
		System.out.println("\n\nExample 2:");
		printHashInfo(objects2, numSlots);
		
		
		
	}

}
