package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//49. Group Anagrams
public class GroupAnagrams {

	// Method to sort a string alphabetically
	public static String sortString(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return new String(tempArray);
	}

	static void groupAnagrams(ArrayList<String> strs) {

		HashMap<String, ArrayList<String>> mymap = new HashMap<String, ArrayList<String>>();
		int n = strs.size();
		String temp;

		for (int i = 0; i < n; ++i) {
			temp = strs.get(i);
			String sortTemp = sortString(temp);

			if (mymap.containsKey(sortTemp)) {
				mymap.get(sortTemp).add(temp);
			} else {
				mymap.put(sortTemp, new ArrayList<String>());
				mymap.get(sortTemp).add(temp);
			}
		}

		Collection<ArrayList<String>> values = mymap.values();
		values.forEach(name -> {
			System.out.println(name);
		});

	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("cat");
		list.add("dog");
		list.add("ogd");
		list.add("god");
		list.add("atc");

		groupAnagrams(list);

	}
}
