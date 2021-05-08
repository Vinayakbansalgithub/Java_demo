package StackandQueue;

public class SimpleQueue<T> {

	static Object objArray[];
	int head;
	int tail;
	int count;

	SimpleQueue() {
		objArray = new Object[10];
		head = -1;
		tail = -1;
		count = 0;
	}

	void isEmpty() {
		if (tail == -1)
			System.out.println("queue is empty");

	}

	boolean isFull() {

		if (tail == objArray.length - 1) {
			System.out.println("queue is full");
			return true;
		}
		return false;
	}

	void add(T element) {

		if (!isFull()) {
			if (head == -1 && tail == -1) {
				objArray[count] = element;

				head = 0;
				tail = 0;
				count++;

			} else {
				objArray[count] = element;
				tail++;
				count++;

			}
		}

	}

	void remove() {

		for (int i = 0; i < objArray.length - 1; i++) {

			objArray[i] = objArray[i + 1];

		}

	}

	public static void main(String[] args) {
		SimpleQueue<Integer> obj = new SimpleQueue<Integer>();

		obj.isFull();

		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.remove();

		for (int i = 0; i < objArray.length; i++) {

			System.out.println(objArray[i]);
		}

	}
}
