package analysis;

/**
 * A few examples used for practice in analyzing the average case.
 * 
 * @author Grant Braught
 * @author Dickinson College
 * @version Feb 17, 2016
 */
public class AverageCase {

	// For the average case analysis, assume that ch is present in s
	// 50% of the time. When it is present, ch occurs exactly once and
	// is equally likely to be at any location in s.

	/**
	 * Find the index of the first occurrence of a character in a String.
	 * 
	 * @param ch the character to search for.
	 * @param s  the string to search
	 * @return the index the first ch in s or -1 if ch does not appear in
	 *         s.
	 */
	public static int indexOf(char ch, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		// Not found.
		return -1;
	}

	public static void main(String[] args) {
		char ch = 'X';
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int index = indexOf(ch, s);
		System.out.format("Index of %c in %s is %d.\n", ch, s, index);
	}
}
