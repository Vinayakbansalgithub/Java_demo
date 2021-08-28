package Arrays;

// https://www.youtube.com/watch?v=hJ_Uy2DzE08&ab_channel=KnowledgeCenter

// LeetCode 152

public class MaximumProductSubarrayContigious {

	public static int maxProduct(int[] nums) {
		// base case
        if (nums.length == 0) {
            return 0;
        }
 
        // maintain two variables to store the maximum and minimum product
        // ending at the current index
        int max_ending = nums[0], min_ending = nums[0];
 
        // to store the maximum product subarray found so far
        int max_so_far = nums[0];
 
        // traverse the given array
        for (int i = 1; i < nums.length; i++)
        {
            int temp = max_ending;
 
            // update the maximum product ending at the current index
            max_ending = Integer.max(nums[i], Integer.max(nums[i] * max_ending,
                                                nums[i] * min_ending));
 
            // update the minimum product ending at the current index
            min_ending = Integer.min(nums[i], Integer.min(nums[i] * temp,
                                                nums[i] * min_ending));
 
            max_so_far = Integer.max(max_so_far, max_ending);
        }
 
        // return maximum product
        return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr = { -3, 2, -4, 6, 0, -8, 5 };
		//int[] arr = { -2,-2,0};

		System.out.println(maxProduct(arr));

	}
}
