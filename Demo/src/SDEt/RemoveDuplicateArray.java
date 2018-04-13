package SDEt;



// this works if the array is sorted

public class RemoveDuplicateArray  {
	
	
	
	
	
	static void removeDuplicatesUnsorted(int[] arrayWithDuplicates)
    {
       
         
        //Assuming all elements in input array are unique
         
        int noOfUniqueElements = arrayWithDuplicates.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                 
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element
                     
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                     
                    //Decrementing noOfUniqueElements
                     
                    noOfUniqueElements--;
                     
                    //Decrementing j
                     
                    j--;
                
            }
	
            }}}
	
	
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
	        int[] input1 = {4, 3, 2, 4, 9, 2};
	       // int[] output = removeDuplicates(input1);
	        
	        
	        removeDuplicatesUnsorted(input1);
	       /* for(int i:output){
	            System.out.print(i+" ");
	        }*/
	    }
}
