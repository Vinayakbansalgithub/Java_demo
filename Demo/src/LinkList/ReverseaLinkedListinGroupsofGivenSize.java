package LinkList;
class ReversePairNode {

	int value;

	ReversePairNode next;

	ReversePairNode(int value) {
		this.value = value;
		next = null;

	}

}

public class ReverseaLinkedListinGroupsofGivenSize {
	static ReversePairNode head;

	void add(int value) {
		// TODO Auto-generated method stub
		if (head == null) {

			head = new ReversePairNode(value);

		} else {
			ReversePairNode temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = new ReversePairNode(value);

		}

	}
public static ReversePairNode reverseinGroup(ReversePairNode head, int k)
{
	// base case
	if (head == null) {
		return null;
	}

	// start with current node
	ReversePairNode current = head;

	// reverse next k nodes
	ReversePairNode prev = null;
	int count = 0;

	// Iterate through the list and move/insert each node to the
	// front of the result list (like a push of the node)
	while (current != null && count++ < k)
	{
		// tricky: note the next node
		ReversePairNode next = current.next;

		// move the current node onto the result
		current.next = prev;

		// update previous to current node
		prev = current;

		// move to next node in the list
		current = next;
	}

	// recur for remaining nodes
	head.next = reverseinGroup(current, k);

	// important - return previous (to link every group of k nodes)
	return prev;}
		
		
	
	
	public static void main(String[] args) {

		ReverseaLinkedListinGroupsofGivenSize obj = new ReverseaLinkedListinGroupsofGivenSize();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);


		head =obj.reverseinGroup(head,3);

		while (head != null) {

			System.out.println(head.value);
			head = head.next;
		}

	}
	

}
