package Trees;


class GivenNode{
	int value;
	GivenNode left;
	GivenNode right;
	
	GivenNode(int value){
		this.value=value;
	}
	
}

public class GivenTreeBST {
	static GivenNode root;
	static boolean flag=true;
	
	 static void BSTCheck(GivenNode root) {
		// TODO Auto-generated method stub
		 
		 
		 if(root == null){
			 return;
		 }
		 
		 
		 
		
		 BSTCheck(root.left);
		 
		 
		
			 BSTCheck(root.right);
		 
		 
		 
		 if(root.left!=null){
		 if(root.left.value<root.value){
			 
			// flag=true; 
		 }
		 else
			 flag=false;
		 }
		 if(root.right!=null){
			 if(root.right.value>root.value){
				 
				// flag=true; 
			 }
			 else{
				 flag=false;
				// return flag;
				 
			 }
			 }
		 
		 
		// return flag;
		 
		 
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		GivenTreeBST tree = new GivenTreeBST();
		tree.root = new GivenNode(10);
		tree.root.left = new GivenNode(5);
		tree.root.right = new GivenNode(20);
		tree.root.left.left = new GivenNode(1);
		tree.root.left.right = new GivenNode(7);
		tree.root.right.left = new GivenNode(18);
		tree.root.right.right = new GivenNode(91);
		
		tree.root.left.left.left = new GivenNode(991);
		tree.root.left.left.right = new GivenNode(3);
		
		System.out.println(root);
		
		BSTCheck(root);
		
		System.out.println("given tree is BST   "+flag);
		
	}







	
}
