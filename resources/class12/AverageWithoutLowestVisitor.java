package tree;

/**
 * An AverageWithoutLowestVisitor object can be used to visit each node in
 * a CS232BinaryTree, computing the average of the values at each node,
 * except that the smallest value is not included in the average. This
 * could be used by a professor who is computing the average score of some
 * quizzes, while dropping the worst quiz score. This class works only on
 * the specific case where the keys are strings and the values are
 * integers.
 * 
 * @author jmac
 */
public class AverageWithoutLowestVisitor
		implements CS232Visitor<String, Integer> {
	// The sum of the values in nodes visited so far.
	private int total;

	// The number of nodes visited so far.
	private int numVisited;

	// The lowest value stored in any node visited so far.
	private int lowest;

	public AverageWithoutLowestVisitor() {
		this.total = 0;
		this.numVisited = 0;
		// This is a common programming idiom. We initialize 'lowest' to
		// the maximum value that can be stored in an Integer. So the first
		// value that we analyze is guaranteed to be no larger than than
		// the current value of 'lowest'.
		this.lowest = Integer.MAX_VALUE;
	}

	/**
	 * Update information based on the value of the current node.
	 * 
	 * In detail, we increase the sum of nodes visited so far by the value
	 * stored in the current node. We increment the number of nodes
	 * visited, and we update our record of the lowest value seen so far.
	 * 
	 * @param key   the key for the current node.
	 * @param value the value at the current node.
	 */
	public void visit(String key, Integer value) {
		total += value;
		numVisited += 1;
		lowest = Math.min(value, lowest);
	}

	/**
	 * Compute and return the average of value of the nodes visited,
	 * ignoring the smallest value.
	 * 
	 * @return the average of value of the nodes visited, ignoring the
	 *         smallest value
	 * @throws Exception If fewer than two nodes have been visited.
	 */
	public double getAverageWithoutLowest() throws Exception {
		if (numVisited < 2) {
			throw new Exception(
					"At least two nodes must be visited before an average without the lowest value can be computed.");
		}
		// We cast to double here to ensure that floating-point arithmetic
		// is used rather than integer arithmetic. To compute the average
		// while ignoring the lowest value, we subtract the lowest value
		// from the total and divide by one less than the number of nodes
		// visited.
		double average = ((double) (total - lowest)) / (numVisited - 1);
		return average;
	}

	public static void main(String[] args) {
		String[] keys = { "A", "B", "C", "G", "F", "E", "D", "H", "I",
				"J" };
		Integer[] vals = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		String[] keys = { "A" };
//		Integer[] vals = { 1,  };
		CS232BinaryTree<String, Integer> t = new CS232LinkedBinaryTree<String, Integer>(
				keys, vals);

		AverageWithoutLowestVisitor visitor = new AverageWithoutLowestVisitor();
		t.visitLevelOrder(visitor);
		double average;
		try {
			average = visitor.getAverageWithoutLowest();
			System.out.println(
					"The average with the lowest value dropped is "
							+ average);
		} catch (Exception e) {
			System.out.println(
					"The average with the lowest value dropped could not be computed,\n"
							+ "because we did not visit at least two nodes.");
		}
	}

}
