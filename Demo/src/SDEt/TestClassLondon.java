package SDEt;



/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility  classes
import java.util.*;
 
class TestClassLondon {
	static int[] is;
	static int[] a,left,right;
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
		is = new int[1000005];
		int hi = 1000000;
		int n,m,i;
		for(n=2;n<=hi;n++)
			
			// making all non prime numbers one
		if(is[n]==0)
		{
			for(m=2*n;m<=hi;m+=n)
			is[m] = 1;
		}
		is[1] = 1;
       n = Integer.parseInt(line);
       a = new int[n+1];
       left = new int[n+2];
       right = new int[n+2];
       StringBuffer sb = new StringBuffer();
       String[] my = br.readLine().split(" ");
       for(i=1;i<=n;i++)
       a[i] = Integer.parseInt(my[i-1]);
      // System.out.println(Arrays.toString(a));
       int found = 0;
       for(i=1;i<=n;i++)
       if(is[a[i]]==0){
       	found = 1; break;
       }
       if(found==0)
       {
       	for(i=1;i<=n;i++)
       	sb.append("-1 ");
       }
       else {
       //	System.out.println("do something");
       
       int ans = -1000000007;
       for(i=1;i<=n;i++)
       {
       	if(is[a[i]]==0)
       		ans = i;
       	left[i] = ans;
       }
       ans = 1000000007;
       for(i=n;i>=1;i--)
       {
       	if(is[a[i]]==0)ans = i;
       	right[i] = ans;
       }
       for(i=1;i<=n;i++)
       {
       	if(i-left[i]<=right[i]-i)sb.append(left[i] + " ");
       	else sb.append(right[i] + " ");
       }
       }
       System.out.println(sb);
    }
}

