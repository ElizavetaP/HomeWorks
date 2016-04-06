package homework160405;

public class StatementsTask {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: TwoFiveOneExample <number>");
			System.exit(0);
		}

		int x = Integer.parseInt(args[0]);

		if (x == 2) {

			System.out.println("Мало");
		}

		if (x == 5) {
			System.out.println("Много");
		}

		if (x == 1) {
			System.out.println("В самый раз");
		}

		if (x != 1 & x != 2 & x != 5) {
			System.out.println("Неверное значение");
		}

	}

}
