package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

class Pair {
	public final int value; // first field of a pair
	public final int level; // second field of a pair

	// Constructs a new Pair with specified values
	Pair(int value, int level) {
		this.value = value;
		this.level = level;
	}

	@Override
	public String toString() {
		return "Pair [value=" + value + ", level=" + level + "]";
	}

}

public class BinarySearchTree {

	/* Class containing left and right child of current node and key value */
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}

		@Override
		public String toString() {
			return "Node [key=" + key + ", left=" + left + ", right=" + right + "]";
		}

	}

	// Root of BST
	Node root;

	static Map<Integer, Pair> map = new HashMap<Integer, Pair>();

	// Constructor
	BinarySearchTree() {
		root = null;
	}

	// This method mainly calls insertRec()
	void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void Postorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		Postorder(node.left);

		// then recur on right subtree
		Postorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void Inorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		Inorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		Inorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void Preorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		Preorder(node.left);

		/* now recur on right subtree */
		Preorder(node.right);
	}

	static int depth(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		int leftdepth = depth(root.left);
		int rightdepth = depth(root.right);

		return Math.max(leftdepth, rightdepth) + 1;

	}

	static void levelTreversal(Node node, int depth, boolean leftToRight) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= depth; i++) {
			printlevel(node, i, leftToRight);
		}

	}

	static void printlevel(Node node, int depth, boolean leftToRight) {
		// TODO Auto-generated method stub

		if (node == null)
			return;

		if (depth == 1) {
			System.out.print(node.key + "   ");
		} else if (depth > 1) {

			if (leftToRight) {
				printlevel(node.left, depth - 1, leftToRight);
				printlevel(node.right, depth - 1, leftToRight);
			} else {
				printlevel(node.right, depth - 1, leftToRight);
				printlevel(node.left, depth - 1, leftToRight);

			}

		}

	}

	private static void Zigzag(Node root, int depth) {

		boolean leftToRight = true;
		for (int i = 1; i <= depth; i++) {
			printlevel(root, i, leftToRight);
			leftToRight = !leftToRight;

		}

	}

	static int diameter;

	static int diameter(Node root, int result) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}

		int leftdepth = diameter(root.left, result);
		int rightdepth = diameter(root.right, result);

		int temp = Math.max(leftdepth, rightdepth) + 1;
		int answer = leftdepth + rightdepth + 1;

		if (Math.max(temp, answer) > result) {
			result = Math.max(temp, answer);
			diameter = result;
		}

		return temp;

	}

	static int max_level = 0;

	// recursive function to print left view
	static void leftViewUtil(Node node, int level) {
		// Base Case
		if (node == null)
			return;

		// If this is the first node of its level
		if (max_level < level) {
			System.out.print(" " + node.key);
			max_level = level;
		}

		// Recur for left and right subtrees
		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}

	// A wrapper over leftViewUtil()
	static void leftView(Node root) {
		leftViewUtil(root, 1);
	}

	// recursive function to print left view
	static void rightViewUtil(Node node, int level) {
		// Base Case
		if (node == null)
			return;

		// If this is the first node of its level
		if (max_level < level) {
			System.out.print(" " + node.key);
			max_level = level;
		}

		// Recur for right and left subtrees
		rightViewUtil(node.right, level + 1);
		rightViewUtil(node.left, level + 1);
	}

	// A wrapper over leftViewUtil()
	static void rightView(Node root) {
		rightViewUtil(root, 1);
	}

	static void topView(Node root, Map<Integer, Pair> map, int dist, int level) {
		// TODO Auto-generated method stub

		// Base case
		if (root == null)
			return;

		// update only when level is greater then expected level
		if (!map.containsKey(dist) || map.get(dist).level > level) {
			// update value and level for current distance
			map.put(dist, new Pair(root.key, level));
		}

		topView(root.left, map, dist - 1, level + 1);

		// Store nodes in right subtree
		topView(root.right, map, dist + 1, level + 1);

	}

	static void bottomView(Node root, Map<Integer, Pair> map, int dist, int level) {
		// TODO Auto-generated method stub

		// Base case
		if (root == null)
			return;

		if (!map.containsKey(dist) || map.get(dist).level < level) {
			// update value and level for current distance
			map.put(dist, new Pair(root.key, level));
		}

		bottomView(root.left, map, dist - 1, level + 1);

		// Store nodes in right subtree
		bottomView(root.right, map, dist + 1, level + 1);

	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}

	static boolean isBalanced = true;

	static int isBalanced(Node root) {
		// TODO Auto-generated method stub

		if (root == null)
			return 0;

		int leftHight = isBalanced(root.left);

		int rightHight = isBalanced(root.right);

		int gap = Math.abs(rightHight - leftHight);

		if (gap > 1)
			isBalanced = false;

		return Math.max(leftHight, rightHight) + 1;

	}

	static Node mirror(Node parent) {
		// TODO Auto-generated method stub\
		if (parent == null) {
			return parent;
		} else {
			mirror(parent.left);
			mirror(parent.right);

			Node temp = parent.left;
			parent.left = parent.right;
			parent.right = temp;
			return parent;
		}

	}

	static ArrayList<Integer> listPath1 = new ArrayList<>();
	static ArrayList<Integer> listPath2 = new ArrayList<>();

	static boolean nodeToRootpath(Node root, int find, ArrayList<Integer> listPath) {

		if (root == null) {
			return false;
		}

		if (root.key == find) {
			listPath.add(root.key);
			return true;
		}

		boolean fromLeft = nodeToRootpath(root.left, find, listPath);
		if (fromLeft) {
			listPath.add(root.key);
			return true;
		}

		boolean fromRight = nodeToRootpath(root.right, find, listPath);
		if (fromRight) {
			listPath.add(root.key);
			return true;
		}

		return false;
	}

	// Driver Program to test above functions
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */

		tree.insert(50);
		tree.insert(25);
		tree.insert(60);
		tree.insert(10);
		tree.insert(35);

		tree.insert(30);
		tree.insert(45);

		tree.insert(65);

		System.out.println("pre (Root, Left, Right)");
		tree.Preorder(tree.root);
		System.out.println();
		System.out.println("in (Left, Root, Right)");
		tree.Inorder(tree.root);
		System.out.println();
		System.out.println(" post (Left, Right, Root)");
		tree.Postorder(tree.root);
		System.out.println();
		int depth = depth(tree.root);

		System.out.println("depth is " + depth);

		System.out.println("level");

		levelTreversal(tree.root, depth, true);
		System.out.println();

		System.out.println("Zigzag");

		Zigzag(tree.root, depth);

		diameter(tree.root, Integer.MIN_VALUE);

		System.out.println("diameter is " + diameter);

		leftView(tree.root);

		max_level = 0;

		System.out.println();

		rightView(tree.root);
		System.out.println();

		System.out.println("top view");

		// System.out.println("vertical view");
