package java8;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;




interface Parent{
	MethodRfeConstructor getObejct();
}
public class MethodRfeConstructor {
	MethodRfeConstructor(String bestFeature){  
        System.out.println(bestFeature);  
    }  
	
	 MethodRfeConstructor(){
		System.out.println("constructor is called");
	}
	
	
	 public static void main(String[] args) { 
	    	//Method reference to a constructor
	        Function<String,MethodRfeConstructor> ref = MethodRfeConstructor::new;  
	        ref.apply("longest sunroof in class");  
	        
	        Supplier<Set> s = () -> { return new HashSet<>(); };  
	        Set res=s.get();
	        System.out.println("set length "+res.size());
	        
	        
	        Supplier<Set> ss = HashSet::new ;  
	        Set ress=ss.get();
	        System.out.println("set length "+ress.size());
	        
	        
	        Parent itr= MethodRfeConstructor::new;
	        itr.getObejct();
	        
	        
	    }  
}
