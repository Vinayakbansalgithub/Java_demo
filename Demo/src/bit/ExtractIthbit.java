package bit;

public class ExtractIthbit {
	public static void main(String[] args) {

		int i = 6;
		//int i = 22;
		int n = 5;

		int mask = 1 << (n - 1);

		System.out.println(mask);

		int res = i & mask;
		System.out.println(res);

		if (res == 0) {
			System.out.println("res is " + 0);
		} else {
			System.out.println("res is " + 1);

		}
	}
}
