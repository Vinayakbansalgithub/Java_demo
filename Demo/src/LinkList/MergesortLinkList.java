package LinkList;


class MergeNode {
	Object value;
	MergeNode next;

	MergeNode(Object val) {
		value = val;
		next = null;

	}

	MergeNode() {
		value = null;
		next = null;

	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public MergeNode getNext() {
		return next;
	}

	public void setNext(MergeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MergeNode [value=" + value + ", next=" + next + "]";
	}

}

public class MergesortLinkList {
	MergeNode head;
	static int totalnode;

	public MergeNode getHead() {
		return head;
	}

	public void setHead(MergeNode head) {
		this.head = head;
	}

	MergeNode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new MergeNode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		MergeNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new MergeNode(i);
		return head;

	}

	MergeNode mergesort(MergeNode nl1) {
		// TODO Auto-generated method stub

		if (nl1.next == null) {
			return nl1;
		}

		int counter = 0;

		MergeNode temp = nl1;

		while (temp != null) {
			counter++;
			temp = temp.next;

		}
		System.out.println("total nodes  " + counter);

		int middle = (counter - 1) / 2;

		temp = nl1;
		MergeNode left = nl1, right = nl1;
		int leftindex = 0, rightindex = 0;

		if (middle == leftindex) {
			right = left.next;
		}
		while (leftindex < middle) {

			leftindex++;
			left = left.next;
			right = left.next;
		}

		left.next = null;
		left = nl1;

		System.out.println(left.toString());
		System.out.println(right.toString());

		MergeNode p1 = mergesort(left);
		MergeNode p2 = mergesort(right);

		MergeNode node = merge(p1, p2);

		return node;

	}

	MergeNode merge(MergeNode p1, MergeNode p2) {
		// TODO Auto-generated method stub

		MergeNode L = p1;
		MergeNode R = p2;

		int Lcount = 0, Rcount = 0;

		MergeNode tempnode = null;

		while (L != null && R != null) {

			int val1 = (int) L.value;

			int val2 = (int) R.value;

			if (val1 > val2) {

				if (tempnode == null) {
					tempnode = new MergeNode(val2);
					R = R.next;
				} else {

					MergeNode store = tempnode;

					while (store.next != null) {
						store = store.next;
					}
					store.next = new MergeNode(val2);

					R = R.next;
				}

			} else {
				if (tempnode == null) {
					tempnode = new MergeNode(val1);
					L = L.next;
				} else {

					MergeNode store = tempnode;

					while (store.next != null) {
						store = store.next;
					}
					store.next = new MergeNode(val1);

					L = L.next;
				}

			}

		}

		MergeNode handle = tempnode;

		while (L != null) {

			while (handle.next != null) {

				handle = handle.next;

			}
			handle.next = L;

			L = null;

		}

		// Copy remaining elements of L[] if any
		while (R != null) {
			while (handle.next != null) {

				handle = handle.next;

			}
			handle.next = R;

			R = null;

		}

		System.out.println("----------------sorted value-----------");
		System.out.println(tempnode.toString());
		return tempnode;
	}

	public static void main(String[] args) {
		MergesortLinkList objsort = new MergesortLinkList();
		MergeNode n1 = objsort.add(9);
		MergeNode n2 = objsort.add(7);
		MergeNode n3 = objsort.add(6);
		MergeNode n4 = objsort.add(87);
		MergeNode n5 = objsort.add(16);
		MergeNode n6 = objsort.add(81);

		MergeNode n7 = objsort.add(21);
		MergeNode n8 = objsort.add(16);

		MergeNode n9 = objsort.add(99);
		MergeNode n10 = objsort.add(31);

		MergeNode val = objsort.mergesort(n1);

		System.out.println("===============sorted values=====================");
		while (val != null) {
			System.out.println(" value is  " + val.value);
			val = val.next;
		}
	}

}
