package SelFrDemo;

public class MergeSortDemo {
	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {

		int[] inputArr = { 88, 33, 54, 745, 22, 2 };
		MergeSortDemo mms = new MergeSortDemo();
		System.out.println("ab");
		mms.sort(inputArr);
		System.out.println("a");
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
		System.out.println("pp");
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			System.out.println("lower" + lowerIndex);
			System.out.println("higher" + higherIndex);
			System.out.println("middle" + middle);
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			System.out.println("wddw");
			doMergeSort(middle + 1, higherIndex);

			System.out.println("lower" + lowerIndex);
			System.out.println("higher" + higherIndex);
			System.out.println("middle" + middle);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}

	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
}
