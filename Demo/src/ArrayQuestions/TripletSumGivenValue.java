package ArrayQuestions;

import java.util.HashSet;

public class TripletSumGivenValue {
	// returns true if there is triplet
	// with sum equal to 'sum' present
	// in A[]. Also, prints the triplet
	static boolean find3Numbers(int A[], int arr_size, int sum) {
		// Fix the first element as A[i]
		for (int i = 0; i < arr_size - 2; i++) {

			// Find pair in subarray A[i+1..n-1]
			// with sum equal to sum - A[i]
			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - A[i];
			for (int j = i + 1; j < arr_size; j++) {
				if (s.contains(curr_sum - A[j])) {
					System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
					return true;
				}
				s.add(A[j]);
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	/* Driver code */
	public static void main(String[] args) {
		
		
		
		
		String url="https://localhost:8443/";
		String overrideUrlFrom="localhost:8443";
		String overrideUrlTo="f64967a65192.ngrok.io";

		String urlHeader = url.substring(0, url.indexOf("://"));
		System.out.printf("urlHeader:::"+ urlHeader);
        url = url.substring(url.indexOf("://") + 3);
        overrideUrlFrom = overrideUrlFrom.substring(overrideUrlFrom.indexOf("://") + 3);
        overrideUrlTo = overrideUrlTo.substring(overrideUrlTo.indexOf("://") + 3);

        url = url.replace(overrideUrlFrom, overrideUrlTo);
        url = urlHeader + "://" + url ;
        
        System.out.printf("Final url:::"+ url);
		
		
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		//find3Numbers(A, arr_size, sum);
	}
}
