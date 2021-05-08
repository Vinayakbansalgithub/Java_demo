package Recurssion;

public class SubsetWithgivenSum {
	// Returns true if there is a subset 
    // of set[] with sum equal to given sum 
    static boolean isSubsetSum(int set[], int si,
                               int ei, int sum) 
    { 
        // Base Cases 
        if (sum == 0) 
            return true; 
        if (ei == 0) 
            return false; 
  
        // If last element is greater than 
        // sum, then ignore it 
        if (set[ei - 1] > sum) 
            return isSubsetSum(set,si, ei - 1, sum); 
  
        /* else, check if sum can be obtained  
        by any of the following 
            (a) including the last element 
            (b) excluding the last element */
        return isSubsetSum(set, si,ei - 1, sum) 
            || isSubsetSum(set,si, ei - 1, sum - set[ei - 1]); 
    } 
  
    /* Driver program to test above function */
    public static void main(String args[]) 
    { 
        int set[] = { 3, 34, 4, 12, 5, 2 }; 
        int sum = 9; 
        int n = set.length; 
        if (isSubsetSum(set,0, n, sum) == true) 
            System.out.println("Found a subset"
                               + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
    } 
	 
}
