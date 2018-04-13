package SelFrDemo;

public class DemonThread {
	
	
	
	int i=10;
	
	 private  int modify(Integer i)
	    {
	       // i = i + 1;
		 i=20;
	        return i;
	    }
	
	
	
	
	public static void main(String... a)
	{
		 Integer i = new Integer(12);
	        System.out.println(i);
	      //  modify(i);
	        System.out.println(i);
	        
	        
	        DemonThread dd= new DemonThread();
	        dd.modify(i);
	        
	        System.out.println(dd.i);
		
	}
}
