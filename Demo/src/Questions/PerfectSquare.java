package Questions;



//complexity is O(logn) 

// pending

public class PerfectSquare {
	
	
	
	
	static boolean calculatePerfect(int number,int min,int max){
		
		while(min<max){
		
		int guess=(min+max)/2;
		
		
		if(guess*guess==number){
			
			System.out.println("perfect  square is "+guess);
			return true;}
		
		if(guess*guess<number){
			
			
			min=guess+1;
		}
		if(guess*guess>number){
			
			
			max=guess-1;
			
		}
		}
		
		return false;
		
	}
	static boolean PerfectCheck(int number){
		
		
		boolean result=calculatePerfect(number,1, number);
		return result;
	
	}
	
	
public static void main(String[] args) {

	boolean b=PerfectCheck(256);
System.out.println("result  "+b);

}
}
