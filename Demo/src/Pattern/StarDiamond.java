package Pattern;

public class StarDiamond {
	static int count=1;
public static void main(String[] args) {
	
	System.out.println("___________________");
	for (int i = 1; i < 5; i++) {
		for (int j = 5-i; j > 1; j--) {
			System.out.print(" ");
		}
		for (int k = (i*2)-1; k >0; k--) {
			System.out.print(count);
			//System.out.print("*");
			count++;
		}
		System.out.println();
	}
	for (int i = 1; i < 4; i++) {
		for (int j = i; j > 0; j--) {
			System.out.print(" ");			
		}
		for (int k = ((4-i)*2)-1; k>0; k--) {
			System.out.print(count);
			//System.out.print("*");
			count++;
		}
		System.out.println();
	}
	}
}

