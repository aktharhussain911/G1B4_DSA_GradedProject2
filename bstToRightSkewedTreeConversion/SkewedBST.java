package bstToRightSkewedTreeConversion;

public class SkewedBST {
	Node node=null;

	// Right rotation method to convert BST to a right-skewed tree
	private Node rightRotate(Node root) {
		if (root == null || root.left == null) {
			return root;
		}

		Node newRoot = root.left;
		root.left = newRoot.right;
		newRoot.right = root;
		return newRoot;
	}

	// Function to convert BST to a right-skewed tree
	Node convertToRightSkewedTree(Node root) {
		if (root == null) {
			return null;
		}

		// Convert left subtree to a right-skewed tree
		root.left = convertToRightSkewedTree(root.left);

		// Perform right rotation until there are no left children
		while (root.left != null) {
			root = rightRotate(root);
		}

		// Convert right subtree to a right-skewed tree
		root.right = convertToRightSkewedTree(root.right);

		return root;
	}

	// Display node values in ascending order (right-skewed tree)
	void displayRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.key + " ");
		displayRightSkewedTree(root.right);
	}
}
