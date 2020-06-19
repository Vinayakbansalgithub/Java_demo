package LeetCode;

public class PermutationsString {
	
	
	public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	private void permute(String str, int i, int j) {
		// TODO Auto-generated method stub
		
		
		if(i==j)
			System.out.println(str);
		
		else{
			
			for (int k = i; k <= j; k++) {
			str=	swap(str,k,i);
				
			//	System.out.println(str);
				
				permute(str,i+1,j);
				
		//	str=	swap(str,k,i);
				
			//	System.out.println(str);
				
				System.out.println("value of i "+i);
			}
			
		}
		
		
	}
	 public static void main(String[] args)
	    {
	        String str = "ABC";
	        int n = str.length();
	        PermutationsString permutation = new PermutationsString();
	        permutation.permute(str, 0, n-1);
	    }

	 
}
