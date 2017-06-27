package Trees;

class TreeNode {
	int value;
	TreeNode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	TreeNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class TreeFromInorderPreorder {

	 static TreeNode root = null;
	 
	 static int count=0;
	  static int indexInorder=0;
 
 static TreeNode createTree(int[] pre,int[] in, int start, int end) {
	 if (start >end) 
         return null;
	 
	 
	 TreeNode root = new TreeNode(pre[count++]);
	 
	 if (start == end)
         return root;
	 
	    int inIndex = findRoot(in, start, end, root.value);
	    root.left=createTree(pre,in,start,(inIndex-1));
	    root.right=createTree(pre,in,(inIndex+1),end);
		return root;
	}
 static int findRoot(int[] in, int start, int end, int value) {

	 int i;
     for (i = start; i <= end; i++) 
     {
         if (in[i] == value)
             return i;
     }
     return i;
	
}
 
 
 
 static void printInorder(TreeNode node) 
 {
     if (node == null)
         return;

     /* first recur on left child */
     printInorder(node.left);

     /* then print the data of node */
     System.out.print(node.value + " ");

     /* now recur on right child */
     printInorder(node.right);
 }

public static void main(String[] args) {
	
	
	int in[] = new int[]{3, 5, 7, 10,12,15,18};
	int pre[] = new int[]{10,5,3,7,15,12,18};
	TreeNode root=createTree(pre,in,0,(pre.length-1));
	
	
	printInorder(root);
	

	

	}



	
}

