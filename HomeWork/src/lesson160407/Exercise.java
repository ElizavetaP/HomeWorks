package lesson160407;

public class Exercise {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		int x;

		x = (y < 10) ? (y++) : (z++);
		
		System.out.println(x + "," + y + "," + z);
		
		
		y = 1;
		z = 1;

		x = (y >= 10) ? (z++) : (y++);
		
		System.out.println(x + "," + y + "," + z);
		
	}

}
