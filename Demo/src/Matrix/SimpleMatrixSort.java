package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SimpleMatrixSort {
	static int[] sortedRow = new int[3];
	static int[] sortedColumn = new int[3];

	static void sortrow(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			int q = 0;
			for (int z = 0; z < 3; z++) {
				sortedRow[q++] = arr[i][z];
			}
			
			
			Arrays.parallelSort(sortedRow);

			for (int zx = 0; zx < 3; zx++) {
				arr[i][zx] = sortedRow[zx];
			}
			sortedRow = new int[3];

		}

	}
	

 static void sortColumn(int[][] arr) {
	// TODO Auto-generated method stub
	 for (int i = 0; i < 3; i++) {
			int q = 0;
			for (int z = 0; z < 3; z++) {
				sortedColumn[q++] = arr[z][i];
			}

			int temp;
			for (int ii = 0; ii < arr.length; ii++) {
				for (int j = 1; j < arr.length; j++) {
					if (sortedColumn[j - 1] > sortedColumn[j]) {
						temp = sortedColumn[j];
						sortedColumn[j] = sortedColumn[j - 1];
						sortedColumn[j - 1] = temp;

					}
				}
			}
		//	System.out.println(Arrays.toString(sortedColumn));

			for (int zx = 0; zx < 3; zx++) {
				arr[zx][i] = sortedColumn[zx];
			}
			sortedColumn = new int[3];

		}

}

	
	
 static void mergeKSortedArrays(int[][] arr, int totalSize) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(totalSize);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				int number = arr[i][j];
				q.offer(number);
			}
		}
		
		Iterator<Integer> itr = q.iterator();
		System.out.println("Priority queues values are ");
		
		while(itr.hasNext())
		{
			System.out.println("Value: " + itr.next());
		}
		
		while (!q.isEmpty()) {
		    Integer i = q.poll();
		    System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int[] n = { 10, 1, 15, 25, 95, 15, 68, 11, 112 };
		int z = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = n[z++];
			}
		}
		System.out.println("-----------------------Unsorted row column--------------------------");

		
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(arr[k][l] + "  ");
			}
			System.out.println();
		}
		
		

		sortrow(arr);

		sortColumn(arr);
		
		int totalSize = arr[0].length * arr.length;
		mergeKSortedArrays(arr,totalSize);
		
		System.out.println("-----------------------sorted row column--------------------------");

		
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(arr[k][l] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("-----------------------sorted order--------------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[j][i] + "  ");

			}
		}
		
	}

}
