package Questions;

import java.util.HashMap;
import java.util.Map;

//Given a string, determine if a permutation of the string could form a palindrome.
//LeetCode 266.
public class PalindromPermutation {

	public static void main(String[] args) {
		
		
//		String s="ohsVIolONT​​​​​​​Rita Price_updateFarmers Insurance26856 Hwy 189Lake Arrowhead, CA 92352License Number: 0544472909-337-2518 (Office)909-336-6989 (Fax)rprice@FarmersagentUAT.comhttp://www.farmersagent.com/rprice";
//		String t="ohsVIolONTRita Price_updateFarmers Insurance26856 Hwy 189Lake Arrowhead, CA 92352License Number: 0544472909-337-2518 (Office)909-336-6989 (Fax)rprice@FarmersagentUAT.comhttp://www.farmersagent.com/rprice";
//		
//		
//		s = s.replaceAll("[\\p{Cf}]", "");
//		t = t.replaceAll("[\\p{Cf}]", "");
//
//		
		
//		System.out.println(s.equalsIgnoreCase(t));
		
		
		String str = "aabcbaa";
		int count = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char j = 0; j < str.length(); j++) {

			if (map.containsKey(str.charAt(j))) {
				map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
			} else {
				map.put(str.charAt(j), 1);
			}

		}

		for (Character key : map.keySet()) {
			if (map.get(key) % 2 == 1)
				count++;
		}

		if (count > 1) {
			System.out.println("it can not form palindrom string");

		} else
			System.out.println("it can form palindrom");
	}

}
