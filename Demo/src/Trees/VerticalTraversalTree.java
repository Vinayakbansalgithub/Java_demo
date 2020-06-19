package Trees;

class VarNode{
	
	VarNode left;
	VarNode right;
	int value;
	public int height;
	
	VarNode(int value){
		this.value=value;
	}
	
}

public class VerticalTraversalTree {
	
	VarNode root = null;
	VarNode parent, current;	
	static boolean flag;
	
	
	
	public VarNode getRoot() {
		return root;
	}

	public void setRoot(VarNode root) {
		this.root = root;
	}

	public VarNode getParent() {
		return parent;
	}

	public void setParent(VarNode parent) {
		this.parent = parent;
	}

	public VarNode getCurrent() {
		return current;
	}

	public void setCurrent(VarNode current) {
		this.current = current;
	}

	void add(int value, VarNode root) {
		// TODO Auto-generated method stub


		if (root == null && flag == false) {
			root = new VarNode(value);
			parent = root;
			flag = true;
			return;

		}

		current = root;

		if (current.value > value) {

			if (current.left == null)
				current.left = new VarNode(value);

			else
				add(value, current.left);
		} else {

			if (current.right == null)
				current.right = new VarNode(value);

			else
				add(value, current.right);
		}

	}
	
	
	
	  private int height(VarNode root){
	        if(root == null){
	            return 0;
	        }else {
	            return root.height;
	        }
	    }
	  private int setHeight(VarNode root) {
		  if(root == null){
	            return 0;
	        }
	        return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));	
	        }
	int balance(VarNode left, VarNode right) {
		// TODO Auto-generated method stub
		  
		  int balance=(height(left)-height(right));
		return balance;
	}
	
	
public static void main(String[] args) {
	VerticalTraversalTree obj= new VerticalTraversalTree();
	
	obj.add(15, null);
	obj.add(10, obj.getParent());
	obj.add(12, obj.getParent());
	obj.add(20, obj.getParent());
	obj.add(25, obj.getParent());
	obj.add(23, obj.getParent());

	/*obj.add(19, obj.getParent());
	obj.add(6, obj.getParent());
//	obj.add(7, obj.getParent());
	obj.add(28, obj.getParent());
	obj.add(11, obj.getParent());
	obj.add(13, obj.getParent());*/
	
	
	int bal=obj. balance( obj.getParent().left,  obj.getParent().right);		
System.out.println("balance factor is "+bal);
	
}
}
