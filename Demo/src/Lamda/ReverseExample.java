package Lamda;

interface Myrev{
	
	String rev(String str);
	
}
public class ReverseExample {
public static void main(String[] args) {
	
	Myrev rev=(str) -> {
		
		
		StringBuffer buff= new StringBuffer(str);
		
		StringBuffer strev=buff.reverse();
		
		
		return strev.toString();
	};
	
	
	
System.out.println(rev.rev("hello"));
	
	
}
}
