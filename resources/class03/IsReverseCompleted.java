package recursion;

public class IsReverseCompleted {
	public static boolean isReverse(String s1, String s2) {
		if (s1.length() == 0 && s2.length() == 0) {
			return true;
		} else if (s1.length() == 0 || s2.length() == 0) {
			return false;
		} else {
			String s1first = s1.substring(0, 1);
			String s2last = s2.substring(s2.length() - 1);
			return s1first.equals(s2last) && isReverse(s1.substring(1),
					s2.substring(0, s2.length() - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(isReverse("abcd", "dcba"));
		System.out.println(isReverse("abcd", "dcab"));
	}

}
