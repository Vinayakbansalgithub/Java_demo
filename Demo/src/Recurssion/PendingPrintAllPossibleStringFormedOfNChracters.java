package Recurssion;

public class PendingPrintAllPossibleStringFormedOfNChracters {
	public static void main(String[] args) {
		char[] ch={'a','b','c','a','b'};
		int k=4;
		printAllPossibleCombination(ch,k,"");
	}

	private static void printAllPossibleCombination(char[] ch, int k,String prefix) {
		
	System.out.println(prefix);
		
		
		
		if(prefix.length()==k){
		//	System.out.println(prefix);
			return;
		}else{
			for(int i=0;i<ch.length;i++){
				
				//System.out.println("iteration at given level "+i);
				//System.out.println(" level "+prefix.length());

				printAllPossibleCombination(ch,k,prefix+ch[i]);
			}
		}
		
	}
	
}
