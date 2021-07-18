package ArrayQuestions;

public class Elementwithleftsidesmallerandrightsidegreater {

	static void find(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int head = arr[i];

			int left = i - 1;
			int right = i + 1;

			while (left >= 0 && arr[left] < head) {
				left--;
			}

			while (right < arr.length && arr[right] > head) {
				right++;
			}

			if (left == -1 && right == arr.length) {
				System.out.println("index is " + i);
				System.out.println("value is " + arr[i]);
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 1, 1, 3, 111, 80, 100, 79, 19 };
		find(arr);
	}
}
