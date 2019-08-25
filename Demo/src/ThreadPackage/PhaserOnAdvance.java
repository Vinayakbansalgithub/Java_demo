package ThreadPackage;

import java.util.concurrent.Phaser;

class PhThread implements Runnable{
	PhaserOnAdvance phRef;
	public PhThread(String name, PhaserOnAdvance objph) {
		objph.register();
		// TODO Auto-generated constructor stub
		this.phRef=objph;
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		boolean check=phRef.isTerminated();
		System.out.println(check);
		
		System.out.println(Thread.currentThread().getName()+" is at phase "+phRef.getPhase());
		phRef.arriveAndAwaitAdvance();

		boolean checkkk=phRef.isTerminated();
		System.out.println(checkkk);
		System.out.println(Thread.currentThread().getName()+" is at phase "+phRef.getPhase());
		phRef.arriveAndAwaitAdvance();

		
		System.out.println(Thread.currentThread().getName()+" is at phase "+phRef.getPhase());

	}
 
	
} 

public class PhaserOnAdvance extends Phaser{
	
	PhaserOnAdvance(){
		super();
	}
	
	
	@Override
    protected boolean onAdvance(int phase, 
                                int registeredParties) 
    { 
        System.out.println("Phase "
                           + phase 
                           + " completed.\n"); 
  
        // If all phases have completed, return true. 
        if (phase ==4 
            || registeredParties == 1) { 
            return true; 
        } 
  
        // otherwise, return false 
        return true; 
    } 
	
public static void main(String[] args) {
	
	PhaserOnAdvance objph= new PhaserOnAdvance();
	
	new PhThread("a",objph);
	new PhThread("b",objph);
	new PhThread("c",objph);
	new PhThread("d",objph);

	
}
}
