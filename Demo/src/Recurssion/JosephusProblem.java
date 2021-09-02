package Recurssion;

import java.util.Arrays;
import java.util.stream.Stream;

public class JosephusProblem {
	public static void main(String[] args) {
		int n = 5;
		int k = 2;

		int res = find(n, k );
		
		// because initially it was zero based indexing anmd we need on baserd indexing
		System.out.println(res+1);
	}

	static int find(int n, int k) {
		// TODO Auto-generated method stub

		if (n == 1) {
			return 0;
		}

		return (find(n - 1, k) + k) % n ;

	}

}
