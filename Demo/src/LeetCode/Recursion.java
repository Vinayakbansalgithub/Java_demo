package LeetCode;

public class Recursion {
	static int hello(int i){
		System.out.println(i);
		
		while(i>0){
		 int kk = hello(i-1);
		
		}
		
		return 0;
		
		
		
		
	}
public static void main(String[] args) {
	int val=11;
	hello(val);
}
}
