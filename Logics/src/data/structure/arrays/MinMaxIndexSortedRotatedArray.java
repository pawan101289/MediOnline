package data.structure.arrays;

/**
 * find the indexes of  min and max number in sorted and rotated array.
 * @author Pawan
 *
 */
public class MinMaxIndexSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,10,1,2,3,4};
		int[] indexes = getMinMaxIndex(arr);
		System.out.println(indexes[0] + " : "+arr[indexes[0]]);
		System.out.println(indexes[1] + " : "+arr[indexes[1]]);
	}

	/**
	 * @param arr
	 * @return
	 */
	public static int[] getMinMaxIndex(int[] arr) {
		int[] indexes = getMinMaxIndex(arr, 0, arr.length-1);
		return indexes;
	}

	/**
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int[] getMinMaxIndex(int[] arr, int low, int high) {
		int[] index =new int[2];
		if(low>high){
			index[0] = 0;
			index[1]= arr.length-1;
			return index;
		}
		int mid = (low+high)/2;
		if(arr[mid]>arr[mid+1]){
			index[0] = mid;
			index[1]= mid+1;
			return index;
		}
		
		if(arr[low]<arr[mid]){
			return getMinMaxIndex(arr, mid, high);
		}
		return getMinMaxIndex(arr, low, mid);
	}

}
