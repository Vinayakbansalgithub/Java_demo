package SlidingWindow;

import java.util.LinkedList;
import java.util.List;

public class SecondMax {
	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub
		
		
		if (size==0) {
			System.out.println("-1");
		}

		int arrstart = 0;
		int arrend = 0;

		int max = Integer.MIN_VALUE;
		int secondMax =Integer.MIN_VALUE;

		List<Integer> list = new LinkedList<Integer>();

		while (arrend < arr.length) {
			
			
		

			if (arr[arrend] > max) {
				
				secondMax=max ;	
				max=arr[arrend];
				
				list.add(arr[arrend]);
			}else if(arr[arrend] < max && arr[arrend]>secondMax) {
				secondMax=arr[arrend] ;
			}
			
			
				

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				
			 if (size==1) {
					System.out.println("-1");
				} else if(secondMax ==Integer.MIN_VALUE) {
					System.out.println("-1");
					
				}
				else {
					System.out.println(" " + secondMax);
				}
				
				break;
			}

		}


	}

	public static void main(String[] args) {
		int[] arr = { 5,5,4,2 };
		int size = arr.length;

		findSubarrays(arr, size);
	}
}