//		for (Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
//			System.out.print(entry.getValue() + "   ");
//
//		}

		System.out.println();
		System.out.println("top view");
		topView(tree.root, map, 0, 0);
		for (Entry<Integer, Pair> entry : map.entrySet()) {
			System.out.print(entry.getValue() + "  ");

		}

		System.out.println();

		map.clear();

		System.out.println("bottom view");
		bottomView(tree.root, map, 0, 0);
		for (Entry<Integer, Pair> entry : map.entrySet()) {
			System.out.print(entry.getValue() + "  ");

		}

		// isbalanced
		System.out.println();

		isBalanced(tree.root);

		System.out.println("is BALANCED  " + isBalanced);

		System.out.println();

		System.out.println("mirror");
		mirror(tree.root);

		System.out.println("pre (Root, Left, Right)");
		tree.Preorder(tree.root);

		nodeToRootpath(tree.root, 45, listPath1);
		System.out.println("root to node path " + listPath1);

		nodeToRootpath(tree.root, 30, listPath2);
		System.out.println("root to node path " + listPath2);

		int i = listPath2.size() - 1;
		int j = listPath1.size() - 1;
		while (i > 0 && j > 0) {

			if (listPath2.get(i) == listPath1.get(j)) {
				j--;
				i--;
			}

		}

		System.out.println("LCS is " + listPath2.get(i + 1));

		boolean res = hasPathSum(tree.root, 155);
		System.out.println("has path " + res);

	}

	private static boolean hasPathSum(Node root, int sum) {
		// TODO Auto-generated method stub

		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null && sum - root.key == 0) {
			return true;
		} else {
			return hasPathSum(root.left, sum - root.key) || hasPathSum(root.right, sum - root.key);
		}

	}

}
