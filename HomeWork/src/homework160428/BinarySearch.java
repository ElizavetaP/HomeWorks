package homework160428;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 1, 8, 4, 3, 7, 6, 9, 50, 3 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		System.out.println(binarySearch(a, 5));

	}

	static int binarySearch(int[] a, int key) {

		int left = 0, right = a.length - 1;
		int mid = 1;

		while (right >= left) {
			mid = left + (right - left) / 2;
			if (key == a[mid]) {
				return mid;
			}
			if (key > a[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		if (key > a[mid]) {
			mid++;
		}
		return -1 - 1 * mid;

	}

}
