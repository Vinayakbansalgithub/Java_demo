package SDEt;

public class RemoveDuplicateArray {
	   public static int[] removeDuplicates(int[] input){
		   
		   
		   int i=0;
		   int j=1;
		   
		  while (j<input.length) {
			
			  
			  if(input[i]==input[j])
				  j++;
			  else{
				  input[++i]=input[j++];
				  
			  }
			  
		}
		   
		   
		   
		   
		   
		  int[] output = new int[i+1];
	        for(int k=0; k<output.length; k++){
	            output[k] = input[k];
	        }
	         
	        return output;
	         
	      
	    }
	     
	    public static void main(String a[]){
	        int[] input1 = {2,3,3,6,8,8,9,10};
	        int[] output = removeDuplicates(input1);
	        for(int i:output){
	            System.out.print(i+" ");
	        }
	    }
}
