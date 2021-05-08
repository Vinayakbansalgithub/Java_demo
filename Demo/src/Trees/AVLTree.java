package Trees;

class AVLNode {
	int value, height;
	AVLNode left, right;

	AVLNode(int d) {
		value = d;
		height = 1;
	}
}

public class AVLTree {
	AVLNode root;

	static int maxDepth(AVLNode node) {
		int h = 0;
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
	
	// A utility function to get maximum of two integers 
    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
	
	// A utility function to right rotate subtree rooted with y 
    // See the diagram given above. 
	AVLNode rightRotate(AVLNode y) { 
		AVLNode x = y.left; 
		AVLNode T2 = x.right; 
  
        // Perform rotation 
        x.right = y; 
        y.left = T2; 
  
        // Update heights 
        y.height = max(setHeight(y.left), setHeight(y.right)) + 1; 
        x.height = max(setHeight(x.left), setHeight(x.right)) + 1; 
  
        // Return new root 
        return x; 
    } 
  
    // A utility function to left rotate subtree rooted with x 
    // See the diagram given above. 
	AVLNode leftRotate(AVLNode x) { 
    	AVLNode y = x.right; 
    	AVLNode T2 = y.left; 
  
        // Perform rotation 
        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(setHeight(x.left), setHeight(x.right)) + 1; 
        y.height = max(setHeight(y.left), setHeight(y.right)) + 1; 
  
        // Return new root 
        return y; 
    } 

	AVLNode insert(AVLNode root, int value) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = new AVLNode(value);
		} else if (value < root.value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		int balance = balance(root.left, root.right);
		if (balance > 1) {
            return rightRotate(root); 

		} else if (balance < -1) {
            return leftRotate(root); 

		} else {
			root.height = setHeight(root);
		}

		return root;
	}

	private int setHeight(AVLNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
	}

	int balance(AVLNode left, AVLNode right) {
		// TODO Auto-generated method stub

		int balance = (height(left) - height(right));
		return balance;
	}

	private int height(AVLNode root) {
		if (root == null) {
			return 0;
		} else {
			return root.height;
		}
	}
	
	// A utility function to print preorder traversal 
    // of the tree. 
    // The function also prints height of every node 
    void preOrder(AVLNode node) { 
        if (node != null) { 
            System.out.print(node.value + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    } 

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();

		/* Constructing tree given in the above figure */
//		tree.root = tree.insert(tree.root, 14);
//		tree.root = tree.insert(tree.root, 17);
//		tree.root = tree.insert(tree.root, 11);
//		tree.root = tree.insert(tree.root, 7);
//		tree.root = tree.insert(tree.root, 53);
//		tree.root = tree.insert(tree.root, 4);

		
		tree.root = tree.insert(tree.root, 10); 
        tree.root = tree.insert(tree.root, 20); 
        tree.root = tree.insert(tree.root, 30); 
        tree.root = tree.insert(tree.root, 40); 
        tree.root = tree.insert(tree.root, 50); 
        tree.root = tree.insert(tree.root, 25); 

		/*
		 * The constructed AVL Tree would be 30 / \ 20 40 / \ \ 10 25 50
		 */

		
		System.out.println("Preorder traversal" + 
                " of constructed tree is : "); 
tree.preOrder(tree.root); 

	}

}
