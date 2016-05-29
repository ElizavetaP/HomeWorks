package homework160526;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		int row = 6;
		int col = 7;
		String[][] matrix = new String [row][col];
		
		for (int i = 0; i < matrix.length; i++) {
			Arrays.fill(matrix[i],"0");
		}
				
		for (int i = 0; i < 3; i++) {
			matrix[i][i]="1";
			matrix[i][col - 1 - i] = "1";
		}
		
		for (int i = 0; i < 2; i++) {
			matrix[row - 1 - i][i]="1";
			matrix[row - 1 - i][col - 1 - i] = "1";
		}
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col/2]="Λ";
		}
		
		Arrays.fill(matrix[row/2],"M");
		
		matrix[row/2][col/2] = "O";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
