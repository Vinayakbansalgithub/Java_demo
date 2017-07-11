package SelFrDemo;

import java.util.Stack;

public class RevusingStack {
public static void main(String[] args) {
	String sen="welocme to puresoftware noida";
	String word="puresoftware";
	Stack<String> senstack= new Stack<String>();
	Stack<Character> wordtack= new Stack<Character>();
	
	String[] spsen= new String[10];
	spsen=sen.split(" ");
	
	for (String string : spsen) {
		senstack.push(string);
	}
while (!senstack.isEmpty()) {
	System.out.println(senstack.pop());
	
}
	
char[] spchar= new char[12];


spchar=word.toCharArray();

for (char ch : spchar) {
	wordtack.push(ch);
}
while (!wordtack.isEmpty()) {
	System.out.println(wordtack.pop());
	
	
	try{
		int h=1000/0;
		
	}
	catch(Exception e){
		throw new NumberFormatException();
	}
}
}
}
