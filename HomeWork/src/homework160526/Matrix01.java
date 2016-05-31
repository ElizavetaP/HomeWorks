package homework160526;

import java.util.Arrays;

public class Matrix01 {

	public static void main(String[] args) {
		
		createMatrix(8);
	}
	static int[][] createMatrix(int len){
		int[][] matrix = new int[len][len];
		
		for (int i = 0; i < len; i++) {
			matrix[i][i] = 1;
			matrix[i][len - 1 - i] = 1;
		}
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <len; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		return matrix;
	}

}
