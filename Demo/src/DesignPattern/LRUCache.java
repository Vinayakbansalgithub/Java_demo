package DesignPattern;

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

class Entry {
	int value;
	int key;
	Entry left;
	Entry right;
}
public class LRUCache {

	HashMap<Integer, Entry> hashmap;
	Entry start, end;
	int LRU_SIZE = 4; // Here i am setting 4 to test the LRU cache
						// implementation, it can make be dynamic
	public LRUCache() {
		hashmap = new HashMap<Integer, Entry>();
	}

	public int getEntry(int key) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the
		{
			Entry entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return -1;
	}

	public void putEntry(int key, int value) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the value and move it to top
		{
			Entry entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Entry newnode = new Entry();
			newnode.left = null;
			newnode.right = null;
			newnode.value = value;
			newnode.key = key;
			if (hashmap.size() > LRU_SIZE) // We have reached maxium size so need to make room for new element.
			{
				hashmap.remove(end.key);
				removeNode(end);				
				addAtTop(newnode);

			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
	}
	public void addAtTop(Entry node) {
		node.right = start;
		node.left = null;
		if (start != null)
			start.left = node;
		start = node;
		if (end == null)
			end = start;
	}

	public void removeNode(Entry node) {

		if (node.left != null) {
			node.left.right = node.right;
		} else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCache lrucache = new LRUCache();
		lrucache.putEntry(1, 1);
		lrucache.putEntry(10, 15);
		lrucache.putEntry(15, 10);
		lrucache.putEntry(10, 16);
		lrucache.putEntry(12, 15);
		lrucache.putEntry(18, 10);
		lrucache.putEntry(13, 16);

		System.out.println(lrucache.getEntry(1));
		System.out.println(lrucache.getEntry(10));
		System.out.println(lrucache.getEntry(15));

	}
}