package classwork160411;

public class NestedLoops {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },

		};
		
		int summ = 0;
		
		for (int r = 0; r < matrix.length; r++) {

			for (int c = 0; c < matrix[r].length; c++) {

				System.out.print(matrix[r][c] + " ");
				summ += matrix[r][c];
			}
			System.out.println();
		}
		System.out.println(summ);
		
		

		matrix = new int[][] { { 0 }, { 1, 2 }, { 3, 4, 5 }, };

		int sum = 0;

		for (int[] vector : matrix) {
			for (int x : vector) {
				sum += x;

			}

		}
		System.out.println();
		System.out.println(sum);

	}

}
