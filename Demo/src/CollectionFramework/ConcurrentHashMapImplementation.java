package CollectionFramework;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcurrentHashMapImplementation<K, V> {

	class Node<K, V> {
		int hash;
		K key;
		V value;
		Node<K, V> nextNode;

		public Node(int hash, K key, V value, Node<K, V> nextNode) {
			super();
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.nextNode = nextNode;
		}

		public Node<K, V> getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node<K, V> nextNode) {
			this.nextNode = nextNode;
		}

		public Node(int hash, K key, V value) {
			super();
			this.hash = hash;
			this.key = key;
			this.value = value;
		}

		public int getHash() {
			return hash;
		}

		public void setHash(int hash) {
			this.hash = hash;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [hash=" + hash + ", key=" + key + ", value=" + value + ", nextNode=" + nextNode + "]";
		}

	}

	LinkedList<K> bucket = new LinkedList<>();
	// default initialCapacity
	int initialCapacity = 16;
	Node<K, V> Segment[] = new Node[initialCapacity];

	// simpley make get and put sync make it a hashtable

	void put(K key, V value) {
		// TODO Auto-generated method stub
		int hash = hashCode(key);
		int index = getBucketIndex(hash);

		if (Segment[index] != null) {
			synchronized (Segment[index]) {
				Node<K, V> node = Segment[index];

				while (node.nextNode != null) {
					node = node.nextNode;
				}
				node.nextNode = new Node(hash, key, value, null);
				System.out.println("collision at index " + index + " by thread " + Thread.currentThread().getName()
						+ " with value " + value);
			}
		} else {
			if (Segment[index] == null) {
				Segment[index] = new Node(hash, key, value, null);
				System.out.println("index " + index + " updated with thread " + Thread.currentThread().getName()
						+ " with value " + value);
			}
		}

	}

	int getBucketIndex(int hash) {
		// TODO Auto-generated method stub
		int loc = hash % initialCapacity;
		return loc;
	}

	int hashCode(K key) {
		// TODO Auto-generated method stub
		int hash = 7;
		hash = 31 * hash + (key == null ? 0 : key.hashCode());
		 System.out.println("has for key " + key + " is " + hash);
		return hash;
	}

	void get(K key) {
		// TODO Auto-generated method stub
		int hash = hashCode(key);
		int index = getBucketIndex(hash);
		// System.out.println("index in get" + index);
		Node<K, V> node = Segment[index];

		System.out.println("======" + node);
		while (node.hash != hash) {
			// System.out.println("both hash are equal " + hash);
			node = node.nextNode;
		}
		if (node != null && node.key == key)
			System.out.println("value we look for is " + node.getValue());
		else
			System.out.println("no value found for key " + key);
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurrentHashMapImplementation<Integer, String> map = new ConcurrentHashMapImplementation<>();
//		map.put(1, "Vinayak");
//		map.put(2, "Mehul");
//		map.put(3, "harshit");
//		map.put(18, "Anshul");
//		map.put(18, "kk");
//
//		map.get(1);

		ExecutorService es = Executors.newFixedThreadPool(10);

		// IntStream.range(0, 50).forEach(es.execute(map.put(1,"")));

		for (int i = 0; i < 20; i++) {
			final int ind = i;
			es.execute(() -> map.put(1, "value" + ind));

		}

		Thread.sleep(3000);
		map.get(1);

	}

}
