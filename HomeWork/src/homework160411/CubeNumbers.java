package homework160411;

public class CubeNumbers {

	public static void main(String[] args) {

		int[][][] cube = { 
				{ { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13 } },
				{ { 14, 0, 16 }, { 16, 17, 18 }, { 20, 0 }, { 22, 23 } }, 
				{ { 24, 25, 26 }, { 27, 28, 29 } },
				{ { 30, 0 }, { 32, 33 }, { 34, 35 } }

		};

		OUTER: 
		for (int i = 0; i < cube.length; i++) {
			for (int[] vector : cube[i]) {
				for (int x : vector) {
					if (x == 0) {
						System.out.println(i);
						continue OUTER;
					}
				}
			}

		}

	}

}
