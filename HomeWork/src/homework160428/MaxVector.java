package homework160428;

import java.util.Arrays;

public class MaxVector {

	public static void main(String[] args) {
		
		int[][] a = {
				{0, 90, 8},
				{-7, -4,-100},
				{8,1,2,8,9},
				{9,9,7,50},
		};
		
		System.out.println(Arrays.toString(maxVector(a)));
		
	}
	
	static int[] maxVector(int[][] a){
		int[] vector = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int num : a[i]) {
				max = Math.max(max, num);
			}
			vector[i] = max;
		}
		return vector;
	}

}
