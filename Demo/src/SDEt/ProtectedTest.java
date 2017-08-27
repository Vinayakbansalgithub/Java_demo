package SDEt;

import java.util.StringTokenizer;

 class A {
protected A(){
	System.out.println("super protected constructor");
}
}
class B extends ProtectedTest{
	
	
	
}

public class ProtectedTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		
		StringTokenizer  stTokens = new StringTokenizer("fjyfjfj uyfjiiy gjfgj ggkgk ggig");
		
		while(stTokens.hasMoreTokens()){
			 System.out.println(stTokens.nextToken());
			 }
		
		String str="VinAyaK";
		
		char[] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int ii=ch[i];
			
			System.out.println(ii);
		}
		
		
		A obj= new  A();
		ProtectedTest p=new ProtectedTest();
		p.clone();

	}
}