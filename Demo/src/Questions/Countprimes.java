package Questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.primitives.Booleans;

public class Countprimes {

	public static void main(String[] args) {
		count(21);
	}

	static void count(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		for (int i = 2; i <= n / 2; i++) {

			if (arr[i] == true) {

				for (int j = i * i; j <= n; j = j + i) {

					arr[j] = false;

				}
			}

		}

		Stream<Boolean> stream = Booleans.asList(arr).stream();
		List<Boolean> ss = stream.filter(s -> s.booleanValue() == true).collect(Collectors.toList());
		System.out.println(ss.size());

	}

}
