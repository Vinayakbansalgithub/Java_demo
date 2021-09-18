package ArrayQuestions;

public class MissingNumberOfArray {

	public static int find(int[] arr, int n) {

		int ExpetedSum = n  * ((n + 1) / 2);

		int currSum = 0;
		for (int i : arr) {
			currSum += i;
		}

		int num = ExpetedSum - currSum;

		return num;
	}

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 5 };
		int total_num = 5;

		int res = find(numbers, total_num);
		System.out.println(res);

	}

}
