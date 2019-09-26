package LeetCode;

import java.util.Arrays;
import java.util.Optional;

public class MaxContigiousSubarray {
	public enum VerificationOperator {
	    // Strings
	    EQ,                            // Equals
	    NEQ,                        // Not Equals
	    REGEX,                      // Full regex match
	    WILDCARD,                   // Basic wildcard matching
	    CONTAINS,                    // Contains
	    NOTCONTAINS,                // Not Contains

	    // Date
	    DATE,                        // Check if string is date

	    // Int
	    EQI,                        // Equals
	    NEQI,                        // Not Equals
	    LTI,                        // Less than
	    LTSTEPVALI,
	    GTI,                        // Greater than
	    GTSTEPVALI,
	    LTEI,                        // Less than or equal
	    LTESTEPVALI,
	    GTEI,                        // Greater than or equal
	    GTESTEPVALI,
	    RANGEI,                        // Range

	    // Float
	    EQF,                        // Equals
	    NEQF,                        // Not Equals
	    LTF,                        // Less than
	    LTSTEPVALF,
	    GTF,                        // Greater than
	    GTSTEPVALF,
	    LTEF,                        // Less than or equal
	    LTESTEPVALF,
	    GTEF,                        // Greater than or equal
	    GTESTEPVALF,
	    RANGEF,                        // Range

	    // Step Values
	    //STEPEQ,
	    //STEPNEQ,
	    //STEPCONTAINS,\
	    CONTAINEDIN,
	    CONTAINEDINSTEPVAL,
	    STEPNCONTAINS,
	    NEQSTEPVAL,

	    //Previous value
	    CONTAINSSTEPVAL,
	    EQSTEPVAL,
	    NOTCONTAINSSTEPVAL;

	    public static Optional<VerificationOperator> fromString(String value) {
	        for (var operator : VerificationOperator.values()) {
	            if (operator.name().equalsIgnoreCase(value)) {
	                return Optional.of(operator);
	            }
	        }
	        return Optional.empty();
	    }
	}
	static int sum(int[] arr) {

		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
					if(sum>maxSum) {
						maxSum=sum;
					}
				
				}
				
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		
		String raw="[resourceVariable::https://functionizeapp.com/testsites/anaqa/::statusCode]#func#eq#func#200";
		                              
		
        String[] arrf = raw.split("#func#");
        System.out.println(arrf.length);

        
        String[] arr1 = raw.split("::");

        String url = arr1[1];
        String value = arr1[2].substring(0, arr1[2].length());
      System.out.println("Value {}"+ value);

       String  evarName = "functionizeResourceVariables['"+url+"']["+value+"]" ;

       System.out.println("ResourceVariable EvarName "+ evarName);
        
       
		
		int arr[] = {1,-2 ,3, -1};
		int sum = sum(arr);
		System.out.println(sum);
		
	}
	
}
