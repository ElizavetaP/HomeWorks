package lesson160411;

public class ContinueEx {

	public static void main(String[] args) {

		int x = 1000000;

		for (;;) {
			if (x % 5 == 0) {
				System.out.println(x);
				x -= 3;
				continue;
			}
			x--;
			if (x < 0) {
				break;
			}

		}
		
		int[][] matrix = { { 1, 0, 3, 0, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 0, 14, 15 }, };
		
		System.out.println("_________");
		
		OUTER:
		for(int row=0;row<matrix.length;row++){
			for(int column=0;column<matrix[row].length;column++){
				if (matrix[row][column]==0){
					System.out.println(row);
					continue OUTER;
				}
				
			}
		}

	}

}
