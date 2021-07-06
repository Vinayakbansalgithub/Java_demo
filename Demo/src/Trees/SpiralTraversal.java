package Trees;

import java.util.Arrays;

class SpiralNode {
	int data;
	SpiralNode left, right;
	boolean printed = false;

	public SpiralNode(int d) {
		data = d;
		left = right = null;
	}
}

public class SpiralTraversal {

	SpiralNode root;

	static int h = 0;

	static int maxDepth(SpiralNode node) {
		h = 0;
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				h = lDepth + 1;
			else {
				h = (rDepth + 1);
			}

			return h;
		}
	}

	static int[] arr = new int[20];
	static int i = 0;
	static int counter = 0;
	static boolean flag = false;

	void printSpiral(SpiralNode root) {
		// TODO Auto-generated method stub

		if (i == 0) {
			arr[counter] = root.data;
			root.printed = true;
			counter++;

		} else {
			arr[counter] = root.data;
			counter++;
			root.printed = true;
			return;
		}
		if (root == null)
			return;

		SpiralNode temp1 = null;
		SpiralNode temp2 = null;

		while (i < h - 1) {
			i++;
			flag = !flag;

			if (flag == true) {

				SpiralNode val = root;
				temp1 = root.right;

				for (int k = 0; k < Math.pow(2, i); k++) {

					printSpiral(root.right);
					k++;
					printSpiral(root.left);
					k++;
					root = temp2;

				}
				root = val.left;
			}
			if (flag == false) {
				temp2 = root.left;
				for (int l = 0; l < Math.pow(2, i); l++) {

					printSpiral(root.left);
					l++;
					printSpiral(root.right);
					l++;
					root = temp1;
				}

				root = root.right;
			}

		}

	}

	public static void main(String[] args) {
		SpiralTraversal tree = new SpiralTraversal();
		tree.root = new SpiralNode(1);
		tree.root.left = new SpiralNode(2);
		tree.root.right = new SpiralNode(3);
		tree.root.left.left = new SpiralNode(7);
		tree.root.left.right = new SpiralNode(6);
		tree.root.right.left = new SpiralNode(5);
		tree.root.right.right = new SpiralNode(4);

		tree.root.left.left.left = new SpiralNode(7);
		tree.root.left.left.right = new SpiralNode(6);
		tree.root.left.right.left = new SpiralNode(5);
		tree.root.left.right.right = new SpiralNode(4);

		tree.root.right.right.right = new SpiralNode(9);
		tree.root.right.right.left = new SpiralNode(12);
		tree.root.right.left.left = new SpiralNode(16);
		tree.root.right.left.right = new SpiralNode(18);

		System.out.println("Spiral order traversal of Binary Tree is ");

		int hight = maxDepth(tree.root);
		tree.printSpiral(tree.root);

		System.out.println(Arrays.toString(arr));
	}

}
