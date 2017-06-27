package SelFrDemo;

public class SubstringrevMethod {
	
	int length=0;
	int lastIndex;
	int begIndex;
	int k ;
	void rev(String str){
		lastIndex=str.length();
		length=		str.length();
		
		
		char[] ch=str.toCharArray();
		while( ch[length-1]!=' ' ){
		k= length-1;
		length--;
		if(length==0)
			break;
		
		}

		System.out.print(str.substring(k, lastIndex)+" ");
		while(k!=0)
		rev(str.substring(0, k-1));
		
	}
	
	public static void main(String[] args) {
		String str="hello to the new day";
		SubstringrevMethod obj= new SubstringrevMethod();
		obj.rev(str);
	}





}
