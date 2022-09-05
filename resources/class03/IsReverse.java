package recursion;

/**
 * Textbook example 1.5.2
 *
 */
public class IsReverse {
	public static boolean isReverse(String s1, String s2) {
		if (false) { // <<Missing condition 1>>
			return true;
		} else if (false) { // <<Missing condition 2>>
			return false;
		}
		String s1first = s1.substring(0, 1);
		String s2last = s2.substring(s2.length() - 1);
		return s1first.equals(s2last) && isReverse(s1.substring(1),
				s2.substring(0, s2.length() - 1));
	}
}
