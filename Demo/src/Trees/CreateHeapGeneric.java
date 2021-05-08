package Trees;

import java.util.ArrayList;

public class CreateHeapGeneric {

	static ArrayList<Integer> list = new ArrayList<Integer>();

	static void add(int i) {

		list.add(i);

		upHeapfy(list.size() - 1);

	}

	private static void upHeapfy(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;

		if (list.get(ci) < list.get(pi)) {
			swap(ci, pi);
			upHeapfy(pi);

		}

	}

	static void swap(int i, int j) {

		int ciValue = list.get(i);
		int piValue = list.get(j);

		list.set(i, piValue);
		list.set(j, ciValue);

	}

	static int remove() {

		swap(0, list.size() - 1);
		int rv = list.remove(list.size() - 1);

		downHeapfy(0);
		return rv;
	}

	private static void downHeapfy(int pi) {
		// TODO Auto-generated method stub

		int left = pi * 2 + 1;
		int right = pi * 2 + 2;
		
		int min=pi;

		if (left < list.size() && list.get(pi)>list.get(left)) {
			
			min=left;
		}

		if (right < list.size()&& list.get(min)>list.get(right)) {
			min=right;
		}
		
		
		if(pi!=min) {
			swap(pi, min);
			downHeapfy(min);
			
		}

	}

	public static void main(String[] args) {

		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(5);
		add(3);
		System.out.println(list);
		remove();
		System.out.println(list);


	}

}
