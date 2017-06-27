package LeetCode;

public class StringtoIntegerAtoi {
	
	static int atoi(String str){
		
		int statrtindex=0;
		boolean isNagative=false;
		int result=0;
		int digit=0;
		if(str.charAt(0)=='-' || str.charAt(0)=='+')
			statrtindex++;
		
		
		if(str.charAt(0)=='-')
		isNagative=true;
		
		
		for (int i = statrtindex; i < str.length(); i++) {
			
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				
			continue;	
			}else{
			digit=(int)(str.charAt(i)-'0');
			result=result*10+digit;
			}
		}
		if(isNagative)
			result=-result;
		return result;
	}
	
public static void main(String[] args) {
	String str="@dgf-123k";
	int val=atoi(str);
	System.out.println(val);
}
}
