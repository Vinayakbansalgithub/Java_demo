package Arrays;

//55. Jump Game
public class JumpGame {

	static boolean jump(int[] arr) {
		int reached = 0;
		for (int i = 0; i <= reached; i++) {

			reached = Math.max(reached, arr[i] + i);

			if (reached >= arr.length) {
				
				System.out.println("min jump "+i);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		//int arr[] = new int[] { 1, 1, 2, 0, 2, 1, 0, 0, 1, 3 };
		
		
		int arr[] = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		boolean res = jump(arr);
		System.out.println(res);
	}

}
