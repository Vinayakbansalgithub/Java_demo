package SelFrDemo;

public class PrimeRefresh {
public static void main(String[] args) {
	int num=12;
	boolean prime=false;
	for (int i = 2; i < num/2; i++) {
		if(num%2==0)
			prime=true;
	}
	if(prime==true)
		System.out.println("prime");
	else
		System.out.println("not");
}

}
