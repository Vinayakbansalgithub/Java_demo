package Trees;

class SumNode {
	int value;
	SumNode left, right;
	
	SumNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class SumTree {
	static SumNode root = null;



	 static int isSumTree(SumNode root) {
		// TODO Auto-generated method stub
		 if(root==null){
			 return 0;
		 }
		 else{
			 
			int leftsum= isSumTree(root.left);
			int rightsum= isSumTree(root.right);

			
			 if(root.value==leftsum+rightsum && leftsum!=0 && rightsum!=0 ){
				 System.out.println("it is a sum tree for node "+root.value );
				 }	 
		 
		 return leftsum+rightsum+root.value;
		 
			 
		 
		 
		
		 }
	}
	public static void main(String[] args) {
		SumTree obj = new SumTree();
		
		obj.root = new SumNode(26);
		obj.root.left = new SumNode(10);
		obj.root.right = new SumNode(3);
		obj.root.left.left = new SumNode(4);
        obj.root.left.right = new SumNode(6);
        obj.root.right.right = new SumNode(3);
        
        isSumTree(root);
		

	}




	
}
