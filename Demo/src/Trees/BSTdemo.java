package Trees;

import java.util.Arrays;


class BSTnode {
	int value;
	BSTnode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	BSTnode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}

public class BSTdemo {

	BSTnode root = null;
	BSTnode parent, current;

	public BSTnode getParent() {
		return parent;
	}

	public void setParent(BSTnode parent) {
		this.parent = parent;
	}

	boolean flag = false;
	boolean lastVisited = false;

	void add(int value, BSTnode root) {
		// TODO Auto-generated method stub

		if (root == null && flag == false) {
			root = new BSTnode(value);
			parent = root;
			flag = true;
			return;

		}

		current = root;

		if (current.value > value) {

			if (current.left == null)
				current.left = new BSTnode(value);

			else
				add(value, current.left);
		} else {

			if (current.right == null)
				current.right = new BSTnode(value);

			else
				add(value, current.right);
		}

	}

	static BSTnode delete(int value, BSTnode root) {

		if (root == null)
			return null;

		if (root.value > value) {

			root.left = delete(value, root.left);
		} else if (root.value < value) {
			root.right = delete(value, root.right);
		} else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.value = minValue(root.right);

			// Delete the inorder successor
			root.right = delete(root.value, root.right);
		}

		return root;
	}

	static int minValue(BSTnode root) {
		int minv = root.value;
		while (root.left != null) {
			minv = root.left.value;
			root = root.left;
		}
		return minv;
	}

	static int maxDepth(BSTnode node) {
		int h = 0;
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

			return h;
		}
	}

	static int arrPreOrder[] = new int[12];
	int counterPreOrder = 0;

	void preOrder(BSTnode parent) {
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

	static int arrPostOrder[] = new int[12];
	static int counterPostOrder = 0;

	void postOrder(BSTnode parent) {
		// TODO Auto-generated method stub

		if (parent == null)
			return;
		postOrder(parent.left);
		postOrder(parent.right);

		// leaf node

		if (parent.lastVisited == false && parent.left == null
				&& parent.right == null) {

			arrPostOrder[counterPostOrder] = parent.value;
			parent.lastVisited = true;
			counterPostOrder++;

		}

		// single node
		if (parent.left != null) {
			if (parent.lastVisited == false && parent.left.lastVisited == true
					&& parent.right == null) {

				arrPostOrder[counterPostOrder] = parent.value;
				parent.lastVisited = true;
				counterPostOrder++;

			}
		}
		// single node
		if (parent.right != null) {
			if (parent.lastVisited == false && parent.right.lastVisited == true
					&& parent.left == null) {

				arrPostOrder[counterPostOrder] = parent.value;
				parent.lastVisited = true;
				counterPostOrder++;
			}
		}

		// two nodes
		if (parent.right != null && parent.left != null
				&& parent.right.lastVisited == true
				&& parent.left.lastVisited == true) {
			arrPostOrder[counterPostOrder] = parent.value;
			parent.lastVisited = true;
			counterPostOrder++;
		}
	}

	static int arrIntOrder[] = new int[12];
	static int counterInOrder = 0;

	void InOrder(BSTnode parent) {
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

	}

	static int WarrIntOrder[] = new int[12];
	static int WcounterInOrder = 0;

	void WInOrder(BSTnode parent) {
		// TODO Auto-generated method stub

		if (parent == null)
			return;

		BSTnode current = parent;
	

		while (current != null) {
		
			
			
			if (current.left == null) {
				WarrIntOrder[WcounterInOrder] = current.value;

				WcounterInOrder++;
			
				current = current.right;
			}
			else  {
				BSTnode temp=current.left;
				
				while(temp.right!=null&& temp.right != current)
					temp=temp.right;
				
				
				if(temp.right==null)
				{
					temp.right=current;
					current = current.left;
			
				}
			
				else{
					
temp.right=null;	
WarrIntOrder[WcounterInOrder] = current.value;

WcounterInOrder++;
current=current.right;		
				}
				
			}
			
		}

	}

	public static void main(String[] args) {
		BSTdemo obj = new BSTdemo();
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

		int depth = BSTdemo.maxDepth(obj.getParent());
		System.out.println("max depth is  " + depth);
		// obj.delete(7,obj.getParent());
		// obj.delete(6, obj.getParent());
		// obj.delete(20,obj.getParent());

		// obj.preOrder(obj.getParent());
		// System.out.println(Arrays.toString(arrPreOrder));

		// obj.postOrder(obj.getParent());
		// System.out.println(Arrays.toString(arrPostOrder));

		obj.WInOrder(obj.getParent());

		System.out.println("values are  " + Arrays.toString(WarrIntOrder));

		// BSTnode top = obj.getParent();

	}

}
