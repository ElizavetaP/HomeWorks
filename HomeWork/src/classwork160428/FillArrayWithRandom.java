package classwork160428;

import java.util.Arrays;

public class FillArrayWithRandom {

	public static void main(String[] args) {

		int[] x = randomArray(10);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.binarySearch(x, 1));

	}

	static int[] randomArray(int n) {

		int[] result = new int[n];

		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * n);
		}
		return result;
	}

}
