package CollectionFramework;

import java.util.Arrays;
class Overflow1 extends Exception{
	 String errorMessage;
	 
	    public Overflow1(String errorMessage)
	    {
	        this.errorMessage = errorMessage;
	    }
	    @Override
	    public String toString()
	    {
	        return errorMessage;
	    }
}
class Underflow1 extends Exception{
	 String errorMessage;
	 
	    public Underflow1(String errorMessage)
	    {
	        this.errorMessage = errorMessage;
	    }
	    @Override
	    public String toString()
	    {
	        return errorMessage;
	    }
}
public class JavaStackImpl<T> {
	static Object[] obj = new Object[5];
	static int count = 0;

	public void push(T value) throws Overflow1{
		if(obj.length==count){
			throw new Overflow1("overflow error");
		}
		obj[count]=value;
		count++;
	}
	public void pop() throws Underflow1{
		if(count==0){
			throw new Underflow1("underflow error");
		}
		obj[count-1]=null;
		count--;
		
	}
	public T top(){
		T first=(T) obj[count-1];
		return first;
	}
public static void main(String[] args) throws Overflow1,Underflow1 {
	JavaStackImpl<String> stack= new JavaStackImpl<String>();
	stack.push("Ajay");
	stack.push("kanchan");
	stack.push("ankit");
	stack.push("mahima");
	stack.push("vinayak");
	//stack.push("shobhit");
	System.out.println(stack.top());
	System.out.println(Arrays.toString(obj));
stack.pop();
System.out.println(Arrays.toString(obj));
stack.pop();
stack.pop();
//stack.pop();
//stack.pop();
stack.pop();
System.out.println(stack.top());


}
}
