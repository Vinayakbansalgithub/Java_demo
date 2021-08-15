package bit;

public class AllSetBits {
	
	 public static int countPrimes(int n) {
	     
	        int count;
	        if(n<2){
	            count=0;
	        }else{
	       count =n-1; 
	        }
	        
	         for(int i=2;i<=n;i++){
	             System.out.println(" i is "+i);
	             for(int j=2;j<i;j++){
	             // base case
	            if(i%j==0){
	             System.out.println(i+" is not prime");
	                 count--;
	                break;
	            }   
	         }
	            
	        }     
	        
	        return count;
	        
	        
	    }
	 
	public static void main(String[] args) {

		int i = 37;
		int ans = 0;
		int mask = 1;
		int counter = 1;
		while (i > mask) {

			ans = i & mask;
			if (ans != 0) {
				System.out.println("index is " + counter);
			}

			mask = 1 << counter;

			counter++;

		}
		
		int res=countPrimes(5);
		System.out.println(res);

	}
}
