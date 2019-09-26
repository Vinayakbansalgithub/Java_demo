package Recurssion;

public class myAtoiRecursive {

	static int num = 0;

	static int myAtoiRecursivee(String str, int n) {
		if (n < str.length()) {
			int v = str.charAt(n) - '0';
			num = num * 10 + v;
			myAtoiRecursivee(str, n + 1);

		}

		return num;

	}

	public static void main(String[] args) {
		{
			String str = "112456";
			System.out.println(myAtoiRecursivee(str, 0));

		}

	}
}