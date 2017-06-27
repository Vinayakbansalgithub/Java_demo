package StringPackage;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Anagram {
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		String word1 = "vinayak";
		String word2 = "kayaniv";
		char[] ch1 = word1.toCharArray();
		char[] ch2 = word2.toCharArray();

		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		for (char c1 : ch1) {

			if (hmap1.containsKey(c1)) {
				hmap1.put(c1, hmap1.get(c1) + 1);
			} else
				hmap1.put(c1, 1);
		}

		HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		for (char c2 : ch2) {

			if (hmap2.containsKey(c2)) {
				hmap2.put(c2, hmap2.get(c2) + 1);
			} else
				hmap2.put(c2, 1);
		}

		Set<Entry<Character, Integer>> entry1 = hmap1.entrySet();
		Set<Entry<Character, Integer>> entry2 = hmap2.entrySet();
		if (entry1.size() == entry2.size()) {
			for (Entry<Character, Integer> set1 : entry1) {
				for (Entry<Character, Integer> set2 : entry2) {
					if (set1.getKey() == set2.getKey()) {
						if (set1.getValue() == set2.getValue()) {
							System.out.println("anagarm");
							break;
						} else {
							System.out.println("not anagram");
						}
					}
				}
			}

		}
		else
			System.out.println("not anagram");
	}
}