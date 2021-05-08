package ThreadPackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

class MaxNumberCalculator extends RecursiveTask {

	public static final int THRESHOLD = 5;

	private int[] numbers;
	private int start;
	private int end;

	public MaxNumberCalculator(int[] numbers) {
		this(numbers, 0, numbers.length);
	}

	public MaxNumberCalculator(int[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer compute() {
		int length = end - start;
		int max = 0;
		if (length < THRESHOLD) {
			for (int x = start; x < end; x++) {				
				if (numbers[x] > max) {
					max = numbers[x];
				}
			}
			return max;
		} else {
			int split = length / 2;
			MaxNumberCalculator left = new MaxNumberCalculator(numbers, start, start + split);
			left.fork();
			MaxNumberCalculator right = new MaxNumberCalculator(numbers, start + split, end);
			
			
//			right.fork();
//			return Math.max((Integer)right.join(), (Integer)left.join());

			return Math.max(right.compute(), (Integer)left.join());
		}
	}
}

public class RecursiveTaskExample {

	public static void main(String[] args) {
		final int[] numbers = new int[10000];
		int maxNum = 0;

		// Start sequential calculation
		long st = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			numbers[i] = (int) (Math.random() * 10000);
			if (numbers[i] > maxNum) {
				maxNum = numbers[i];
			}
		}

		System.out.println("Calculated maximum number (sequential execution): " + maxNum + " -- Total time: "
				+ (System.currentTimeMillis() - st));
		
		
		System.out.println(Arrays.toString(numbers));

		long pt = System.currentTimeMillis();

		ForkJoinPool pool = new ForkJoinPool(4);
		MaxNumberCalculator fbn = new MaxNumberCalculator(numbers);
		System.out.println("Calculated maximum number (parallel execution): " + pool.invoke(fbn) + " -- Total time: "
				+ (System.currentTimeMillis() - pt));

	}

}