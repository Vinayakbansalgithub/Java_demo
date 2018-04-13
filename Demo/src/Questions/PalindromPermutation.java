package Questions;

public class PalindromPermutation {
	

public static void main(String[] args) {

	String input="aabcbaa";
	int n = input.length();
int count=0;
for (char i = 0; i <=128; i++) {
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
	System.out.println ("it can not form palindrom");
	
}else
System.out.println("it can form palindrom");
}


}
