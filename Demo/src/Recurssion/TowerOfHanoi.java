package Recurssion;

import java.util.Scanner;

public class TowerOfHanoi {

	static void towerOfHanoi(int n, char from, char temp, char to) {

		if (n == 1) {
			System.out.println("Move disk 1 from rod " + from + " to rod " + to);
			return;
		}
		towerOfHanoi(n - 1, from, to, temp);
		System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
		towerOfHanoi(n - 1, temp, from, to);
	}

	public static void main(String args[]) {		

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		towerOfHanoi(Integer.parseInt(str), 'A', 'B', 'C'); 
	}
}
	
