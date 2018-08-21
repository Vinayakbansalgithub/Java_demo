package StringPackage;

import java.util.HashMap;

public class FirstRepeatChar {
	public static void main(String[] args) {
		FirstRepeatChar obj = new FirstRepeatChar();
		String word = "vinayak";
		
		char[] ch = word.toCharArray();
		

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (char c : ch) {

			if (!hmap.containsKey(c)) {
				hmap.put(c,  1);
			} else{
				System.out.println("first repeat character is "+c);
			break;
			}
		}

	}

}
