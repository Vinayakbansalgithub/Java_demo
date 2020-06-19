package Pattern;

public class SquareNumber {
	static int upper = 2;

	static int lower = 4;
	static int base;
	static int counterupper;
	static int counterlower;

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			counterupper = 4;

			for (int j = i; j > 1; j--) {
				System.out.print(counterupper);
				counterupper--;
			}
			for (int k = ((5 - i) * 2) - 1; k > 0; k--) {
				System.out.print(lower);
			}
			base = lower + 1;
			for (int k = i; k > 1; k--) {
				System.out.print(base);
				base++;
			}
			lower--;

			System.out.println();
		}
		for (int i = 1; i < 4; i++) {
			counterlower=4;
			for (int j = 4 - i; j > 1; j--) {
				System.out.print(counterlower);
				counterlower--;
			}
			for (int k = (i * 2) + 1; k > 0; k--) {
				System.out.print(upper);
			}
			base = upper + 1;
			for (int k = 3; k > i; k--) {
				System.out.print(base);
				base++;
			}
			upper++;
			System.out.println();
		}

	}
}
