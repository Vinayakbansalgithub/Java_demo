package Arrays;


// https://www.youtube.com/watch?v=hJ_Uy2DzE08&ab_channel=KnowledgeCenter
public class MaximumProductSubarrayContigious {
	static int findSubarrays(int[] arr) {
		// TODO Auto-generated method stub
		int maxProduct = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int productSoFar = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				productSoFar = productSoFar * arr[j];
				if (productSoFar > maxProduct) {
					maxProduct = productSoFar;
					continue;
				} else {
					break;
				}

			}

		}

		return maxProduct;

	}

	public static int maxProduct(int[] nums) {
		int max_overall = nums[0];
		int max_ending_here = nums[0], min_ending_here = nums[0];

		for (int i = 1; i < nums.length; ++i) {
			int tmp = max_ending_here;

			if (nums[i] > 0) {
				max_ending_here = Math.max(nums[i], nums[i] * max_ending_here);
				min_ending_here = Math.min(nums[i], nums[i] * min_ending_here);

			} else {
				max_ending_here = Math.max(nums[i], nums[i] * min_ending_here);
				min_ending_here = Math.min(nums[i], nums[i] * tmp);

			}

			System.out.println("max:::  " + max_ending_here);
			System.out.println("min:::  " + min_ending_here);

			max_overall = Math.max(max_overall, max_ending_here);
		}
		return max_overall;
	}

	public static void main(String[] args) {
		int[] arr = { -3, 2, -4, 6, 0, -8, 5 };
		System.out.println(findSubarrays(arr));
		System.out.println(maxProduct(arr));

	}
}
