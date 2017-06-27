package SelFrDemo;

public class ArrayAddress {
public static void main(String[] args) {
	int[] a1={1,2,3};
	int[] b= a1;
	
	a1[0]=5;
	b[2]=10;
	System.out.println(b[0]);
	System.out.println(a1[2]);
	
	
    //initial array
    int[] oldArray = {1,2,3,4,5};
    //define a new array + allocate space
    int[] newArray = new int[oldArray.length];

    //copy values
    for(int i =0;i < oldArray.length;i++)
        newArray[i] = oldArray[i];
    oldArray[0]=99;
    System.out.println(newArray[0]);
    newArray[3]=94;
    System.out.println(oldArray[3]);

}

}
