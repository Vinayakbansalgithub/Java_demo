package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 202. Happy Number

public class HappyNumbers {

	static boolean find(int num) {

		HashSet<Integer> set = new HashSet<>();

		while (num != 1) {

			int sum = 0;
			int temp = num;
			while (temp != 0) {
				sum += (temp % 10) * (temp % 10);
				temp /= 10;

			}
			num = sum;

			if (!set.contains(num)) {
				set.add(num);
			} else
				return false;

		}

		return true;

	}


	public static void main(String[] args) {

		int num = 19;

		boolean res = find(num);
		System.out.println(res);
	}
}
