package Questions;

public class PowerofThree {
	public static void main(String[] args) {

		int x = 27;
		System.out.println(find(x));
		System.out.println(find2(x));

	}

	static boolean find(int x) {

		while (x >= 1) {

			if (x % 3 == 0) {
				x = x / 3;
			} else if (x == 1) {
				return true;
			} else
				return false;

		}
		return false;

	}

	static boolean find2(int y) {

//		y= 3^x
//				
//		log(y)= x (log(3))
//		
//		log(y)/log(3)= x
//		
//		(log(y)/log(3))%1==0;

		if (java.lang.Math.log10(y) / Math.log10(3) % 1 == 0)
			return true;
		else
			return false;

	}

}
