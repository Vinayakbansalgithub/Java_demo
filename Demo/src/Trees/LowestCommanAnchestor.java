package Trees;

class LowerAnchesterNode {
	int value;
	LowerAnchesterNode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	LowerAnchesterNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class LowestCommanAnchestor {
	
	
	
static LowerAnchesterNode parent,current,root;

	
	public static LowerAnchesterNode getParent() {
		return parent;
	}
public static void setParent(LowerAnchesterNode parent) {
	LowestCommanAnchestor.parent = parent;
	}

	

 void add(int value, LowerAnchesterNode node) {
		// TODO Auto-generated method stub
	 
	
		if(node==null){
			node=new LowerAnchesterNode(value);
			parent=node;
			return;
			
		}current =node;
		 if(current.value>value){
			if(current.left==null)
				current.left=new  LowerAnchesterNode(value);
			
			else{
				add(value,current.left);
				
			}
			
			
			}
		else{
			if(current.right==null)
				current.right=new  LowerAnchesterNode(value);
			
			else{
				add(value,current.right);
				
			}
			
			
		}
		
		
		
	}
 private static LowerAnchesterNode findAnchestor(LowerAnchesterNode node, int i, int j) {
		// TODO Auto-generated method stub
	 if(node==null){
		 return null;
	 }
	 if(node.value==i || node.value==j){
		 
		 return node;
		 
	 }
	 
	
		 
	 LowerAnchesterNode left= findAnchestor(node.left, i, j);
	 LowerAnchesterNode right= findAnchestor(node.right, i, j);
	 
		 if(left!=null && right!=null){
			 //System.out.println("value returned for "+left.value+" and "+right.value+" is "+root.value);
			 
			 return node;
		 }	 if(left==null && right==null){
			 //System.out.println("value returned for "+left.value+" and "+right.value+" is "+root.value);
			 
			 return null;
		 }
		 
		return left!=null?left:right;
		 
		

	 
	 
	 
		
	}
 
 
 static boolean flag=true;
 static LowerAnchesterNode temp;
  static LowerAnchesterNode findAnchestorBST(LowerAnchesterNode node, int i, int j) {
		// TODO Auto-generated method stub
	if(node==null){
		return null;
	}
	  if(parent.value>i && parent.value<j ||parent.value<i && parent.value>j){
		  return node;
	  }
	  
	  if(node.value==i || node.value==j){
			
			temp=node;
			 flag=false;
			
			 
		 }
	
		  while(flag){
		  LowerAnchesterNode left= findAnchestorBST(node.left, i, j);
			 LowerAnchesterNode right= findAnchestorBST(node.right, i, j);
		  
			 if(left==null && right==null){
				 //System.out.println("value returned for "+left.value+" and "+right.value+" is "+root.value);
				 
				 return null;
			 }
		  }
	  
			 return temp;
	  
	  
	  
	}

public static void main(String[] args) {
	LowestCommanAnchestor obj = new LowestCommanAnchestor();
	obj.add(15, null);
	obj.add(10, obj.getParent());
	obj.add(12, obj.getParent());
	obj.add(20, obj.getParent());
	obj.add(25, obj.getParent());
	obj.add(23, obj.getParent());

	obj.add(19, obj.getParent());
	obj.add(6, obj.getParent());
	obj.add(7, obj.getParent());
	obj.add(28, obj.getParent());
	obj.add(1, obj.getParent());

	
	
//	LowerAnchesterNode val=findAnchestor(parent,19,6);
//	System.out.println(val.value);
	LowerAnchesterNode lnode=findAnchestorBST(parent,1,28);
	System.out.println(lnode.value);
	
}

}
