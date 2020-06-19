package SDEt;

import java.util.Scanner;



class MathErrorException extends Exception{
	
	MathErrorException(String ex){
		super(ex);
	}
	
}
public class ParseExpressions {
	
	
	static char[] arrchar={'0','1','2','3','+','-','*','/'};
	
public static void main(String[] args) throws MathErrorException {
	Scanner scan= new Scanner(System.in);
	String TotTC=scan.nextLine();
	int TCcount = Integer.parseInt(TotTC);
	System.out.println("total test case "+TCcount);
	for (int i=0;i<TCcount;i++){
	
	
	
		String expressionInput=scan.nextLine();
	char[] str = new char[10];
	
	str=expressionInput.toCharArray();
	
	for (int j = 0; j < str.length; j++) {
		boolean flag=false;
		
		
		
		

	for (char string : arrchar) {
		if(str[j]==string)
			
			
		{
			flag=true;
			break;
		}
		
		
		
		
	}
	 if( flag==false){
						System.out.println("not present  "+str[j]);

		   throw new  MathErrorException("Maths error");
				  
				  
				  }
			   }
	
	
	// check complete
	if(str.length==7){
		System.out.println(str);
		
	}
	
	
	
	
		   
		
	}
	
	
	
	
	
/*	
	for (int j=0;j<=TotProd;j++){
	try{
	sum=sum+Double.parseDouble(str[j]);
	}
	catch(Exception e){
	}

	}
	//perc=sum/M;
	System.out.println(format.format(sum/TotProd));
	sum=0;
	//perc=0;
	}*/
}
}


