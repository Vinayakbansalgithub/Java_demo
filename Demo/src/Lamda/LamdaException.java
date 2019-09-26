package Lamda;

import java.util.Optional;
import java.util.stream.Stream;

@FunctionalInterface
interface MyFunctionalInterface{
    int calculate(int i, int j);
}
public class LamdaException {
    // Lambda wrapper
    static MyFunctionalInterface lambdaWrapper(MyFunctionalInterface ref) {
    	
    	
    	
    	
    	
    	
    	System.out.println("in wrapper");
        return (x, y) -> {
            try {
                ref.calculate(x, y);
            }catch(ArithmeticException e) {
                System.out.println("Exception while calculating- " + e.getMessage());
            }
            return -1;
        };
    }
    
    static int method(MyFunctionalInterface ref) {
       
              return  ref.calculate(1000, 0);
           
    }
    
    public static void main(String[] args){
    	
    	
    	String [] arr= {"a","b","c"};
    	
    	
        Optional<String> s=	Stream.of(arr).reduce(String::concat);
        	
        	System.out.println(s.get());
    	
    	String nullName = "fdf";
        String name = Optional.ofNullable(nullName).orElse("john");    	final int i=90;
    	
        System.out.println(name);
        // calling lambda wrapp
        MyFunctionalInterface ref = lambdaWrapper((x,y)->x/y);
    	System.out.println("in between");

        System.out.println("Result is " + ref.calculate(8, 0));    
        
        
//      int i=  method((x,y)->x/y);
//        	
//      System.out.println("iiiii "+i);
//        
    }
}
