package Recurssion;

// Euclid's Algorithm for GCD - Greatest Common Divisor
public class Gcd {
	
	private static int getGCD(int i, int j) {
		// TODO Auto-generated method stub
		if(j==0) {
			return i;
		}
		
		int res=getGCD(j,i%j);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(getGCD(10,15));
	}

	

}
