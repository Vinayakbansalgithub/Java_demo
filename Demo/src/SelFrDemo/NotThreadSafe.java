package SelFrDemo;

public class NotThreadSafe {
	static int i=1;
	StringBuilder builder = new StringBuilder();

    

	public void add(String text) {
		  this.builder.append(text);	
		  System.out.println(text+i++);
	}
    
    
}
