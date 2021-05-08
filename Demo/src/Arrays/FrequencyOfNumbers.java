package Arrays;

import java.util.HashMap;

public class FrequencyOfNumbers {

	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	private static void frequency(int[] a, int n, int x) {
		// TODO Auto-generated method stub

		for (int i = 0; i < x; i++) {

			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i]) + 1);

			else
				map.put(a[i], 1);

		}

		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

	}

	public static void main(String[] args) {

		int a[] = { 0, 5, 5, 5, 4 };
		int x = 5;
		int n = a.length;

		frequency(a, n, x);
	}

}
