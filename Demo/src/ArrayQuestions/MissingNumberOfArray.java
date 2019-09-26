package ArrayQuestions;

public class MissingNumberOfArray {
	public static void main(String[] args) {

		   int total_num;
		   int[] numbers = new int[]{1,2,3,5};
		   total_num = 5;
		   int expected_num_sum = total_num * ((total_num + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		       System.out.print( expected_num_sum - num_sum);
			   System.out.print("\n");
		  }
}
