package SelFrDemo;

import java.util.List;

public class PThread implements Runnable {
	List<Integer> list;
	int capacity;
	public PThread(List<Integer> list, int max) {
		// TODO Auto-generated constructor stub
		this.list=list;
		capacity=max;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int counter=0;
		while(true){
			synchronized (list) {
				if(list.size()==capacity){
					
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else{
					list.add(counter);
					System.out.println("produced"+counter);
					counter++;
					list.notifyAll();
				}
			}
			
			
		}
		
	}

}
