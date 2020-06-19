package SelFrDemo;

public class ReverseEachWord {

	static String revWord;
	static String[] strarray = new String[6];
	static char[] tochar;
	static String[] finalvalue = new String[6];
static String xxx="";

	static void splitfun(String str) {
		strarray = str.split(" ");
		}

	static String rev() {
	for (int i =  0; i <= strarray.length-1; i++) {
		revWord=strarray[i];
		tochar=revWord.toCharArray();
		
		for (int j =  tochar.length-1; j >= 0; j--) {
			xxx=xxx+tochar[j];
		}
		xxx=xxx+" ";
		
	}
	return xxx;
	}
	
	public static void main(String[] args) {
		String str = "we should work hard for good life";
		ReverseEachWord.splitfun(str);
		String val=ReverseEachWord.rev();
		System.out.println("reverse each word is "+val);

	}
}

