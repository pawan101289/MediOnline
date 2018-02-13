package data.structure.arrays; 

public class PairSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		pair(arr, 12);
	}

	private static void pair(int[] arr, int sum) {
		int[] minMaxIndex = MinMaxIndexSortedRotatedArray.getMinMaxIndex(arr);
		int[] index = findPair(arr, minMaxIndex[1], minMaxIndex[0], sum);
		if (index == null) {
			System.out.println("No pair found");
		} else {
			System.out.println("index: " + index[0] + ", " + index[1]);
		}
	}

	private static int[] findPair(int[] arr, int low, int high, int sum) {
		if (low == arr.length) {
			low = 0;
		}
		if (high == -1) {
			high = arr.length - 1;
		}
		if (low == high) {
			return null;
		}
		int[] pairs = new int[2];
		if (arr[high] + arr[low] == sum) {
			pairs[0] = arr[high];
			pairs[1] = arr[low];
			return pairs;
		}
		if (arr[high] + arr[low] > sum) {
			return findPair(arr, low, high - 1, sum);
		}
		return findPair(arr, low + 1, high, sum);
	}

}
