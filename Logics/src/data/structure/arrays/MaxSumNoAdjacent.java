package data.structure.arrays;

public class MaxSumNoAdjacent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr = {5, 5, 10, 100, 10, 5};
		int maxSum = findMaxSum(arr);
		System.out.println("max sum: "+maxSum);
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int findMaxSum(int[] arr) {
		int inc = arr[0]; //previous sum including previous element.
		int exc = 0;// previous sum excluding previous element;  
		for (int i = 1; i < arr.length; i++) {
			int incl = exc + arr[i];
			int excl = (inc>exc)?inc:exc;
			inc = incl;
			exc = excl;
			System.out.println("inc: "+inc+ " ,exc: "+exc);
		}
		return (inc>exc)?inc:exc; 
	}
	
}
