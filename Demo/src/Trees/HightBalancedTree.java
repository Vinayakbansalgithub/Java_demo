package Trees;

import java.util.Arrays;

import org.apache.poi.hslf.usermodel.RichTextRun;

class HightNode {
	int value;
	HightNode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	HightNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class HightBalancedTree {
	
static HightNode parent,current,root;

	
	public static HightNode getParent() {
		return parent;
	}
public static void setParent(HightNode parent) {
	HightBalancedTree.parent = parent;
	}

 void add(int value, HightNode node) {
		// TODO Auto-generated method stub
	 
	
		if(node==null){
			node=new HightNode(value);
			parent=node;
			return;
			
		}current =node;
		 if(current.value>value){
			if(current.left==null)
				current.left=new  HightNode(value);
			
			else{
				add(value,current.left);
				
			}
			
			
			}
		else{
			if(current.right==null)
				current.right=new  HightNode(value);
			
			else{
				add(value,current.right);
				
			}
			
			
		}
		
		
		
	}
 
 
 static int h=0;
 static  HightNode temp=null;
 static  HightNode tempRotate=null;
 /*static int leftdepth;
 static int rightdepth;
 */
 int maxDepth(HightNode hightNode) {
	// TODO Auto-generated method stub
	 
	
	 
if(hightNode==null){
	return 0;
}

else {
	int leftdepth=	maxDepth(hightNode.left);
/*s*/

	int rightdepth	=maxDepth(hightNode.right);

/*if(leftdepth==2 ){
	tempRotate=hightNode;
	temp=hightNode.left;
	return leftdepth-1;
	
}
if(rightdepth==2 ){
	tempRotate=hightNode;
	temp=hightNode.right;
	return rightdepth-1;
	
}*/

/*if(Math.abs(leftdepth-rightdepth)>1){
	//System.out.println("More the one difference");
	System.out.println("not an avl tree");
	
}*/



/*if(leftdepth!=0 &&rightdepth!=0){
	leftdepth=0;
	rightdepth=0;
}*/
 
 System.out.println("("+leftdepth+","+ rightdepth+")"+"for node  "+hightNode.value);

if(leftdepth>rightdepth)
	return leftdepth+1;
else
	return rightdepth+1;


	
} 
	 
	 
}
 /*
 static int arrIntOrder[] = new int[20];
	static int counterInOrder = 0;

	void InOrder(HightNode parent) {
		// TODO Auto-generated method stub

		if (parent == null)
			return;

		InOrder(parent.left);

		// leaf node

		if (parent.left == null) {

			arrIntOrder[counterInOrder] = parent.value;
			parent.isVisited = true;
			counterInOrder++;

		}
		if (parent.left != null && parent.left.isVisited == true) {

			arrIntOrder[counterInOrder] = parent.value;
			parent.isVisited = true;
			counterInOrder++;
		}

		InOrder(parent.right);

	}*/
 
	public static void main(String[] args) {
		HightBalancedTree obj = new HightBalancedTree();
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
	
		obj.add(-3, obj.getParent());
		obj.add(-1, obj.getParent());
		obj.add(-10, obj.getParent());
		obj.add(-11, obj.getParent());
		/*obj.add(11, obj.getParent());
		obj.add(13, obj.getParent());
		obj.add(0, obj.getParent());
		
		*/
		
		System.out.println("Height balanced tree");
		int depth=obj.maxDepth(obj.getParent());
		
		
if(depth==-1)	
	System.out.println("not an avl tree");
else
	System.out.println("avl tree");
/*obj.InOrder(obj.getParent());
System.out.println(Arrays.toString(arrIntOrder));*/

	}
	
}

