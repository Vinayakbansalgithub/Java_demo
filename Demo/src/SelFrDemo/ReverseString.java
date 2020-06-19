package SelFrDemo;

public class ReverseString {
	public static String recursiveMethod(String str){
		if(str.length()==1)
		
		return str;
		
			return(recursiveMethod(str.substring(1)))+str.charAt(0);
		
		
	}
public static void main(String[] args) {
	String str="hello vinayak";
	StringBuilder bilder= new StringBuilder(str);
	System.out.println(bilder.reverse());
	char[] tochar=str.toCharArray();
	String rev = "";
	for (int i =  tochar.length-1; i >= 0; i--) {
		rev=rev+tochar[i];
	}
	System.out.println(rev);
	System.out.println(ReverseString.recursiveMethod(str));
}
}
