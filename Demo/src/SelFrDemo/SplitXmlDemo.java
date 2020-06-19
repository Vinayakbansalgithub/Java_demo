package SelFrDemo;

import java.util.ArrayList;

public class SplitXmlDemo {
	static ArrayList<String> arr= new ArrayList<String>();
	
	void splitFun(String befour,String after){
		String str="<note><to>Tove</to><from>Jani</from><heading>A2305211175</heading><body>Don't forget me this weekend!</body></note>";
		//int i=	str.indexOf(befour);
		
	/*	String[] allval=str.split(">");
		
		for(String v :allval){
			System.out.println(v);
		}*/
		
		String[] val=str.split(befour);
		String next=val[1];
		String[] last=next.split(after);
		System.out.println("my final value is   "+last[0]);
	arr.add(last[0]);
		}
	
public static void main(String[] args) {

	SplitXmlDemo splobj= new SplitXmlDemo();
	splobj.splitFun("<heading>","</heading>");
	System.out.println(arr.get(0));
}
}
