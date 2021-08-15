package bit;

public class Setithbit {
	public static void main(String[] args) {

		int i = 21;
		int n = 3;

		int mask = 1 << (n - 1);

		System.out.println(mask);

		int res = i | mask;
		System.out.println(res);

		if (res == 0) {
			System.out.println("res is " + 0);
		} else {
			System.out.println("res is " + 1);

		}
	}
}
