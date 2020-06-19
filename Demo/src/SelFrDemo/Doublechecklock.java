package SelFrDemo;

class Lock{
	volatile static Lock instance=null;
	
	private Lock(){}
	
	public static Lock getinstance(){
	if(instance==null){
	synchronized (Lock.class) {
		if(instance==null){
			instance=new Lock();
		}
	}
		
		
	}
	return instance;
	}
	
	void print(){
		System.out.println("obj created");
	}
	
}


public class Doublechecklock {
public static void main(String[] args) {
	Lock.getinstance().print();
}
}
