package Arrays;



//  a come before b
public class SecondFirst {
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		String word = "ababab";
		char a = 'a';
		char b = 'b';

		int counter = 0;

		for (int j = 0; j < word.length(); j++) {

			if (a == word.charAt(j) && counter % 2 == 0) {
				counter += 1;
			} else if (b == word.charAt(j) && counter % 2 == 1) {
				counter += 1;
			}

		}

		System.out.println("counter is " + counter);
		if (counter == word.length())
			System.out.println("condition pleased");
		else
			System.out.println("condition not satisfied");

	}
}
