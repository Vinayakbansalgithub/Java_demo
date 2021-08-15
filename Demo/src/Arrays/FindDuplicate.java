package Arrays;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one duplicate number in nums, return this duplicate number.
//287. Find the Duplicate Number
public class FindDuplicate {

	static int findDuplicate(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}
		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
			System.out.println("slow is " + slow);
			System.out.println("fast is " + fast);

		} while (slow != fast);

		fast = arr[0];

		while (fast != slow) {
			fast = arr[fast];
			slow = arr[slow];
		}
		return fast;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 3, 4, 2 };

		int res = findDuplicate(arr);
		System.out.println(res);

	}
}
