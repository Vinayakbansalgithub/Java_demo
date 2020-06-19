package Trees;
class GNode 
{
    int data;
    GNode left, right;
  
    public GNode(int d) 
    {
        data = d;
        left = right = null;
    }
}
  
public class SpiralTriversalGeek {
	 GNode root;
	  
	    // Function to print the spiral traversal of tree
	    void printSpiral(GNode GNode) 
	    {
	        int h = height(GNode);
	        int i;
	  
	        /* ltr -> left to right. If this variable is set then the
	           given label is transversed from left to right */
	        boolean ltr = false;
	        for (i = 1; i <= h; i++) 
	        {
	            printGivenLevel(GNode, i, ltr);
	  
	            /*Revert ltr to traverse next level in opposite order*/
	            ltr = !ltr;
	        }
	  
	    }
	  
	    /* Compute the "height" of a tree -- the number of
	    GNodes along the longest path from the root GNode
	    down to the farthest leaf GNode.*/
	    int height(GNode GNode) 
	    {
	        if (GNode == null) 
	            return 0;
	        else
	        {
	              
	            /* compute the height of each subtree */
	            int lheight = height(GNode.left);
	            int rheight = height(GNode.right);
	  
	            /* use the larger one */
	            if (lheight > rheight) 
	                return (lheight + 1);
	            else
	                return (rheight + 1);
	        }
	    }
	  
	    /* Print GNodes at a given level */
	    void printGivenLevel(GNode GNode, int level, boolean ltr) 
	    {
	        if (GNode == null) 
	            return;
	        if (level == 1) 
	            System.out.print(GNode.data + " ");
	        else if (level > 1) 
	        {
	            if (ltr != false) 
	            {
	                printGivenLevel(GNode.left, level - 1, ltr);
	                printGivenLevel(GNode.right, level - 1, ltr);
	            } 
	            else
	            {
	                printGivenLevel(GNode.right, level - 1, ltr);
	                printGivenLevel(GNode.left, level - 1, ltr);
	            }
	        }
	    }
	    /* Driver program to test the above functions */
	    public static void main(String[] args) 
	    {
	    	SpiralTriversalGeek tree = new SpiralTriversalGeek();
	        tree.root = new GNode(1);
	        tree.root.left = new GNode(2);
	        tree.root.right = new GNode(3);
	        tree.root.left.left = new GNode(7);
	        tree.root.left.right = new GNode(6);
	        tree.root.right.left = new GNode(5);
	        tree.root.right.right = new GNode(4);
	        System.out.println("Spiral order traversal of Binary Tree is ");
	        tree.printSpiral(tree.root);
	    }
}
