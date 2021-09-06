package Trees;

// leetcode 114;
class FlatNode {
	int value;
	FlatNode left, right;

	FlatNode(int value) {
		this.value = value;
		left = null;
		right = null;

	}

	@Override
	public String toString() {
		return "FlatNode [value=" + value + ", left=" + left + ", right=" + right + "]";
	}

}

public class FlatBinaryTreeToLL {

	FlatNode root = null;
	FlatNode parent, current;

	public FlatNode getParent() {
		return parent;
	}

	public void setParent(FlatNode parent) {
		this.parent = parent;
	}

	boolean flag = false;
	boolean lastVisited = false;

	void add(int value, FlatNode root) {
		// TODO Auto-generated method stub

		if (root == null && flag == false) {
			root = new FlatNode(value);
			parent = root;
			flag = true;
			return;

		}

		current = root;

		if (current.value > value) {

			if (current.left == null)
				current.left = new FlatNode(value);

			else
				add(value, current.left);
		} else {

			if (current.right == null)
				current.right = new FlatNode(value);

			else
				add(value, current.right);
		}

	}

	public static void main(String[] args) {
		FlatBinaryTreeToLL obj = new FlatBinaryTreeToLL();
		obj.add(15, null);
		obj.add(10, obj.getParent());
		obj.add(12, obj.getParent());
		obj.add(20, obj.getParent());
		obj.add(25, obj.getParent());
		obj.add(23, obj.getParent());

		obj.add(19, obj.getParent());
		obj.add(6, obj.getParent());

		flat(obj.getParent());
		System.out.println(obj.getParent());
	}

	static FlatNode prev = null;

	private static void flat(FlatNode head) {
		// TODO Auto-generated method stub

		if (head == null) {
			return;
		}

		flat(head.right);
		flat(head.left);

		head.right = prev;

		head.left = null;
		prev = head;
	}
}
