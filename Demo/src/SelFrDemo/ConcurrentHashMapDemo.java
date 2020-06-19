package SelFrDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		// this will be based on number of cpu in the system run in parallel
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String, String>();
		cmap.clear();
		cmap.put("vinayak", "noida");
		cmap.put("kk", "kolkata");
		cmap.put("raunak", "gurgaon");
		cmap.put("harshal", "london");

		System.out.println("============normal iteration operation================");

		Set set = cmap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			Map.Entry e = (Entry) itr.next();
			cmap.put("anshul", "pune");
			System.out.println("key is  " + e.getKey() + "   value is  "
					+ e.getValue());
		}

		System.out.println("============foreach operation================");
		cmap.forEach(1, (key, value) -> System.out.printf(
				"key: %s; value: %s; thread: %s\n", key, value, Thread
						.currentThread().getName()));
		System.out.println("============search operation================");

		String result = cmap.search(1, (key, value) -> {
			System.out.println(Thread.currentThread().getName());
			if ("vinayak".equals(key)) {
				return value;
			}

			return null;
		});
		System.out.println("Result: " + result);

		System.out.println("============Reduce operation================");
		String result1 = cmap.reduce(
				Long.MAX_VALUE,
				(key, value) -> {
					System.out.println("Transform: "
							+ Thread.currentThread().getName());
					return key + "=" + value;
				},
				(s1, s2) -> {
					System.out.println("Reduce: "
							+ Thread.currentThread().getName());
					return s1 + ", " + s2;
				});

		System.out.println("Result: " + result1);
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("============Array values are================");
		arr.add(result1);
		for (String string : arr) {
			System.out.println("array values are   " + string);
		}

	}
	}
