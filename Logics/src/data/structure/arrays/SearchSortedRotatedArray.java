package data.structure.arrays;

/**
 * Find the index in array.
 * Array is sorted and rotated any number of times.
 * @author Pawan
 *
 */
public class SearchSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,1,2,3};
		search(arr, 9);
	}

	private static void search(int[] arr, int number) {
		int index = findElement(arr, 0, arr.length-1, number);
		System.out.println("index: "+index);
	}

	private static int findElement(int[] arr, int low, int high, int number) {
		if(low>high){
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid]==number){
			return mid;
		}
		if(arr[low]<=arr[mid]){ // it means first half is sorted 
			if(arr[low]<=number && number<arr[mid]){ // if first half is sorted and number lies in this range , so it must only be in first half.
				return findElement(arr, low, mid-1, number);
			}
			return findElement(arr, mid+1, high, number);// number doesn't lies in first half , so it will lie in second half.
		}
		if(arr[mid]<number && number<=arr[high]){ //it means above if condition fails , so second half is sorted.
			return findElement(arr, mid+1, high, number); // number lies in range of second sorted part
		}
		return findElement(arr, low, mid-1, number);// number lies in first unsorted part.
		}
		
	}
