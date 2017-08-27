package SDEt;

import java.util.Scanner;

public class LenearSearchProblem {
	public static void main(String args[] ) throws Exception {
		
		int[] values;
		int lastoccurence=-1;
		Scanner scan= new Scanner(System.in);
		
		String NMValue=scan.nextLine();
	String[] arr=	NMValue.split(" ");
		int TCcount = Integer.parseInt(arr[0]);
		int ValueToSearch = Integer.parseInt(arr[1]);
		
		
		values= new int[TCcount];
			String AllStr =scan.nextLine();
			String[] arrValues=	AllStr.split(" ");
			if(arrValues.length!=TCcount)
				System.out.println("invalid length");
			
			
			for (int i = 0; i < arrValues.length; i++) {
				values[i]=Integer.parseInt(arrValues[i]);
			}
			
			for (int i = 0; i < values.length; i++) {
				if(values[i]==ValueToSearch)
					lastoccurence=i+1;
			}
			
			if(arrValues.length!=TCcount)
				System.out.println("invalid length");
			else
			System.out.println(lastoccurence);

	}
}
