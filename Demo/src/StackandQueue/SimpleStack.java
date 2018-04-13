package StackandQueue;

public class SimpleStack<T> {

	static Object objArray[];
	static Object objArrayQueue[];

	int count;
	int countTwo;

	int top;

	SimpleStack() {
		objArray = new Object[10];
		objArrayQueue = new Object[10];

		count = 0;
		countTwo = 0;

		top = -1;

	}

	void isEmpty(){
		
		if(top==-1)
			System.out.println("stack is empty");
	}
	
	boolean isFull(){
		
		if(count==objArray.length){
			System.out.println("stack is full");
			return true;
	}
		else{
			return false;
		}	
	
	
	}
	
	
	void push(T element){
		
		if(!isFull()){
			objArray[count]=element;
			count++;
			top++;
			
			
			
		}
		
	}
	
	void pop(){
		System.out.println("pop value "+objArray[count-1]);

		objArray[count-1]=null;
		count--;
		
		
	}

	
	
	void Dequeue(){
		
		if(countTwo==0){
			
			for (int i = count-1; i>=0; i--) {
				objArrayQueue[countTwo]=objArray[i];
				countTwo++;
			}
			
			 System.out.println("deque value is "+objArrayQueue[countTwo-1]);
			 countTwo--;

		}
		else{
			 System.out.println("deque value is "+objArrayQueue[countTwo-1]);
			 countTwo--;

		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		SimpleStack<Integer> obj = new SimpleStack<Integer>();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		//obj.pop();
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.pop();
		obj.pop();

		for (int i = 0; i < objArray.length; i++) {
			
			System.out.println(objArray[i]);
		}	
		
		
		
		
		
		
		// move element in second stack to implement queue
		obj.Dequeue();

		obj.Dequeue();

		
	}
}
