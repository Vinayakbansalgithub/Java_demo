package SelFrDemo;

import java.io.IOError;
import java.io.IOException;

import org.bouncycastle.crypto.RuntimeCryptoException;

import SelFrDemo.OuterClass.InnerClass;

class OuterClass
{
    class InnerClass
    {
    	
    	
        int i;     //Non-static field of InnerClass
 
        static final int j = 10;  //static and final field of InnerClass
 
        void methodOne()
        {
            System.out.println("Non-static method of InnerClass");
        }
    }
}
public class InnerDemo {
	
	static void Hello() throws IOException{
		throw new IOException();
	}
	
	
	static void got() throws IOException{
		
		//Hello();
		
		try{
		return;
			
		}
		catch(Exception e){
		//	return;
		}
		finally{
		//return;
		}
		
		System.out.println("here");
		
	}
    public static void main(String args[]) throws Exception  
    {
    	
    	try{
    		throw new RuntimeException(); 
    		
    	}catch(Exception e){
    	//RuntimeException
    	//finally{
    
    		throw new RuntimeException();
    		
    	}
    	
    	got();
        /*OuterClass outer = new OuterClass();  //creating an instance of OuterClass
        
        
System.out.println(true);
        
Object o = new Object() {
public boolean equals(Object obj) {
return true;
}
};

        
        OuterClass.InnerClass inner = outer.new InnerClass();  //creating an instance of InnerClass
 
        System.out.println(inner.i);    //accessing non-static field of InnerClass
 
        System.out.println(OuterClass.InnerClass.j);    //static field can be accessed directly through class name
 
        inner.methodOne();     //accessing non-static method of InnerClass
    }*/
}}
