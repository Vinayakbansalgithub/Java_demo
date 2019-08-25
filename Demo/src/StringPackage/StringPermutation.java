package StringPackage;

public class StringPermutation {

	static void permute(String str) {

		permuteHelper(str, "");

	}

	static void permuteHelper(String str, String chosen) {
		
		
		if(str.isEmpty()) {
			System.out.println(chosen);
		}else {

		for (int i = 0; i < str.length(); i++) {

			
			chosen += str.charAt(i);
			
			char c=str.charAt(i);;

			str = str.substring(i + 1);

			permuteHelper(str, chosen);
			
			str=c+str;
			chosen=chosen.substring(0, chosen.length()-1);
		}
		
		}

	}

	public static void main(String[] args) {

		String str = "abcd";

		permute(str);
	}

}
