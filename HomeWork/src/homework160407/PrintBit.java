package homework160407;

public class PrintBit {

	public static void main(String[] args) {

		if (args == null) {
			System.exit(1);
		}

		if (args.length == 0) {
			System.out.println("Usage:  PrintBit <number>");
			System.exit(0);
		}

		int x = Integer.parseInt(args[0]);

		System.out.println(Integer.toBinaryString(x));

		while (x > 0) {

			System.out.println(x % 2 == 0 ? 0 : 1);

			x = x >> 1;

		}

	}

}
