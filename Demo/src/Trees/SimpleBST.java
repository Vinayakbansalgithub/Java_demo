package Trees;

import java.util.Stack;

public class SimpleBST {

	class BSTnode {
		int value;
		BSTnode left, right;

		BSTnode(int value) {
			this.value = value;
			left = null;
			right = null;

		}

		@Override
		public String toString() {

			return "value is " + value;
		}

	}

	BSTnode root;

	public SimpleBST(int[] arr) {
		// TODO Auto-generated constructor stub

		root = construct(arr, 0, arr.length - 1);

	}

	BSTnode construct(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		if (low > high) {
			return null;

		}

		int mid = (high + low) / 2;

		BSTnode node = new BSTnode(arr[mid]);

		node.left = construct(arr, low, mid - 1);
		node.right = construct(arr, mid + 1, high);

		return node;

	}

	public static void main(String[] args) {

		int arr[] = { 100, 20, 30, 40, 50 };
		SimpleBST obj = new SimpleBST(arr);

//		System.out.println();
//		boolean res = obj.isBST(obj.root);
//		System.out.println(res);
//		obj.printInorder(obj.root);
//		System.out.println();
//		obj.preorder(obj.root);
//		System.out.println();
//		obj.postInorder(obj.root);
//		System.out.println();
//
//		System.out.println("=======");

		flatten(obj.root);
		obj.printLevelOrder();

//		obj.root = mirror(obj.root);
//
//		obj.printInorder(obj.root);
//
//		System.out.println("=======");
//
//		System.out.println("height if tree " + obj.height(obj.root));
//
//		obj.printLevelOrder();
//		System.out.println("=======");
//		obj.printleftOrder();
//
//		System.out.println("=======");
//		obj.printrightOrder();
//		System.out.println();
//
//		System.out.println(findLCA(obj.root, 10, 50).value);
	}

	static void flatten(BSTnode parent) {

		Stack<BSTnode> stack = new Stack<BSTnode>();

		stack.add(parent);

		while (!stack.isEmpty()) {

			BSTnode node = stack.pop();

			if (node.right != null)
				stack.add(node.right);

			if (node.left != null)
				stack.add(node.left);

			if (!stack.isEmpty()) {
				node.right = stack.peek();
			}

			node.left = null;

		}

	}

	static boolean isBST(BSTnode parent) {
		// TODO Auto-generated method stub\
		if (parent == null) {
			return true;
		} else {
			isBST(parent.left);
			isBST(parent.right);

		
			if (parent.left == null && parent.right == null) {
				return true;
			} else if (parent.left != null && parent.right != null && parent.left.value < parent.value
					&& parent.right.value > parent.value) {
				return true;
			} else if (parent.right == null && parent.value > parent.left.value) {

				return true;
			} else if (parent.left == null && parent.value < parent.right.value) {

				return true;
			} else
				return false;
		}

	}

	static BSTnode mirror(BSTnode parent) {
		// TODO Auto-generated method stub\
		if (parent == null) {
			return parent;
		} else {
			mirror(parent.left);
			mirror(parent.right);

			BSTnode temp = parent.left;
			parent.left = parent.right;
			parent.right = temp;
			return parent;
		}

	}

	static boolean mirrorSymmetric(BSTnode node1, BSTnode node2) {
		// TODO Auto-generated method stub\
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 != null && node2 != null && node1.value == node2.value)
			return (mirrorSymmetric(node1.left, node2.right) && mirrorSymmetric(node1.right, node2.left));

		return false;

	}

	boolean isSymmetric(BSTnode parent) {
		return mirrorSymmetric(parent, parent);
	}

	void printInorder(BSTnode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		printInorder(root.left);

		System.out.print(root.value + " ");

		printInorder(root.right);

	}

	void preorder(BSTnode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		System.out.print(root.value + " ");

		preorder(root.left);

		preorder(root.right);

	}

	void postInorder(BSTnode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;

		postInorder(root.left);

		postInorder(root.right);

		System.out.print(root.value + " ");

	}

	void printleftOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printleftLevel(root, i);
	}

	/* Print nodes at the left level */
	void printleftLevel(BSTnode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.value + " ");
		else if (level > 1) {
			// printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	void printrightOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printrightLevel(root, i);
	}

	/* Print nodes at the left level */
	void printrightLevel(BSTnode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.value + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			// printGivenLevel(root.right, level - 1);
		}
	}

	void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/* Print nodes at the given level */
	void printGivenLevel(BSTnode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.value + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	int height(BSTnode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			return Math.max(lheight, rheight) + 1;

		}
	}

	static BSTnode findLCA(BSTnode node, int n1, int n2) {
		// Base ca
		if (node == null)
			return node;

		// If either n1 or n2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (node.value == n1 || node.value == n2)
			return node;

		// Look for keys in left and right subtrees
		BSTnode left_lca = findLCA(node.left, n1, n2);
		BSTnode right_lca = findLCA(node.right, n1, n2);

		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,
		// So this node is the LCA
		if (left_lca != null && right_lca != null)
			return node;

		// Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca : right_lca;
	}

}
