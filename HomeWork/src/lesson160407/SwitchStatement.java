package lesson160407;

public class SwitchStatement {

	public static void main(String[] args) {

		if (args == null) {

			return;
		}

		if (args.length == 0) {
			System.out.println("Usage: <>");
			System.exit(0);
		}

		int num = Integer.parseInt(args[0]);

		switch (num) {
		case 0:
			System.out.println("null");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("one");
			break;
		case 4:
			System.out.println("one");
			break;
		default:
			System.out.println("enter number!");
		

		}
		
		

	}

}
