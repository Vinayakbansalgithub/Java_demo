package CollectionFramework;

import java.util.Collections;

public class StackToQueue <T> {
	static Object[] s1 = new Object[5];
	static Object[] s2 = new Object[5];
	static int count = 0;
	static int count2 = 0;

	boolean flag=false;
	public void push(T value) throws Overflow{
		if(flag==false){
		if(s1.length==count){
			throw new Overflow("overflow error");
		}
		s1[count]=value;
		count++;}
		else{
			if(s2.length==count){
				throw new Overflow("overflow error");
			}
			s2[count2]=value;
			count2++;
		}
	}
	public T pop() throws Underflow{
		if(count==0){
			throw new Underflow("underflow error");
		}
		T var=(T) s1[count-1];
		s1[count-1]=null;
		count--;
		return var;
	}
	public T top(){
		T first=(T) s1[count-1];
		return first;
	}
	public T peek(){
		T FIFO=(T)s1[0];
		return FIFO;
	}
	public void enqueue(T value) throws Overflow{
		
		push(value);
	}
	public void dequeue() throws Underflow, Overflow{
	T value=	pop();
	flag=true;
	push(value);
	flag=false;
		
	}
public static void main(String[] args) throws Overflow,Underflow {
	StackToQueue<String> stack= new StackToQueue<String>();
	stack.enqueue("vinayak");
	stack.enqueue("nandini");

	stack.enqueue("mehul");
	System.out.println(stack.peek());

	stack.enqueue("monika");
	stack.dequeue();
	
System.out.println(stack.peek());
}
}
