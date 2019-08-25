package ThreadPackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

class FJThread extends RecursiveTask<Integer>{

	int arr[],start,end,mid,value;
	
	FJThread(int arr[], int start,int end,int value){
		this.arr=arr;
		
		this.start=start;
		this.end=end;
		this.value=value;
		
	}

	
	int process(int arr[], int start,int end,int value) {
		
		for (int i = start; i <=end; i++) {
			if(arr[i]==value)
				return i;
			
			
		}
		return -1;
		
		
		
	}
	
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		System.out.println("compute method "+Thread.currentThread());
		 
		int size = end-start+1;
		
		if(size>3){
			
			
			int mid=(end+start)/2;
			System.out.println("recall "+mid);

			FJThread task1= new FJThread(arr, start, mid, 7);
			FJThread task2= new FJThread(arr, mid+1, end, 7);
		    task1.fork();
		 	task2.fork();
		 	
		 	System.out.println(task1.join());
		 	System.out.println(task2.join());
			return task2.join()+task1.join();
		
		}
		else {
			int result= process( arr,  start, end, value);
			return result;

		}
		}
		
		
		
		
	
	
	
	
	
} 


public class ForkJoinExample {
	
	public static void main(String[] args) {
		ForkJoinPool pool= new ForkJoinPool();
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int start =0;
		int end =9;
		
		FJThread task=new FJThread(arr, start, end,7);
		Integer result=pool.invoke(task);
		System.out.println("result "+result);
		
		
		
	}

}
