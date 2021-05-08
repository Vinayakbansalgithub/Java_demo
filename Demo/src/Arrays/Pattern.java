package Arrays;

public class Pattern {
	public static void main(String[] args) {
		int rows = 10;

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {

				if (i == rows || k == 1 || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println(" ");

		}
	}
}

