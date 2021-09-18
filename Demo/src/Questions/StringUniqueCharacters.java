package Questions;

// complexity O(n)
// pending
public class StringUniqueCharacters {
	boolean uniqueCharacters(String str) {

		char ch[] = str.toCharArray();
		boolean[] bool = new boolean[128];

		for (char c : ch) {
			if (bool[c] == false)
				bool[c] = true;
			else
				return false;
		}
		return true;
	}

	public static void main(String args[]) {

		StringUniqueCharacters obj = new StringUniqueCharacters();
		String input = "acdbk";

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}

}
