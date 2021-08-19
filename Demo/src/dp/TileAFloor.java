package dp;

public class TileAFloor {

	
	
	//floor is n*2 and tile is 2*1
	
	public static void main(String[] args) {
		int result =find(6);
		System.out.println(result);
		
		
		result = waysnMXN(3, 2);

		System.out.println(result);
	}

	 static int find(int n) {
		// TODO Auto-generated method stub
		 int result=0;
		 if(n==0)
			 return 1;
		 if(n==1)
			 return 1;
		 
		 result=find(n-1)+find(n-2);
		 
		 return result;
		 
		
	}
	 
	 
	//problem 2 Tiling floor M x N  using 1*M Tiles  

		private static int waysnMXN(int m, int n) {
			// TODO Auto-generated method stub

			int dp[] = new int[n ];

			for (int i = 1; i <= n; i++) {

				if (i-m >= 0) {
					dp[i] = dp[i - 1] + dp[i - m];
				}else {
					dp[i] = dp[i - 1];
				}
			}

			return dp[n];
		}
}
