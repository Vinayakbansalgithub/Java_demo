package Trees;

class PostInnode {
	int value;
	BSTnode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	PostInnode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}

class Index 
{
    int index;
}
public class TreeFromPostordeInorder {
	

	 static TreeNode root = null;
	 
	 static int count=0;
	  static int indexInorder=0;
	static TreeNode createTree(int[] post,int[] in, int start, int end,Index pIndex) {
		 if (start >end) 
	         return null;
		 
		 
		 TreeNode root = new TreeNode(post[pIndex.index]);
		 (pIndex.index)--;
		 if (start == end)
	         return root;
		 
	        /* Else find the index of this node in Inorder
         traversal */
		 int Inindex= findIndexOfRoot(in, start, end, root.value);
		   
		    
		  
		    
		    root.right=createTree(post,in,(Inindex+1),end,pIndex);
		    root.left=createTree(post,in,start,(Inindex-1),pIndex);
		
			return root;
		}
	 private static int findIndexOfRoot(int[] in, int start, int end, int value) {
		// TODO Auto-generated method stub
		 int i;
	     for (i = start; i <= end; i++) 
	     {
	         if (in[i] == value)
	             return i;
	     }
	     return i;
	}
	static int findIndex(int[] in, int start, int end, int value) {

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
		int post[] = new int[]{3,7,5,12,18,15,10};
		
		Index pIndex = new Index();
        pIndex.index = post.length - 1;

		TreeNode root=createTree(post,in,0,(post.length-1),pIndex);
		
		
		
		printInorder(root);

		

		}
}
