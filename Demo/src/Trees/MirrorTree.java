package Trees;
class Mirrornode {
	int value;
	Mirrornode left, right;
	boolean isVisited = false;
	public boolean lastVisited;

	Mirrornode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {

		return "value is " + value;
	}

}
public class MirrorTree {
	
	Mirrornode root = null;
	Mirrornode parent, current;

	public Mirrornode getParent() {
		return parent;
	}

	public void setParent(Mirrornode parent) {
		this.parent = parent;
	}

	boolean flag = false;
	boolean lastVisited = false;

	void add(int value, Mirrornode root) {
		// TODO Auto-generated method stub

		if (root == null && flag == false) {
			root = new Mirrornode(value);
			parent = root;
			flag = true;
			return;

		}

		current = root;

		if (current.value > value) {

			if (current.left == null)
				current.left = new Mirrornode(value);

			else
				add(value, current.left);
		} else {

			if (current.right == null)
				current.right = new Mirrornode(value);

			else
				add(value, current.right);
		}

	}

	private static Mirrornode mirror(Mirrornode parent) {
		// TODO Auto-generated method stub\
		if(parent==null){
			return parent  ;
		}
		
		Mirrornode lefttemp=	mirror(parent.left);
		Mirrornode righttemp=	mirror(parent.right);
		
		
		if(lefttemp==null && righttemp==null)
				return parent ;
		else{
			Mirrornode temp=parent.left;
			parent.left=parent.right;
			parent.right=temp;
			return parent ;
		}
		
		
		
	}
	public static void main(String[] args) {
		MirrorTree obj = new MirrorTree();
		obj.add(2, null);
		obj.add(1, obj.getParent());
		obj.add(4, obj.getParent());
		obj.add(3, obj.getParent());
		obj.add(5, obj.getParent());
		
		mirror(obj.getParent());
		
		
	}

	
}
