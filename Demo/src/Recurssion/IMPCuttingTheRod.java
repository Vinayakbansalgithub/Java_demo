package Recurssion;


// do from knapsack
public class IMPCuttingTheRod {
	
 static int maxProfit(int[] cost, int length) {
	// TODO Auto-generated method stub
	 
	 
	 if (length <= 0) 
         return 0; 
	 
	 int profit=cost[length-1];
	 for (int i = 0; i < length; i++) {
		 int temp= cost[i]+maxProfit(cost, length-1-i);
		 if(temp>profit)
			 profit=temp;
	}
	 
	 return profit;
	
}
	
public static void main(String[] args) {
    int cost[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
    int profit = maxProfit(cost,cost.length);
	System.out.println(profit);
}

}
