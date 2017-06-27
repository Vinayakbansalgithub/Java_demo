package SelFrDemo;

public class PreservingPositionSpaceReverse {
	static int[] indexspace= new int[4];
	static int ix=0;
	static String spacePosition(String str){
	char[] ch=str.toCharArray();	
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' '){
				indexspace[ix]=i;
				ix++;
			}
		}
		int xx=0,k=0;
		char[] without=str.replaceAll(" ", "").toCharArray();
		String rev = new String();
		for (int i =  without.length-1; i >= 0; i--) {
			if(k==indexspace[xx]){
				rev=rev+" ";
				xx++;
				rev=rev+without[i];
				}else
			rev=rev+without[i];
			k++;
		}
		return rev;
	}
public static void main(String[] args) {
	String str= "Vinayak works in TTN Noida";
	
	String a=PreservingPositionSpaceReverse.spacePosition(str);
System.out.println(a);
}
}
