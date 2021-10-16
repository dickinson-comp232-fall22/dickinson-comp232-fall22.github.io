package tree;

/**
 * A SumVisitor object can be used to visit each node in a CS232BinaryTree,
 * computing the sum of the values at each node. This class works only on
 * the specific case where the keys are strings and the values are
 * integers.
 * 
 * @author jmac
 *
 */
public class SumVisitor implements CS232Visitor<String, Integer> {
	// The sum of the values in nodes visited so far.
	private int total;

	/**
	 * Create a new object capable of visiting each node in a
	 * CS232BinaryTree, computing the sum of the values at each node.
	 */
	public SumVisitor() {
		total = 0;
	}

	/**
	 * Add the value at the current node to the running total.
	 * 
	 * @param key   the key for the current node.
	 * @param value the value at the current node.
	 */
	public void visit(String key, Integer value) {
		total += value;
	}

	/**
	 * Return the running total of values in the nodes that have been
	 * visited so far.
	 * 
	 * @return the running total of values in the nodes that have been
	 *         visited so far.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * This main method demonstrates how to use the SumVisitor class.
	 */
	public static void main(String[] args) {
		String[] keys = { "A", "B", "C", "G", "F", "E", "D", "H", "I",
				"J" };
		Integer[] vals = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		CS232BinaryTree<String, Integer> t = new CS232LinkedBinaryTree<String, Integer>(
				keys, vals);

		SumVisitor sumVisitor = new SumVisitor();
		t.visitLevelOrder(sumVisitor);
		int total = sumVisitor.getTotal();
		System.out.println("Total is " + total);
	}

}
