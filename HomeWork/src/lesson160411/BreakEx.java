package lesson160411;

public class BreakEx {

	public static void main(String[] args) {

		int x = 1;

		while (true) {
			x = x * 2;
			if (x > 1000000) {
				break;
			}
		}
		System.out.println(x);

		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, };

		int sum = 0;
		OUTER: 
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (sum > 20) {
					System.out.println("sum=" + sum + " i=" + i + " j=" + j);
					break OUTER;

				}
				
			}

		}

	}

}
