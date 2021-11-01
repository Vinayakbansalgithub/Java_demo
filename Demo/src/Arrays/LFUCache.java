package Arrays;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

//
//When we think about O(1) lookup , obvious data structure comes in our mind is HashMap.
//HashMap provide O(1) insertion and lookup.
//but HashMap does not has mechanism of tracking which entry has been queried recently and which not.
//To track this we require another data-structure which provide fast insertion ,deletion and updation ,
//in case of LRU we use Doubly Linkedlist . Reason for choosing doubly LinkList is O(1) deletion , updation and insertion 
//if we have the address of Node on which this operation has to perform.
//So our Implementation of LRU cache will have HashMap and Doubly LinkedList.
//In Which HashMap will hold the keys and address of the Nodes of Doubly LinkedList .
//And Doubly LinkedList will hold the values of keys
//As We need to keep track of Recently used entries, We will use a clever approach.
//We will remove element from bottom and add element on start of LinkedList and whenever any entry is accessed , 
//it will be moved to top. so that recently used entries will be on Top and Least used will be on Bottom.

public class LFUCache {
	HashMap<Integer, Integer> vals;// cache K and V
	HashMap<Integer, Integer> counts;// K and counters
	HashMap<Integer, LinkedHashSet<Integer>> lists;// Counter and item list
	int cap;
	int min = -1;

	public LFUCache(int capacity) {
		cap = capacity;
		vals = new HashMap<>();
		counts = new HashMap<>();
		lists = new HashMap<>();
		lists.put(1, new LinkedHashSet<>());
	}

	public int get(int key) {
		if (!vals.containsKey(key))
			return -1;
		// Get the count from counts map
		int count = counts.get(key);
		// increase the counter
		counts.put(key, count + 1);
		// remove the element from the counter to linkedhashset
		lists.get(count).remove(key);

		// when current min does not have any data, next one would be the min
		if (count == min && lists.get(count).size() == 0)
			min++;
		if (!lists.containsKey(count + 1))
			lists.put(count + 1, new LinkedHashSet<>());
		lists.get(count + 1).add(key);
		return vals.get(key);
	}

	public void set(int key, int value) {
		if (cap <= 0)
			return;
		// If key does exist, we are returning from here
		if (vals.containsKey(key)) {
			vals.put(key, value);
			get(key);
			return;
		}
		if (vals.size() >= cap) {
			int evit = lists.get(min).iterator().next();
			lists.get(min).remove(evit);
			vals.remove(evit);
			counts.remove(evit);
		}
		// If the key is new, insert the value and current min should be 1 of course
		vals.put(key, value);
		counts.put(key, 1);
		min = 1;
		lists.get(1).add(key);
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LFUCache lrucache = new LFUCache(4);
		lrucache.set(1, 1);
		lrucache.set(10, 15);
		lrucache.set(15, 10);
		lrucache.set(10, 16);
		lrucache.set(12, 15);
		lrucache.set(18, 10);
		lrucache.set(13, 16);

		System.out.println(lrucache.get(1));
		System.out.println(lrucache.get(10));
		System.out.println(lrucache.get(15));

	}
}
