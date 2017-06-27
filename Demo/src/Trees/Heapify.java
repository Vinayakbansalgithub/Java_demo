package Trees;

public class Heapify {
	// 16 14 10 8 7 9 3 2 4 1

    public static int[] Arr = {1,3,6 ,14, 10 ,8,2,67,23,11,4 };
    public static int counter = 0;

    public static void main(String[] args) {
        int kk;
        for (kk = Arr.length -1; kk >= 0; kk--) {
            heapM(Arr, kk);
    }

        for (int krk = 0; krk < Arr.length; krk++) {
            System.out.println(Arr[krk]);
        }



    }

    public static void heapM(int[] Arr, int i) {

        int lowest = 0;
        int left = 2*i+1;
        int right = 2*i + 2;
        if (((left < Arr.length) && (Arr[left] < Arr[i]))) {
        	
        	 swap(i, left);
        } else {
        	lowest = i;
        }

        if (((right < Arr.length) && (Arr[right] < Arr[i]))) {
        	//lowest = right;
        	swap(i, right);        	
        }
        if (lowest != i) {
            swap(i, lowest);


            heapM(Arr, lowest);
        }
    }

    private static void swap(int i, int largest) {
        int t = Arr[i];
        Arr[i] = Arr[largest];
        Arr[largest] = t;

    }

}
