package SDEt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestClass {
	static double sum=0;
	public static void main(String args[] ) throws Exception {

		//
		DecimalFormat format = new DecimalFormat("#0.00000000");
		
		
		
		Scanner scan= new Scanner(System.in);
		
		String TCcountStr=scan.nextLine();
		
		int TCcount = Integer.parseInt(TCcountStr);
		
		System.out.println("total test case "+TCcount);
		for (int i=0;i<TCcount;i++){
		String TotProdStr =scan.nextLine();
		int TotProd = Integer.parseInt(TotProdStr);
		
		String prodByPerStr =scan.nextLine();
		
		
		
		String str[] = new String[TotProd];
		str=prodByPerStr.split(" ");
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
		}
		System.out.println("all test ends");
		}
}
