package Recurssion;

import java.util.ArrayList;
import java.util.List;


// pending
public class PendingPalandromicPartitioning {

	static boolean isPalindrom(String str, int si, int ei) {

		if (si == ei)
			return true;

		if (str.charAt(si) != str.charAt(ei))
			return false;

		if (si < ei) {
			isPalindrom(str, si + 1, ei - 1);
		}

		return true;
	}

	static List<String> list = new ArrayList<String>();

	public static List<String> partition(String s) {

		return partitionUtil(s, 0, s.length() - 1);
	}

	static List<String> partitionUtil(String str, int si, int ei) {
		if (isPalindrom(str, si, ei)) {
			if (!list.contains(str.substring(si, ei + 1)))
				list.add(str.substring(si, ei + 1));

		}

		for (int i = si; i < ei; i++) {

			list = partitionUtil(str, si, i);
			list = partitionUtil(str, i + 1, ei);

		}
		return list;

	}

	public static void main(String[] args) {

		String str = "aab";

		List<String> set = partition(str);

		System.out.println(set);

	}
}
