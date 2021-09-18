package Arrays;

import java.util.HashSet;


//128. Longest Consecutive Sequence

public class LargestSubsequenceWithContiguousElements {
	// Returns length of the longest
	// consecutive subsequence
	static int findLongestConseqSubseq(int arr[]) {
		HashSet<Integer> S = new HashSet<Integer>();
		int ans = 0;

		for (int i = 0; i < arr.length; ++i)
			S.add(arr[i]);

		// check each possible sequence from the start
		// then update optimal length
		for (int i = 0; i < S.size(); ++i) {
			// if current element is the starting
			// element of a sequence
			if (!S.contains(arr[i] - 1)) {
				// Then check for next elements
				// in the sequence
				int j = arr[i];
				while (S.contains(j))
					j++;

				// update optimal length if this
				// length is more
				if (ans < j - arr[i])
					ans = j - arr[i];
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		// { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		// { 1, 9, 3, 10, 4, 20, 2 };

		System.out.println("Length of the Longest consecutive subsequence is " + findLongestConseqSubseq(arr));
	}
}
