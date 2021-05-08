package CollectionFramework;

import java.util.LinkedList;

public class HashMapImplementation<K, V> {

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
	// default size
	int BucketSize = 16;
	Node<K, V> table[] = new Node[BucketSize];

	private void put(K key, V value) {
		// TODO Auto-generated method stub
		int hash = hashCode(key);
		int index = getBucketIndex(hash);
		System.out.println("index in put  " + index + "  for key " + key);

		if (table[index] != null) {
			System.out.println("collision at index " + index);

			Node<K, V> node = table[index];
			boolean keyFound = false;
			while (node != null) {
				if (node.getKey() == key) {
					keyFound = true;
				}
				node = node.nextNode;
			}
			if (keyFound)
				System.out.println("key " + key + "not found in hashtable, use double hashing here");

			
			node = table[index];
			node.nextNode = new Node(hash, key, value, null);

		} else {
			table[index] = new Node(hash, key, value, null);
		}

	}

	int getBucketIndex(int hash) {
		// TODO Auto-generated method stub
		int loc = hash % BucketSize;
		return loc;
	}

	int hashCode(K key) {
		// TODO Auto-generated method stub
		int hash = 7;
		hash = 31 * hash + (key == null ? 0 : key.hashCode());
		System.out.println("hash for key " + key + " is " + hash);
		return hash;
	}

	void get(K key) {
		// TODO Auto-generated method stub
		int hash = hashCode(key);
		int index = getBucketIndex(hash);
		System.out.println("index in get" + index);
		Node<K, V> node = table[index];
		while (node.hash != hash) {
			System.out.println("both hash are equal " + hash);
			node = node.nextNode;
		}
		if (node.key == key)
			System.out.println("value we look for is " + node.getValue());

	}

	public static void main(String[] args) {

		HashMapImplementation<Integer, String> map = new HashMapImplementation<>();
		map.put(1, "Vinayak");
		map.put(2, "Mehul");
		map.put(3, "harshit");
		map.put(18, "Anshul");
		map.put(18, "kk");
		map.put(19, "hhh");

		map.get(18);

	}

}
