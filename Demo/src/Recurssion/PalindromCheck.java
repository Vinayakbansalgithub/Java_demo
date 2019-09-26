package Recurssion;

public class PalindromCheck {
public static void main(String[] args) {
	int a[] = { 11,22,33,22,11 };
	
	boolean b=check(a);
}

 static boolean check(int[] a) {
	// TODO Auto-generated method stub
	 
	 
	 for (int i = 0; i < a.length/2; i++) {
		
		 if(a[i]!=a[a.length-i-1])
return false;		 
	}

 
 return true;
 }
}
