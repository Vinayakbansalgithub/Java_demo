package Recurssion;

public class SumOfSubset {
	 public static void printSubSets(int N, int curr, String res){
	        if(curr==0){
	            System.out.println(res);
	            return;
	        }

	        for (int i = 1; i <=N ; i++) {
	            if(i<=curr){
	                printSubSets(N, curr-i, res+i);
	            }
	        }
	    }

	    public static void main(String[] args) {
		    int N = 5;
	       printSubSets(N,N,"");
	    }
	

}
