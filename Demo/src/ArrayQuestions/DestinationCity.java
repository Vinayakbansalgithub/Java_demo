package ArrayQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DestinationCity {
	public static void main(String[] args) {

		// int lectures[][] = { { 5, 10 }, { 0, 30 }, { 15, 20 } };

		String cities[][] = { { "London", "New York" }, { "New York", "Lima" }, { "Lima", "Sao Paulo" } };

		int n = cities.length;

		find(cities, n);
	}

	private static void find(String[][] cities, int n) {

		Set<String> set = new HashSet<String>();
		for (int i = 1; i < n; i++) {
			set.add(cities[i][1]);
		}

		for (int i = 1; i < n; i++) {
			set.remove(cities[i][0]);
		}

		System.out.println(set.iterator().next());

	}
}
