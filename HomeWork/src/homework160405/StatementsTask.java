package homework160405;

public class StatementsTask {

	public static void main(String[] args) {

		if (args.length == 0) {

			System.out.println("Usage: StatementsTask <number>");
			System.exit(0);
		}

		int num = Integer.parseInt(args[0]);

		if (num == 5) {

			System.out.println("Мало");

		} else if (num == 2) {

			System.out.println("Много");

		} else if (num == 1) {

			System.out.println("В самый раз");

		} else {

			System.out.println("Неверное значение");
		}

	}

}
