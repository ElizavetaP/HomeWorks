package lesson160407;

public class WhileEx {

	public static void main(String[] args) {

		int i = 0;

		while (i < 10) {
			System.out.println(++i);
		}

		i = 10;

		do {
			System.out.println(++i);

		} while (i < 10);

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}

	}

}
