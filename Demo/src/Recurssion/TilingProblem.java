package Recurssion;

import java.util.Scanner;

public class TilingProblem {

	private static long place(long n, long m) {
		if (n ==1 || n<m) {
			return 1;
		}
		if(n==m){
			return 2;
		}
		return place(n - 1, m) + place(n - m, m);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long totalcases = Integer.parseInt(scanner.nextLine().trim());
		for (long i = 0; i < totalcases; i++) {
			String arrayString = scanner.nextLine();
			String arrayStringarr[] = arrayString.split(" ");
			long ways = place(Integer.parseInt(arrayStringarr[0].trim()), Integer.parseInt(arrayStringarr[1].trim()));
			System.out.println();
			System.out.println(ways + " ");
		}
	}
}

//10
//39462 25602 
//29680 52811 
//83054 93356 
//29602 66791 
//14717 78403 
//55774 64800 
//67309 8625 
//29315 41141 
//7428 17804 
//86402 1354 