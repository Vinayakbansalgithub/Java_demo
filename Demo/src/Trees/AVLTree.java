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
	 AVLNode insert(AVLNode root, int value) {
		// TODO Auto-generated method stub
		if(root==null){
			root=new AVLNode(value);
		}
		else if(value<root.value){
		root.left=	insert(root.left,value);
		}else{
			root.right=	insert(root.right,value);
		}
		 int balance = balance(root.left, root.right);		
		 if(balance > 1){
	           
	            }
	        else if(balance < -1){
	        
	           
	        }
	        else{
	            root.height = setHeight(root);
	        }
		
		return root;
	}
	
	  private int setHeight(AVLNode root) {
		  if(root == null){
	            return 0;
	        }
	        return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));		}
	int balance(AVLNode left, AVLNode right) {
		// TODO Auto-generated method stub
		  
		  int balance=(height(left)-height(right));
		return balance;
	}
	  
	  
	  private int height(AVLNode root){
	        if(root == null){
	            return 0;
	        }else {
	            return root.height;
	        }
	    }
	public static void main(String[] args) {
	        AVLTree tree = new AVLTree();
	 
	        /* Constructing tree given in the above figure */
	        tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        tree.root = tree.insert(tree.root, 25);

	        tree.root= tree.insert(tree.root,23);
	        tree.root= tree.insert(tree.root, 47);
	        tree.root=tree.insert(tree.root, 11);
	        tree.root= tree.insert(tree.root, 44);
	 
	        /* The constructed AVL Tree would be
	             30
	            /  \
	          20   40
	         /  \     \
	        10  25    50
	        */
	      
	    }



	
}
