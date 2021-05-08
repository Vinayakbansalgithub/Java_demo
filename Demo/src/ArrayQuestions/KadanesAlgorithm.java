package ArrayQuestions;

public class KadanesAlgorithm {
	public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
    }

	 static int maxSubArraySum(int[] a) {
		// TODO Auto-generated method stub
		 
		 
		 int maxSofar = 0, maxEndHere=0;
		 
		 for (int i = 0; i < a.length; i++) {
			 
			 maxEndHere = maxEndHere+a[i];
			 
			 if(maxEndHere>maxSofar) {
				 maxSofar=maxEndHere;
				 
				 
			 }
			 
			 if(maxEndHere<0)
				 maxEndHere=0;
			
		}
		 
		 
		return maxSofar;
	} 
}
