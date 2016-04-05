package lessom160405;

import java.util.Arrays;

public class StatementsExamples {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);

		boolean r = (x >= 10) && (x <= 20);
		boolean t = (x < 10) | (x > 20);

		if (r == true) {
			System.out.println("Popal");

		}else{
			System.out.println("Mimo");
		}
		

	}

}
