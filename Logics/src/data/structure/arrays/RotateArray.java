package data.structure.arrays;

import data.structure.program.GCD;

public class RotateArray {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] objArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		 rotate(objArray, 5);
		Object[] objArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(objArray1, 3);
	}

	/**
	 * Complexity : n*number_of_rotation : More complex
	 * 
	 * @param arr
	 * @param number_of_rotation
	 * @param comment
	 *            - rotate 1 by 1 to left for each rotation
	 * @return
	 */
	private static Object[] rotate(Object[] arr, int number_of_rotation, String comment) {
		int size = arr.length;
		Object temp = 0;
		int count = 0;
		while (count < number_of_rotation) {
			count++;
			temp = arr[0];
			for (int i = 0; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size - 1] = temp;
		}
		return arr;
	}

	/**
	 * Complexity : i+(n-i)+n = 2n : less Complex
	 * 
	 * @param arr
	 * @param number_of_rotation
	 * @return
	 */
	private static Object[] rotate(Object[] arr, int number_of_rotation) {
		System.out.println("Initial: " + ArrayUtil.print(arr));
		Object[] tempArr = reverse(arr, 0, number_of_rotation - 1);
		System.out.println("1 :  " + ArrayUtil.print(tempArr));
		tempArr = reverse(arr, number_of_rotation, arr.length - 1);
		System.out.println("2 :  " + ArrayUtil.print(tempArr));
		tempArr = reverse(arr, 0, arr.length - 1);
		System.out.println("Rotated: " + ArrayUtil.print(arr));
		return arr;
	}

	/**
	 * Reverse the given array 'from' index to 'to' index
	 * 
	 * @param arr
	 * @param from
	 * @param to
	 * @return
	 */
	private static Object[] reverse(Object[] arr, int from, int to) {
		while (from < to) {
			Object temp = arr[from];
			arr[from] = arr[to];
			arr[to] = temp;
			from++;
			to--;
		}
		return arr;
	}

	/**
	 * Rotate the Array.
	 * 
	 * @param arr
	 * @param rotation
	 * @return
	 */
	public static Object[] reverse(Object[] arr, int rotation) {
		reverseArray(arr, arr.length, rotation);
		return arr;
	}

	/**
	 * Rotate the array with the help of GCD and creating sets. It will work as
	 * follows : find the GCD of length of array and rotation. create the sets by
	 * dividing length by GCD and swap the elements with same index between sets.
	 * 
	 * @param arr
	 * @param length
	 * @param rotation
	 * @return
	 */
	private static Object[] reverseArray(Object[] arr, int length, int rotation) {
		int gcd = GCD.findGCD(rotation, length);
		int set = length / gcd;
		rotate(arr, gcd, set);
		return arr;
	}

	/**
	 * Best approach with O(n) complexity.
	 * 
	 * @param arr
	 * @param gcd
	 * @param set
	 */
	private static void rotate(Object[] arr, int gcd, int set) {
		System.out.println();
		System.out.println(ArrayUtil.print(arr));
		// rotate outer loop for index of each set.
		for (int g = 0; g < gcd; g++) {
			Object to_be_moved = arr[g];
			int index = 0;
			// rotate over sets.
			for (int s = set; s >= 1; s--) {
				index = gcd * (s - 1);
				index = index + g;
				Object temp = arr[index];
				arr[index] = to_be_moved;
				to_be_moved = temp;
			}
			System.out.println(ArrayUtil.print(arr));
		}

	} 
}
