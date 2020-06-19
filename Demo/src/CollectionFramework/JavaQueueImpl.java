package CollectionFramework;

public class JavaQueueImpl<T> {
	T t;
	static Object[] obj = new Object[10];
	static int count = 0;
	T head,last;

	public void addLast(T t) {
		obj[count] = t;
		count++;
	}

	public T peek() {
		if (obj[0] == null)
			return null;
		return (T) obj[0];
	}

	public T pop() {

		if (obj[0] == null) {
			NullPointerException ex = new NullPointerException();
			throw ex;

		}

		head = (T) obj[0];

		for (int i = 1; i <= count; i++) {
			obj[i - 1] = obj[i];
		}
		obj[count ] = null;
		count--;
		return head;
	}

	public void addFirst(T t) {
		for (int i = count - 1; i >= 0; i--) {
			obj[i + 1] = obj[i];
		}
		obj[0] = t;
	}

	T removeFirst() {
		if (obj[0] == null) {
			NullPointerException ex = new NullPointerException();
			throw ex;

		}

		head = (T) obj[0];

		for (int i = 1; i <= count; i++) {
			obj[i - 1] = obj[i];
		}
		obj[count ] = null;
		count--;
		return head;
	}

	T removeLast() {
		if (obj[0] == null) {
			NullPointerException ex = new NullPointerException();
			throw ex;

		}

		last=(T)obj[count];
		
		obj[count ] = null;
		count--;
		return last;
	}

	public static void main(String[] args) {
		JavaQueueImpl<String> queue = new JavaQueueImpl<String>();
		queue.addLast("Nandini");
		queue.addLast("vinayak");
		queue.addLast("bansal");
		queue.addFirst("Ajay");
		queue.removeFirst();
		queue.removeLast();

		System.out.println(queue.peek());
		System.out.println(queue.pop());

		for (int i = 0; i <= count; i++) {
			System.out.println(obj[i]);
		}

	}
}
