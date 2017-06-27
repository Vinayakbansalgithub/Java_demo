package SelFrDemo;

import java.util.List;

public class CThread implements Runnable {
	List<Integer> list;
	public CThread(List<Integer> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (list) {
				if(list.isEmpty()){
					System.out.println("list is empty now produce again");
					list.notifyAll();
try {
	list.wait();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}					
				}
				else{
					   int i = (Integer) 	list.remove(0);
					System.out.println("consumed"+i);
					
					
				}
				
			}
			
		}
	}

}
