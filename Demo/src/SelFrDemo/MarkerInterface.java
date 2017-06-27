package SelFrDemo;

interface Marker{   
}

class MyException extends Exception {   

    public MyException(String s){
        super(s);
    }
}

class A implements Marker {

   void m1() throws MyException{        
     if((this instanceof Marker)){
         System.out.println("successfull");
     }
     else {
         throw new MyException("Unsuccessful  class must implement interface Marker ");
     }      
}   
}

/* Class B has not implemented Maker interface .
 * will not work & print unsuccessful Must implement interface Marker
*/
class B extends A  {    


}

// Class C has not implemented Maker interface . Will work & print successful

public class MarkerInterface  extends A implements Marker   
 { // if this class will not implement Marker, throw exception
     public static void main(String[] args)  {
    	 MarkerInterface a= new MarkerInterface();
     B b = new B();

     try {
        a.m1(); // Calling m1() and will print
        b.m1();
     } catch (MyException e) {

        System.out.println(e);
    }

}
}