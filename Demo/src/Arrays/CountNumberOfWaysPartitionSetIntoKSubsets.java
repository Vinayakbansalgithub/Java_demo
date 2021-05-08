package Arrays;

//https://www.youtube.com/watch?v=IiAsqfjhZnY&ab_channel=Pepcoding
public class CountNumberOfWaysPartitionSetIntoKSubsets {
	// Returns count of different 
    // partitions of n elements in
    // k subsets
    public static int count(int n, int k)
    {
       // Base cases
       if (n == 0 || k == 0 || k > n)
          return 0;
       if (k == 1 || k == n)
          return 1;
 
       // S(n+1, k) = k*S(n, k) + S(n, k-1)
       return (k * count(n - 1, k) 
              + count(n - 1, k - 1));
    }
 
    // Driver program
    public static void main(String args[])
    {
       System.out.println(count(4, 3));
      countDP(4, 3);

 
    }

	 static char[] countDP(int i, int j) {
		// TODO Auto-generated method stub
		 
		 int dp[][]=new int[j+1][i+1];
	
		 
		 
		 for (int t = 1; t <= j; t++) {
			 for (int p = 1; p <=i; p++) {
				 
				 if(t==p)
					 dp[t][p]=1;
				 else if(t>p)
					 dp[t][p]=0;
				 else
					 dp[t][p]=dp[t-1][p-1]+dp[t][p-1]*t;

				  
				
			}
			
		}
		 
		 
		 System.out.println("ans "+dp[j][i]);
		 
		return null;
	}
}
