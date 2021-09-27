package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Stack;

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

	static void printlevel(Node node, int level, boolean leftToRight) {
		// TODO Auto-generated method stub

		if (node == null)
			return;

		if (level == 1) {
			System.out.print(node.key + "   ");
		} else if (level > 1) {

			if (leftToRight) {
				printlevel(node.left, level - 1, leftToRight);
				printlevel(node.right, level - 1, leftToRight);
			} else {
				printlevel(node.right, level - 1, leftToRight);
				printlevel(node.left, level - 1, leftToRight);

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

	static int diameter(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}

		int leftdepth = diameter(root.left);
		int rightdepth = diameter(root.right);

		int temp = Math.max(leftdepth, rightdepth) + 1;
		int answer = leftdepth + rightdepth + 1;

		if (Math.max(temp, answer) > diameter) {

			diameter = Math.max(temp, answer);
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

	private static boolean hasPathSum(Node root, int sum) {

		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null && sum - root.key == 0) {
			return true;
		} else {
			return hasPathSum(root.left, sum - root.key) || hasPathSum(root.right, sum - root.key);
		}

	}

	private static boolean validBST(Node root, Integer low, Integer high) {
		// TODO Auto-generated method stub

		if (root == null) {
			return true;
		}

		else if (root.left != null && low != null && root.key < low) {
			return false;
		} else if (root.right != null && high != null && root.key > high) {
			return false;
		}

		return validBST(root.left, low, root.key) && validBST(root.right, root.key, high);

	}

	static boolean isValidBST(Node root) {

		return validBST(root, null, null);
	}

	static boolean mirrorSymmetric(Node node1, Node node2) {
		// TODO Auto-generated method stub
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1.key == node2.key)
			return (mirrorSymmetric(node1.left, node2.right) && mirrorSymmetric(node1.right, node2.left));

		return false;

	}

	static boolean isSymmetric(Node parent) {
		return mirrorSymmetric(parent, parent);
	}


	static void flatten(Node parent) {

		if (parent == null || (parent.left == null && parent.right == null))
			return;

		if (parent.left != null) {

			flatten(parent.left);

			Node right = parent.right;

			parent.right = parent.left;

			parent.left = null;

			Node temp = parent.right;
			while (temp != null)
				temp = temp.right;

			parent.right = temp;

		}

		flatten(parent.right);

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

		diameter(tree.root);

		System.out.println("diameter is " + diameter);

		leftView(tree.root);

		max_level = 0;

		System.out.println();

		rightView(tree.root);
		System.out.println();

		System.out.println("top view");

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

		System.out.println("is valid bst " + isValidBST(tree.root));

		System.out.println("pre (Root, Left, Right)");
		tree.Preorder(tree.root);
		System.out.println("-----");
		nodeToRootpath(tree.root, 25, listPath1);
		System.out.println("root to node path " + listPath1);

		nodeToRootpath(tree.root, 60, listPath2);
		System.out.println("root to node path " + listPath2);

		int i = listPath2.size() - 1;
		int j = listPath1.size() - 1;
		while (i > 0 && j > 0) {

			if (listPath2.get(i) == listPath1.get(j)) {
				j--;
				i--;
			} else
				break;

		}

		System.out.println("LCS is " + listPath2.get(i + 1));

		Collections.reverse(listPath1);
		Collections.reverse(listPath2);

		int lastMatch;
		while (listPath1.size() > 0 && listPath2.size() > 0 && listPath1.get(0).equals(listPath2.get(0))) {
			lastMatch = listPath1.get(0);

			listPath1.remove(0);
			listPath2.remove(0);

		}

		System.out.println(listPath1);

		System.out.println(listPath2);

		System.out.println("distance between path " + (listPath1.size() + listPath2.size() + 1));

		// 112. Path Sum
		boolean res = hasPathSum(tree.root, 140);
		System.out.println("has path sum " + res);

		System.out.println("mirror");
		mirror(tree.root);

		// 101. Symmetric Tree
		boolean isSymmetric = isSymmetric(tree.root);
		System.out.println("isSymmetric " + isSymmetric);
		
		// 114. Flatten Binary Tree to Linked List
		flatten(tree.root);

	}

}
