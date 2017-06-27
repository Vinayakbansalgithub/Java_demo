package SelFrDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEnumDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(2, "kumar");
		ht.put(1, "vinayak");
		ht.put(3, "bansal");

		Enumeration<Integer> keys = ht.keys();
		while (keys.hasMoreElements()) {
			Integer key = keys.nextElement();
			System.out.println("key is " + key + " and value is" + ht.get(key));
		}

		System.out.println("========after sort based on key=======");

		ArrayList<Integer> arr = new ArrayList<>(ht.keySet());
		Collections.sort(arr);
		for (Integer str : arr) {
			System.out.println("key is " + str + "value is  " + ht.get(str));
		}
		System.out.println("...........sorting based on value..............");
		Map<Integer, String> map = sortByValues(ht);

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Entry) itr.next();
			System.out.println("key is " + me.getKey() + "value is"
					+ me.getValue());

		}

	}

	private static Map<Integer, String> sortByValues(
			Hashtable<Integer, String> ht) {
		// TODO Auto-generated method stub

		List list = new ArrayList(ht.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object arg0, Object arg1) {

				Map.Entry e1 = (Entry) arg0;
				Map.Entry e2 = (Entry) arg1;
				// TODO Auto-generated method stub

				return ((Comparable) e1.getValue()).compareTo(e2.getValue());

			}

		});

		HashMap sortedHashMap = new LinkedHashMap();
		
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
		Map.Entry sortedee=	(Map.Entry)itr.next();
		sortedHashMap.put(sortedee.getKey(), sortedee.getValue());
			
		}
		
		return sortedHashMap;
	/*	for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;*/
	}
}
