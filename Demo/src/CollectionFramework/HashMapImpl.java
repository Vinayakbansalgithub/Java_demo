package CollectionFramework;

class Bucket<K, V> {

	int hash;
	K key;
	V value;
	Bucket<K, V> next;

	Bucket(int hash, K key, V value, Bucket<K, V> next) {
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (int) hash;
		hash = 31 * hash + (key == null ? 0 : key.hashCode());
		hash = 31 * hash + (value == null ? 0 : value.hashCode());
		return hash;
	}

}

public class HashMapImpl<K, V> {

	Bucket<K, V>[] table;

	HashMapImpl() {
		// initial size is 16
		table = new Bucket[16];
	}

	public void put(K key, V value) {
		Bucket<K, V> prev = null;
		int hash = hash(key);
		int index = index(hash);

		// System.out.println(hash);
		Bucket<K, V> bucket = new Bucket(hash, key, value, null);
		
		if (table[index] == null) {
			table[index] = bucket;
		} else {
			Bucket<K, V> current = table[index];
			while (current != null) {
				if (current.key.equals(bucket.key)) {
					if (prev != null) {
						Bucket next = current.next;
						prev.next = bucket;
						prev.next.next = next;
						return;
						}//else {
////						// bucket.next = current;
////						current.next = bucket;
////						table[index] = current;
////						return;
////					}
					// replace with new if key is same
					Bucket next = current.next;
					current = bucket;
					current.next = next;
//					table[index] = current;
					return;
				}
				// System.out.println(current);
				// System.out.println(current.value);
				prev = current;
				current = current.next;
				// System.out.println(current.value);
				// System.out.println(current.next);
				// System.out.println(current);
			}
			// System.out.println(prev.value+" "+prev.next);
			prev.next = bucket;
			// System.out.println(prev.value+" "+prev.next);
		}
	}

	public V get(K key) {
		int hash = hash(key);
		int index = index(hash);
		if (table[index] == null) {
			return null;
		}
		Bucket<K, V> current = table[index];
		while (current != null) {

			if (current.hash == hash)
				if (current.key.equals(key)) 
					return current.value;

				
			current = current.next;
		}
		return null;
	}

	int hash(K key) {
		int h = key.hashCode();
		return h;
	}

	int index(int hash) {
		int index = Math.abs(hash) % 16;
		System.out.println("with key   " + hash + "  index   " + index);
		return index;
	}

	public static void main(String[] args) {
		HashMapImpl<Integer, String> hmap = new HashMapImpl<Integer, String>();
		hmap.put(21, "vinayak");

		hmap.put(21, "jira");

		hmap.put(25, "sachin");
		hmap.put(25, "nandini");

		hmap.put(33, "deepak");
		hmap.put(33, "vinayak");
		hmap.put(67, "sachin");
		hmap.put(91, "Mehul");
		hmap.put(343, "Mehul");
		hmap.put(344, "vinayak");
		hmap.put(673, "sachin");
		hmap.put(673, "Mehul");
		hmap.put(913, "Vinayak");

		System.out.println("====get===");
		System.out.println(hmap.get(913));

	}
}
