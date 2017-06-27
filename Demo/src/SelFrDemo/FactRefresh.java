package SelFrDemo;

public class FactRefresh {
	int fact=1;
	int fact(int num){
		if(num==0){
			return fact;

		}
		fact=num*fact;
				fact(num-1);
		return fact;
		
	}
	
public static void main(String[] args) {
	int num=4;
	FactRefresh obj= new FactRefresh();
int val=	obj.fact(num);
	System.out.println(val);
}
}