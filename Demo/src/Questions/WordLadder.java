package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//127. Word Ladder

class Type {
	String value;
	int index;

	public Type(String beginWord, int i) {
		// TODO Auto-generated constructor stub
		value = beginWord;
		index = i;
	}

	@Override
	public String toString() {
		return "Type [value=" + value + ", index=" + index + "]";
	}

}

public class WordLadder {

	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("cog");
		int res = find(beginWord, endWord, wordList);
		System.out.println(res);
	}

	static int find(String beginWord, String endWord, List<String> wordList) {

		if (beginWord.length() == 0 || endWord.length() == 0 || wordList.size() == 0)
			return 0;

		Queue<Type> queue = new LinkedList<Type>();

		queue.add(new Type(beginWord, 1));

		while (!queue.isEmpty()) {
			Type temp = queue.poll();
			System.out.println(temp);
			
			for (int i = 0; i < wordList.size(); i++) {

				if (isAdjacent(wordList.get(i), temp.value)) {

					queue.add(new Type(wordList.get(i), temp.index + 1));
					wordList.remove(wordList.get(i));

				}

			}

			if (endWord.equals(temp.value))
				return temp.index;
		}

		return 0;

	}

	static boolean isAdjacent(String s1, String s2) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
			}
			if (count > 1)
				return false;

		}

		return count > 1 ? false : true;
	}
}
