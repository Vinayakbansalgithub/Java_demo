package Trees;

import org.apache.poi.poifs.property.Parent;


class Bnode{
	int value;
	Bnode left,right,prev,next;
	
	Bnode(int value){
		this.value=value;
	}
	
	@Override
	public String toString() {

		return "value is " + value;
	}
}
public class Btree {
	 static Bnode root;
	 static Bnode prevNode;

	static int M=3;
	static Bnode parent;
	static int length=0;	
	static int nodelength=0;

	
	public Bnode getRoot() {
		return root;
	}


	public void setRoot(Bnode root) {
		this.root = root;
	}


	static void insert(Bnode node,int value){
		Bnode temp;
		Bnode newNode;

		if(root==null){
		root=	new Bnode(value);
		nodelength++;
		parent=root;
		return ;

		}
		else{
			temp=node;
			if(temp.right!=null){
				if (temp.value < value) {
					nodelength=1;

					insert(temp.right,value);
					return;
				}
				}
			
			
			int l=getLength(temp);
			
			if(l<M-1){
				
				
				
				
				if(value>node.value ){
					nodelength++;

					while(temp!=null){
						temp=temp.next;
					}
					temp=new Bnode(value);
					temp.prev=node;
					node.next=temp;
					return;
				}
				else{
					temp=new Bnode(value);
					temp.next=node;
					node=temp;
					return;

				}
				
			
			}else{
				
				if(temp.value<value){
				
				while(temp.next!=null &&temp.value<value){
					
					prevNode=temp;
					temp=temp.next;
					
					if(temp.value>value && prevNode.value<value){
					
						break;
					}
				}
				newNode=	new Bnode(value);
				
				if(temp.value<value){
					temp.next=newNode;
					newNode.prev=temp;
					temp=prevNode;
					
				}
				else{
				newNode.next=temp;
				temp.prev=newNode;
			prevNode.next=newNode;
			newNode.prev=prevNode;
			
			temp=prevNode;
			root=temp;
				}
				}
				
				else{
					temp=new Bnode(value);
					temp.next=node;
					node.prev=temp;
					node=temp;
					
					temp=root;

					
					
				}
				
				
				
				length=getLength(temp);
			
				if(length==M){
					System.out.println("split");
				
				temp=	getMiddle(temp);
				}
				
				temp.left=temp.prev;
				temp.right=temp.next;
				temp.prev=null;
				temp.next=null;
				
				if(root.right!=null || root.left!=null){
				if(root.value>temp.value){
					root.left=temp;
				}
				else
				root.right=temp;
						
				System.out.println(root.value );
				nodelength=1;
				
			}
			
			else{
				root=temp;
				parent=root;
			}
			
			
		}
		}
		
		
	}
	
	
	static int getLength(Bnode lengthnode){
		int length=0;
		while(lengthnode!=null){
			length++;
			lengthnode=lengthnode.next;
		}
		return length;
	
	}
	
	static Bnode getMiddle(Bnode root) {
		// TODO Auto-generated method stub
	int MiddleNodeindex=	(length-1)/2;
	int i=0;
	
	Bnode temp=root;
	while(i<MiddleNodeindex)
	{
	temp=temp.next;
		i++;
	}		 
return temp;
		
	}
public static void main(String[] args) {
	Btree obj= new Btree();
	
	obj.insert(null, 50);
	System.out.println("fefdfdfd");
	obj.insert(obj.getParent(), 61);
System.out.println("fefdfdfd");
	obj.insert(obj.getParent(), 55);
	
	System.out.println("dfgfdgfggd");

	obj.insert(obj.getParent(), 73);
	System.out.println("dfgfdgfggd");
	
	obj.insert(obj.getParent(), 90);
	System.out.println("fefdfdfd");

}


public static Bnode getParent() {
	return parent;
}


public static void setParent(Bnode parent) {
	Btree.parent = parent;
}
}
