package LinkList;

import LinkList.PairWiseSwip.Node;
import SelFrDemo.strictfpDemo;

class kthNode {

	int data;
	kthNode next;

	kthNode(int d) {
		data = d;
		next = null;
	}
}

public class kthwithkthReplace {
	static kthNode head;
	static int length = 0;

	static int totallength(kthNode head) {
		// TODO Auto-generated method stub
		kthNode temp = head;
		while (temp != null) {
			temp = temp.next;
			length++;
		}

		return length;
	}

	static void kthnodelast(kthNode head, int k) {
		// TODO Auto-generated method stub

		kthNode startk, endk, startkprev = null, endkprev = null;
		startk = head;
		endk = head;
		for (int i = 1; i < k; i++) {
			startkprev = startk;
			startk = startk.next;
		}

		kthNode temp = startk;

		while (temp.next != null) {

			temp = temp.next;
			endkprev = endk;
			endk = endk.next;
		}
		System.out.println(endk.data);

		System.out.println(endkprev.data);

		kthNode last = endk.next;
		endk.next = startk.next;
		startk.next = last;
		endkprev.next = startk;

		startkprev.next = endk;

		System.out.println("==================");
		while (head != null) {

			System.out.println(head.data);
			head = head.next;
		}

	}

	public static void main(String[] args) {
		kthwithkthReplace list = new kthwithkthReplace();
		list.head = new kthNode(1);
		list.head.next = new kthNode(2);
		list.head.next.next = new kthNode(3);
		list.head.next.next.next = new kthNode(4);
		list.head.next.next.next.next = new kthNode(5);
		list.head.next.next.next.next.next = new kthNode(6);
		list.head.next.next.next.next.next.next = new kthNode(7);

		System.out.println(totallength(head));

		kthnodelast(head, 3);

	}

}
