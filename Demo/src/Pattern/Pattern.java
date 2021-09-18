package Pattern;

import java.util.*;

public class Pattern {

	static void print(int N, int row, int col) {
		if (N == 0)
			return;

		for (int i = 1; i <= row; i++)
			System.out.print("*");

		System.out.println();
		print(N - 1, row + 1, col + 1);
	}

	static void printrecurssion(int N, int row, int col) {
		if (N == 0)
			return;

		if (row < col) {
			System.out.println();
			printrecurssion(N - 1, row + 1, 1);
			return;
		}

		System.out.print("*");
		printrecurssion(N, row, col + 1);

	}


	private static void printrecurssion180(int N, int num) {
		// TODO Auto-generated method stub
		 // base case  
        if (N == 0) 
        { 
            return; 
        } 
        print_space(N - 1); 
        print_asterisk(num - N + 1); 
        System.out.println(); 
  
        // recursively calling pattern()  
        printrecurssion180(N - 1, num); 

	}

	private static void printPyramid(int N, int num) {
		// TODO Auto-generated method stub
		
		if (N == 0) 
        { 
            return; 
        } 
		
		 print_space(N-1); 
	    print_asterisk(num - N + 1); 
        System.out.println(); 
        printPyramid(N - 1, num);
		
	}
	
	
	
	
	  static void print_space(int space) 
    { 
        // base case  
        if (space == 0)  
        { 
            return; 
        } 
        
     // System.out.print("  "); 
        // for pyramid
        System.out.print(" "); 
  
        // recursively calling print_space()  
        print_space(space - 1); 
    } 
	  
	// function to print asterisks 
	static void print_asterisk(int asterisk) 
	{ 
	    // base case 
	    if (asterisk == 0) 
	        return; 
	    System.out.print("* "); 
	  
	    // recursively calling asterisk() 
	    print_asterisk(asterisk - 1); 
	} 
	  
	
	 static void numberPrint(int N, int row, int col) {
		// TODO Auto-generated method stub
		 if (N == 0) 
	        { 
	            return; 
	        } 
		 
		 if(row<col) {
			 System.out.println();
			 numberPrint(N-1,row+1,1); 
			 return;
		 }
		 
		
		 System.out.print(row);
		 numberPrint(N,row, col+1);
		 
		 
		 
	}

	 
	// function to print a row 
	 static int print_row(int ct, int num) 
	 { 
	     // base case 
	     if (num == 0) 
	         return ct; 
	             System.out.print(ct + "  "); 
	   
	     // recursively calling print_row() 
	     return print_row(ct + 1, num - 1); 
	 } 
	   
	 // function to print the pattern 
	 static void numberContinuePrint(int n, 
	                     int count, int num) 
	 { 
	     // base case 
	     if (n == 0) 
	         return; 
	     count = print_row(count, num); 
	             System.out.println(); 
	   
	     // recursively calling pattern() 
	             numberContinuePrint(n - 1, count, num + 1); 
	 } 
	public static void main(String[] args) {
		// print(5,1,1);


		
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *

		// printrecurssion(5,1,1);

//	
//        * 
//      * * 
//    * * * 
//  * * * *  
//* * * * * 

	 //printrecurssion180(5,5);
	 
	 
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * *

	// printPyramid(5,5);
	 
		
		
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5
	 //numberPrint(5,1,1);
		
//		1    
//		2    3    
//		4    5    6    
//		7    8    9    10    
//		11    12    13    14    15

		numberContinuePrint(5,1,1);


	}

	

	

		
	}


