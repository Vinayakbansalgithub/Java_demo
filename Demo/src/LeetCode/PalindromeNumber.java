package LeetCode;

public class PalindromeNumber {
	static boolean isNumber=true;
	static boolean palindrome(int number){
		boolean isPalindrome= true;
		
		int startindex=0;
		int length = Integer.valueOf(number).toString().length();
		int endindex=length-1;
		String StringNumber=Integer.toString(number);
		
		
		
		for (int i = 0; i < length/2; i++) {
			if(StringNumber.charAt(startindex++)==StringNumber.charAt(endindex--)){
				
			}
			else if(StringNumber.charAt(i)<'0'||StringNumber.charAt(i)>'9'){
				isNumber=false;
				return isNumber;
			}
			else{
				isPalindrome=false;
			}
		}
		
		
		return isPalindrome;
		
		
	}
public static void main(String[] args) {
	int number=1211621;
	
	boolean ischeck=palindrome(number);
	if(isNumber)
	System.out.println("number "+number+"  is palindrome : "+ischeck);
	
	else
		System.out.println("given number "+number+"  is not a number");

	
}
}
