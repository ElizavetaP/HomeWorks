package lesson160405;

import java.util.Arrays;

public class StatementsExamples {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: IntervalExample <number>");
			System.exit(0);
		}

		int x = Integer.parseInt(args[0]);

		boolean r = (x >= 10) & (x <= 20);

		if (r == true) {
			System.out.println("Popal");

		} 

		if (r == false) {
			System.out.println("Mimo");
		}

	}

}
