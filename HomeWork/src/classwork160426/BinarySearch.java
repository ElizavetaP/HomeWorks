package classwork160426;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 10, 20, -2, 3, 0, 100, -500 };

		int[] b = { 500, 2, 0, 3, 10, 20, 0 };

		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		int result1 = Arrays.binarySearch(b, 1);
		System.out.println(result1);

		int result = binarySearch(a, 0);

		System.out.println(result);

	}

	static int binarySearch(int[] x, int key) {

		int left = 0;
		int right = x.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (key == x[mid]) {
				return mid;
			}
			if (key > x[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

}
