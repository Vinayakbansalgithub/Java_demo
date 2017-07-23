package SDEt;
class Bnode{
	int value;
	Bnode left;
	Bnode right;
	boolean flag=false;
	Bnode(int value){
		this.value=value;
	}
	
	
	
	
	
	
	
}
public class BalancedBraces {
	
	Bnode parent,current;
	
 public Bnode getParent() {
		return parent;
	}




	public void setParent(Bnode parent) {
		this.parent = parent;
	}




Bnode add(int i,Bnode node) {
		// TODO Auto-generated method stub
	current= node;
	 if(current==null){
		 current=new Bnode(i);
		 parent=current;
	 
	 return parent;
	 }
	 
	 
	 if(current.value>i){
		 
		 if(current.left==null)
			 current.left= new Bnode(i);
		 else{
			 add(i,current.left); 

		 }
		 
		 
		 
	 }
	 else{
		 
		 if(current.right==null)
			 current.right=	 new Bnode(i);
		 else{
			 add(i,current.right); 

		 }
		 
	 }
	 
	 
	 
	 
	 
	 
	 return parent;
	 
	}
	
	
 static void preorder(Bnode head) {
	// TODO Auto-generated method stub
	if(head==null){
	
		return ;
	}
	
	if(head!=null && head.flag==false){
		System.out.println("value  "+head.value);
	}
	
	
	preorder(head.left);
//	System.out.println(head.value);
	preorder(head.right);
	
	
//	System.out.println(head.value);
	
	
	 
	 
	 
}
 
 
 
 

private static void Inorder(Bnode head) {
	// TODO Auto-generated method stub
	if(head==null){
		
		return ;
	}
	
	
	
	Inorder(head.left);
//	System.out.println(head.value);
	
	if(head!=null && head.flag==false){
		System.out.println("value  "+head.value);
	}
	
	Inorder(head.right);
}




private static void postorder(Bnode head) {
	// TODO Auto-generated method stub
if(head==null){
		
		return ;
	}

	
//	System.out.println(head.value);
	
	
	
	postorder(head.left);
	
	postorder(head.right);
	if(head!=null && head.flag==false){
		System.out.println("value  "+head.value);
	}
}



 static void level(Bnode head) {
	// TODO Auto-generated method stub
	 
	 for (int i = 0; i < 4; i++) {
		levelOrder(head, i,0);
		block=!block;
	}
	 
	
}
 static boolean block=false;
	
 static void levelOrder(Bnode head, int i,int current) {
	// TODO Auto-generated method stub
	if(head==null)return;
	
	
	
	
	levelOrder(head.left,i,current+1);
	levelOrder(head.right,i,current+1);
	
	
	if(block){
		if(i==current ){
			System.out.println(head.value);
			block=true;
			
		return;
		}
	}
	else{
		
		levelOrder(head.right,i,current+1);
		levelOrder(head.left,i,current+1);
		if(i==current ){
			System.out.println(head.value);
			block=true;
			
		return;
		}
		
	}
	
	
}




public static void main(String[] args) {
	BalancedBraces obj= new BalancedBraces();
	obj.add(10,null);
	obj.add(5,obj.getParent());
	obj.add(8,obj.getParent());
	obj.add(1,obj.getParent());
	obj.add(25,obj.getParent());
	obj.add(20,obj.getParent());
	obj.add(3,obj.getParent());
	obj.add(55,obj.getParent());
	
	
	
//	preorder(obj.getParent());
	
	//Inorder(obj.getParent());

//	postorder(obj.getParent());
	
	
	// left view right view level order and spiral view all covered using this
	
	level(obj.getParent());

	
	
	
}



















}
