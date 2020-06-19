package Trees;

import java.util.Arrays;

class Levelnode {
	int value;
	Levelnode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	Levelnode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}

public class LevelOrderTriversal {
	static Levelnode parent,current,root;

	
	public static Levelnode getParent() {
		return parent;
	}
public static void setParent(Levelnode parent) {
		LevelOrderTriversal.parent = parent;
	}

 void add(int value, Levelnode node) {
		// TODO Auto-generated method stub
	 
	
		if(node==null){
			node=new Levelnode(value);
			parent=node;
			return;
			
		}current =node;
		 if(current.value>value){
			if(current.left==null)
				current.left=new  Levelnode(value);
			
			else{
				add(value,current.left);
				
			}
			
			
			}
		else{
			if(current.right==null)
				current.right=new  Levelnode(value);
			
			else{
				add(value,current.right);
				
			}
			
			
		}
		
		
		
	}

 static int arrPreOrder[] = new int[20];
	int counterPreOrder = 0;

	void preOrder(Levelnode parent) {
		// TODO Auto-generated method stub
		if (parent == null)
			return;

		if (parent.isVisited == false) {
			arrPreOrder[counterPreOrder] = parent.value;
			parent.isVisited = true;
			counterPreOrder++;
		}

		preOrder(parent.left);
		preOrder(parent.right);

	}
static int h=0;
	 int maxDepth(Levelnode node) {
		// TODO Auto-generated method stub
	if(node==null){
		return 0;
	}
	else{
	int leftdepth=	maxDepth(node.left);
	int rightdepth	=maxDepth(node.right);
	
	if(leftdepth>rightdepth)
		return leftdepth+1;
	else
		return rightdepth+1;
	
		
	} 
		 
		 
	}
	 static int Minh=0;
	 
	 
	  int minDepth(Levelnode node) {
			// TODO Auto-generated method stub
			if(node==null){
				return 0;
			}
			else{
			int leftdepth=	maxDepth(node.left);
			int rightdepth	=maxDepth(node.right);
			
			if(leftdepth<rightdepth)
				return leftdepth+1;
			else
				return rightdepth+1;
			
				
			} 
				
		}
		
	
	 
	  static void levelTreversal(Levelnode node, int depth) {
			// TODO Auto-generated method stub
			
		  
		  for (int i = 1; i <=depth; i++) {
			printlevel(node, i);
		}
		  
		  
		}
	 static void printlevel(Levelnode node, int depth) {
		// TODO Auto-generated method stub
		 
		 if(node==null)
			 return;
		 if(depth==1){
			 System.out.print(node.value+"   ");
		 }
		 else if(depth>1){
			 
			 printlevel(node.left,depth-1);
			 printlevel(node.right, depth-1);
			 
		 }
		 
		 
		 
		
	}
	public static void main(String[] args) {
		LevelOrderTriversal obj = new LevelOrderTriversal();
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
		obj.add(11, obj.getParent());
		obj.add(13, obj.getParent());
		obj.add(0, obj.getParent());
		obj.add(-1, obj.getParent());
		obj.add(-3, obj.getParent());


		
		//obj.add(-1, obj.getParent());

		
		int depth=obj.maxDepth(obj.getParent());
		System.out.println("depth of tree is  "+depth);
		
		int Mindepth=obj.minDepth(obj.getParent());
		System.out.println("Mindepth of tree is  "+Mindepth);
		
		
		levelTreversal(obj.getParent(),depth);
		
		
		obj.preOrder(obj.getParent());
		 System.out.println("pre order is    "+Arrays.toString(arrPreOrder));
	}
	
	

	
	
}
