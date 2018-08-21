package ApiTesting;

public class Factorial {
public static void main(String[] args) {
	
	
	System.out.println(fact(5));
	
	
	
	prime();

}

 static int fact(int i) {
	// TODO Auto-generated method stub
	if(i==0){
		return 1;
		
	}
	
return (i*fact(i-1));
}
static int result=1;
static int count=0;
static int num=2;
 static void prime() {
	// TODO Auto-generated method stub
	while (count !=10) {
		boolean prime=true;
		int till=num/2; 
		
		
		for (int i = 2; i <= till; i++) {
			if(num%i==0)
				prime=false;
		}
		if(prime){
			System.out.println("prime"+num);
			count++;
		}
		
		
		num++;

	}
		
		 
	 }
	
	 
}


