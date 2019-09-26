package ArrayQuestions;

public class Allcombinations_stanford {

	private static void permute(String value) {
		permuteHelper(value, "");
	}

	
	
	 public static String insertString( 
		        String originalString, 
		        String stringToBeInserted, 
		        int index) 
		    { 
		  
		        // Create a new string 
		        String newString = new String(); 
		        
		        if(originalString.isEmpty()) {
		        	originalString=stringToBeInserted;
		        	return originalString;
		        }

		        	
		        for (int i = 0; i < originalString.length(); i++) { 
		  
		            // Insert the original string character 
		            // into the new string 
		            newString += originalString.charAt(i); 
		  
		            if (i == index) { 
		  
		                // Insert the string to be inserted 
		                // into the new string 
		                newString += stringToBeInserted; 
		            } 
		        } 
		  
		        // return the modified String 
		        return newString; 
		    } 
	 
	static void permuteHelper(String value, String chosen) {
		if (value.isEmpty())
			System.out.println(chosen);
		else
			for (int i = 0; i < value.length(); i++) {
				char c = value.charAt(i);
				chosen += c;
				value=value.replaceFirst(c+"", "");
				permuteHelper(value, chosen);
				value = insertString(value,c+"",i);
				chosen = chosen.substring(0, chosen.length() - 1);
			}
	}

	public static void main(String[] args) {
		String value = "abc";
		permute(value);
	}

}
