package Questions;


//Given a string, determine if a permutation of the string could form a palindrome.
public class PalindromPermutation {
	

public static void main(String[] args) {

	String input="aabcbaa";
	int n = input.length();
int count=0;


for (char i = 97; i <=128; i++) {
	//System.out.println(i);
	
	int charfound=0;
	
	for (char j = 0; j < input.length(); j++) {
		
		char ch= input.charAt(j);
		
		if(ch==i)
			charfound++;
		
		
		
	}
if(charfound%2==1)
	count++;
	



}

if(count>1){
	System.out.println ("it can not form palindrom string");
	
}else
System.out.println("it can form palindrom");
}


}
