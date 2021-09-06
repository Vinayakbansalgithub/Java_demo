package Trees;


class Comnode {
	int value;
	Comnode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	Comnode(int value) {
		this.value = value;
		left = null;
		right = null;
		boolean leftstore;
		boolean rightstore;
	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class CompleteBinaryTreeCheck {
	Comnode root = null;
	Comnode parent, current;

	public Comnode getParent() {
		return parent;
	}

	public void setParent(Comnode parent) {
		this.parent = parent;
	}

	boolean flag = false;
	boolean lastVisited = false;

	void add(int value, Comnode root) {
		// TODO Auto-generated method stub

		if (root == null && flag == false) {
			root = new Comnode(value);
			parent = root;
			flag = true;
			return;

		}

		current = root;

		if (current.value > value) {

			if (current.left == null)
				current.left = new Comnode(value);

			else
				add(value, current.left);
		} else {

			if (current.right == null)
				current.right = new Comnode(value);

			else
				add(value, current.right);
		}

	}
	static int h = 0;
	static int maxDepth(Comnode node) {
		
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
  
			
			System.out.println("depth for element  "+node.value+"   is  "+h);
			return h;
		}
	}
	 static int TotalNodes(Comnode node) {
		// TODO Auto-generated method stub
		 if(node==null){
			 return 0;
		 }else{
		 return(1+TotalNodes(node.left)
				 +
		 TotalNodes(node.right));
		 
		 }
	}
	
	 
	 boolean isComplete(Comnode root, int index, int number_nodes)
	    {
	        // An empty tree is complete
	        if (root == null)        
	           return true;
	  
	        // If index assigned to current node is more than
	        // number of nodes in tree, then tree is not complete
	        if (index >= number_nodes)
	           return false;
	  
	        // Recur for left and right subtrees
	        return (isComplete(root.left, 2 * index + 1, number_nodes)
	            && isComplete(root.right, 2 * index + 2, number_nodes));
	  
	    }
	 
	public static void main(String[] args) {
		CompleteBinaryTreeCheck obj = new CompleteBinaryTreeCheck();
		obj.add(10, null);
		obj.add(5, obj.getParent());
		obj.add(3, obj.getParent());
		obj.add(7, obj.getParent());
		obj.add(15, obj.getParent());
		obj.add(12, obj.getParent());

		obj.add(20, obj.getParent());
		obj.add(1, obj.getParent());
		obj.add(4, obj.getParent());
		//obj.add(8, obj.getParent());
		obj.add(6, obj.getParent());
		obj.add(8, obj.getParent());

		int depth = CompleteBinaryTreeCheck.maxDepth(obj.getParent());
		System.out.println(depth);
		
		int total=TotalNodes(obj.getParent());
		System.out.println("total nodes "+total); 
		int index=0;
		if (obj.isComplete(obj.getParent(), index, total))
            System.out.print("The binary tree is complete");
        else
            System.out.print("The binary tree is not complete"); 

		
	}

	
		
}