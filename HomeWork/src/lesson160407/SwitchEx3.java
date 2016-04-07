package lesson160407;

public class SwitchEx3 {

	public static void main(String[] args) {
		
		if (args == null){
			System.exit(1);
		}
	
		if (args.length == 0) {
			System.out.println("Usage: <>");
			System.exit(0);
		}
		
		switch (args[0]) {
		case "Hello":
			System.out.println("hi there");
			break;
		case "Priver":
			System.out.println("Zdorovo");
			break;
		default:
			System.out.println("Hi");

		}
		
		int x = 5;

		switch (x % 2) {
		case 0:
			System.out.println("even");
		case 1:
			System.out.println("odd");

		}
		
		

	}

}
