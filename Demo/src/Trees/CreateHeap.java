package Trees;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateHeap<T extends Comparable<T>> {

	ArrayList<T> list = new ArrayList<T>();
	HashMap<T, Integer> map = new HashMap<T, Integer>();

	public void add(T i) {

		list.add(i);
		map.put(i, list.size() - 1);

		upHeapfy(list.size() - 1);

	}

	void upHeapfy(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;

		if (isLarger(list.get(pi), list.get(ci)) > 0) {
			swap(ci, pi);
			upHeapfy(pi);

		}

	}

	void swap(int i, int j) {

		T ciValue = list.get(i);
		T piValue = list.get(j);

		list.set(i, piValue);
		list.set(j, ciValue);

		map.put(piValue, i);

		map.put(ciValue, j);

	}

	public T remove() {

		swap(0, list.size() - 1);
		T rv = list.remove(list.size() - 1);
		map.remove(rv);
		downHeapfy(0);
		return rv;
	}

	private void downHeapfy(int pi) {
		// TODO Auto-generated method stub

		int left = pi * 2 + 1;
		int right = pi * 2 + 2;

		int minIndex = pi;

		if (left < list.size() && isLarger(list.get(pi), list.get(left)) > 0) {

			minIndex = left;
		}

		if (right < list.size() && isLarger(list.get(minIndex), list.get(right)) > 0) {
			minIndex = right;
		}

		if (pi != minIndex) {
			swap(pi, minIndex);
			downHeapfy(minIndex);

		}

	}

	int isLarger(T t, T o) {
		return t.compareTo(o);
	}

	public void updatePriority(T key) {

		int index = map.get(key);
		upHeapfy(index);
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
	public void display() {
		System.out.println(this.list);
	}

	public static void main(String[] args) {

		CreateHeap<Integer> obj = new CreateHeap<Integer>();

		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(5);
		obj.add(3);
		obj.add(1);
		obj.add(100);
		System.out.println(obj.list);
		obj.remove();
		System.out.println(obj.list);
		obj.remove();
		System.out.println(obj.list);

	}

}
