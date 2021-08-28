package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 5, 2, 1, 6, 7, 7, 2 };
		find(arr);
	}

	static void find(int[] arr) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {

			int key = itr.next();

			if (map.get(key) == 1)
				System.out.println(key);

		}
	}

}
