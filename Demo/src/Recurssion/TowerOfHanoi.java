package Recurssion;

import java.util.Scanner;

public class TowerOfHanoi {

	static void towerOfHanoi(int n, char src, char dest, char help) {

		if (n == 1) {
			System.out.println("Move disk 1 from rod " + src + " to rod " + dest);
			return;
		}
		towerOfHanoi(n - 1, src, help, dest);
		System.out.println("Move disk " + n + " from rod " + src + " to rod " + dest);
		towerOfHanoi(n - 1, help, dest, src);
	}

	public static void main(String args[]) {		

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		towerOfHanoi(Integer.parseInt(str), 'A', 'C', 'B'); 
	}
}
