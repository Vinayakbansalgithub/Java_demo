package ApiTesting;

public class Factorial {
public static void main(String[] args) {
	
	
	String ss="This specification does not indicate the behavior, rendering or otherwise, of space characters other than those explicitly identified here as white space characters. For this reason, authors should use appropriate elements and styles to achieve visual formatting effects that involve white space, rather than space characters.For all HTML elements except PRE, sequences of white space separate 'words' (we use the term 'word' here to mean 'sequences of non-white space characters'). When formatting text, user agents should identify these words and lay them out according to the conventions of the particular written language (script) and target medium.";
	
	
	System.out.println(ss.length());
	
	
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


