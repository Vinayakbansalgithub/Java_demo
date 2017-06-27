package SelFrDemo;

public class SumWithoutadd {
    int add(int a,int b)
    {
        int sum,carry;  
        if (b == 0) 
                return a;
        sum = a ^ b; // add without carrying
        carry = (a & b) << 1; // carry, but don’t add
        return add(sum,carry); // recurse
    }
    public static void main(String[] args) {
    	SumWithoutadd obj= new SumWithoutadd();
    int sum=	obj.add(3, 7);
    	System.out.println("sum "+sum);
	}

}
