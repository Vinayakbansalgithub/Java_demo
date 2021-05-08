package Trees;

import java.util.Stack;


class AnchesterNode {
	int value;
	AnchesterNode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	AnchesterNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class AllAncestor {
static AnchesterNode parent,current,root;

	
	public static AnchesterNode getParent() {
		return parent;
	}
public static void setParent(AnchesterNode parent) {
	AllAncestor.parent = parent;
	}

	

 void add(int value, AnchesterNode node) {
		// TODO Auto-generated method stub
	 
	
		if(node==null){
			node=new AnchesterNode(value);
			parent=node;
			return;
			
		}current =node;
		 if(current.value>value){
			if(current.left==null)
				current.left=new  AnchesterNode(value);
			
			else{
				add(value,current.left);
				
			}
			
			
			}
		else{
			if(current.right==null)
				current.right=new  AnchesterNode(value);
			
			else{
				add(value,current.right);
				
			}
			
			
		}
		
		
		
	}
 static void call(AnchesterNode node,int value){
	 System.out.println("ansestor of "+value + "are :"+node.value);
	 while(node.value==value){
		 
		 
		
	 }
	 
 }
 static boolean flag=false;
  static void AnchersterOf(AnchesterNode node,int value) {
		// TODO Auto-generated method stub
	  if(node==null)
		  return ;
	  
	  if(node.value==value){
	
		  flag=true;
		  return;
	  }
	  
	 if(flag==false){
	  AnchersterOf(node.left,value);
		AnchersterOf(node.right,value);

	  if(flag==true){
			AnchersterOf(node,value);
			System.out.println(node.value);
	  } /*if(flag==true)
	  System.out.println(node.value);*/
	
	 }
	 
	
	 

	  
	}
  static Stack<Integer> stack= new Stack<Integer>();
   static void usingStack(AnchesterNode node, int value) {
		// TODO Auto-generated method stub
	   if(node==null)
			  return ;
		  
		  if(node.value==value){
		
			  flag=true;
			  stack.push(node.value);
		  }
		  else if(flag==false){
			  stack.push(node.value);
		  }
		  usingStack(node.left,value);

		  usingStack(node.right,value);
if(flag==false)
		  stack.pop();
	}
	public static void main(String[] args) {
		AllAncestor obj = new AllAncestor();
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
		obj.add(-1, obj.getParent());
	
		AnchersterOf(parent,7);
		System.out.println("=============using stack===========");
	//	usingStack(parent,19);
		
//	System.out.println(stack);
		
		}
	
	
}
