package bstToRightSkewedTreeConversion;

public class DriverClass {

	public static void main(String[] args) {
		SkewedBST tree = new SkewedBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		// Convert the BST to a right-skewed tree
		Node rightSkewedRoot = tree.convertToRightSkewedTree(tree.node);

		// Display node values in ascending order (right-skewed tree)

		tree.displayRightSkewedTree(rightSkewedRoot);

	}

}
