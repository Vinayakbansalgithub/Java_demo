package Arrays;

public class MinimumJumpsToReachEnd {
	
	
	// revisit

	
	// covered in jump game
	
	
	public static void main(String[] args) {
		// int arr[] = new int[] { 2, 1, 3, 2, 3, 4, 5, 1, 2, 8 };

		int arr[] = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int minJumpArr[] = new int[arr.length];
		int jumpPathArr[] = new int[arr.length];

		int res = jump(arr, minJumpArr, jumpPathArr);
		System.out.println("jump req:: " + res);

	}

	static int jump(int[] arr, int[] minJumpArr, int[] jumpPathArr) {

		for (int i = 0; i < minJumpArr.length; i++) {
			minJumpArr[i] = Integer.MAX_VALUE;
		}
		minJumpArr[0] = 0;

		for (int i = 1; i < jumpPathArr.length; i++) {
			for (int j = 0; j < i; j++) {

				if (i <= arr[j] + j) {
					// from where we come
					jumpPathArr[i] = j;
					minJumpArr[i] = Math.min(minJumpArr[i], (minJumpArr[j] + 1));

				}
			}
		}

		return minJumpArr[minJumpArr.length - 1];

	}
}
