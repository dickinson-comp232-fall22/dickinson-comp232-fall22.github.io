/**
 * This class is the same as the BTNode provided as an inner class in
 * CS232LinkedBinaryTree, except that some extra methods have been provided
 * for debugging. You may find it useful to copy and paste the extra
 * methods into the BTNode provided as an inner class in
 * CS232LinkedBinaryTree.
 * 
 * Good programmers often make use of debugging methods such as these. In
 * the remainder of the semester, you are encouraged to write your own
 * extra debugging methods to help make sense of the code.
 * 
 * @author jmac
 *
 */
public class BTNode<K, V> {
	public K key;
	public V value;
	public BTNode<K, V> left;
	public BTNode<K, V> right;
	public BTNode<K, V> parent;

	public BTNode(K key, V value) {
		this.key = key;
		this.value = value;
		left = null;
		right = null;
		parent = null;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	/*
	 * NOTE: The parent pointer isn't strictly necessary for some of the
	 * basic binary tree uses and operations. However, as this class serves
	 * as the basis for later work on Heaps and AVL Trees where parent
	 * pointers are necessary it is included here from the start. This
	 * allows the Heap and AVL Trees to inherit much of the functionality
	 * (e.g. traversals) from earlier implementations.
	 */

	///////////////////////////////////////////////////////////////////////
	// jmac added the next two methods for debugging
	///////////////////////////////////////////////////////////////////////
	/**
	 * Return the depth of a node in a binary tree.
	 * 
	 * @return The depth of the current node
	 */
	public int getDepth() {
		// We start at the current node and follow parent pointers until we
		// get to the root. The number of parent pointers we follow will be
		// equal to the depth of the current node, by definition.
		int depth = 0;
		BTNode<K, V> cur = this;
		// If the parent pointer is null, we are at the root. Otherwise,
		// follow the pointer to the parent.
		while (cur.parent != null) {
			cur = cur.parent;
			depth += 1;
		}
		return depth;
	}

	/**
	 * Print out information about the depth of the current node and its
	 * status as a root, left child, or right child.
	 */
	public void printNodeDetails() {
		System.out.print("depth = " + this.getDepth());
		K key = null;
		String description = "root node";
		// If the parent pointer is not null, we are either a left child or
		// right child.
		if (this.parent != null) {
			key = this.parent.key;
			// Is the current node the same node as the parent's left
			// child?...
			if (this == this.parent.left) {
				description = "left child";
			} else {
				// ... If not, the current node must be the right child.
				description = "right child";
			}
		}
		System.out.print(". Parent key is " + key);
		System.out.println(". I am a " + description + ".");

	}
}
