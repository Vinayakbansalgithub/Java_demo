package CollectionFramework;

import SelFrDemo.HashCodeEqualsEmployee;

class Bucket<K, V> {
	K key;
	V value;
	Bucket<K, V> next;

	Bucket(K key, V value, Bucket<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}

public class HashMapImpl<K, V> {

	Bucket<K, V>[] table;

	HashMapImpl() {
		table = new Bucket[4];
	}

	public void put(K key, V value) {
		Bucket<K, V> prev = null;
		int hash = hash(key);
		System.out.println(hash);
		Bucket<K, V> bucket = new Bucket(key, value, null);
		if (table[hash] == null)
			table[hash] = bucket;

		else {
			
			Bucket<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(bucket.key)) {
					if(prev!=null){
						bucket.next=current.next;
						prev.next=bucket;
						return;
					}
					/*System.out.println(current.value+"  "+bucket.value);
					System.out.println(current.next+"  "+bucket.next);*/
					else{
						bucket.next=current.next;
					table[hash] = bucket;
					return;
					}
				}
				System.out.println(current);
				System.out.println(current.value);
				prev = current;
				
				current = current.next;
			//	System.out.println(current.value);
			//	System.out.println(current.next);
				System.out.println(current);
			}
			System.out.println(prev.value+"  "+prev.next);
			prev.next=bucket;
			System.out.println(prev.value+"  "+prev.next);
		}
	}

	public V get(K key) {
		int hash = hash(key);
		if(table[hash] == null){
	         return null;
	        }
		Bucket<K, V> current = table[hash];
		while(current!=null){
		if(current.key.equals(key)){
			return current.value;	
			
		}
		current=current.next;
	}
		return null;
	}

	int hash(K key) {
		return Math.abs(key.hashCode()) % 4;
	}

	public static void main(String[] args) {
		HashMapImpl<Integer, String> hmap = new HashMapImpl<Integer, String>();
		hmap.put(21, "vinayak");
		hmap.put(21, "jira");

		hmap.put(25, "sachin");
		hmap.put(25, "nandini");

		hmap.put(33, "Mehul");
		hmap.put(34, "vinayak");
		hmap.put(67, "sachin");
		hmap.put(91, "Mehul");
		System.out.println(hmap.get(25));

	}
}
