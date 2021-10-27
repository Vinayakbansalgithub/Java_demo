package dp;

public class PaintFence {
	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		int res = find(n, k);
		System.out.println(res);
	}

	static int find(int n, int k) {

		int same= k;
		int diff= k*(k-1);
		int total=same+diff;
		
		
		for(int i=3;i<=n;i++) {
			
			same=diff*1;
			diff=total*(k-1);
			total=same+diff;
		
			
		}
		
		return total;
	}
}
