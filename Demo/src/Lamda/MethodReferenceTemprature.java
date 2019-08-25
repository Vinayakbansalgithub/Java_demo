package Lamda;

import SelFrDemo.Check;

interface Data<T> {

    boolean myData(T v);

}

public class MethodReferenceTemprature {

	int temp;
	

    public MethodReferenceTemprature(int i) {
temp=i;
}
	static <T> void showData(T tarray) {
 
        
   }
     static <T> void callShowData(Data<T> daobj, T[] tarray, MethodReferenceTemprature obj) {
 
        daobj.myData(tarray);
     }

     public static void main(String[] args) {
    	 
    	 
    	 MethodReferenceTemprature arr[]= {new 
    	    	 MethodReferenceTemprature(60),new MethodReferenceTemprature(20)};

       
 
        callShowData(MethodReferenceTemprature::showData, arr, new  MethodReferenceTemprature(40));
        
     }
}