package SelFrDemo;


class Send{
	
	public static void sendmessage(String str){
		System.out.println("your message "+str);
		
	}
	
}


class ThreadClassa extends Thread{
String msg;
Send  send;
ThreadClassa(String msg, Send send){
	this.send=send;
	this.msg=msg;
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	
	synchronized (msg) {
		
		Send.sendmessage(msg);
		
		
	}
	
}
	
}



public class SynchronizeSendDemo {

	public static void main(String[] args) {
		
		Send s1= new Send();
		Send s2= new Send();
		
		ThreadClassa obj1= new ThreadClassa("hii",s1);
		ThreadClassa obj2= new ThreadClassa("buy",s2);
		
		obj1.start();
		obj2.start();
		
		
	}
	
	
}
