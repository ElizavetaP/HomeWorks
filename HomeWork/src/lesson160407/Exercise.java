package lesson160407;

public class Exercise {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		int x;

		x = (y < 10) ? (y++) : (z++);
		
		System.out.println(x + "," + y + "," + z);
		
		
		int y1 = 1;
		int z1 = 1;
		int x1;

		x1 = (y1 >= 10) ? (z1++) : (y1++);
		
		System.out.println(x1 + "," + y1 + "," + z1);
		
	}

}
