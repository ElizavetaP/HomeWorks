package classwork160428;

import java.util.Arrays;

public class MatrixProduct {

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, };

		int[][] B = { { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 1 }, };

		System.out.println(A[0].length);
		
		int[][] r = product(A,B);
		for (int[] row : r){
			System.out.println(Arrays.toString(row));
		}

	}

	static int[][] product(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			return null;
		}
		
		int [][] p = new int [a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				
			
			int[] v1 = a[i];
			int[] v2 = new int[b.length];
			for (int k = 0; k < v2.length; k++) {
				v2[k]=b[k][j];
			}
			int scalar = ScalarProduct.scalar(v1, v2);
			p[i][j] = scalar;
			}
		}

		return p;
		
		//matrix ? vector : max

	}

}
