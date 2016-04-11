package classwork160411;

public class ForEachLoop {

	public static void main(String[] args) {

		int i = 0;
		while (i < args.length) {
			System.out.println(args[i++]);
		}

		for (int n = 0; n < args.length; n++) {
			System.out.println(args[n]);

		}
		
		for(String parameter: args){
			System.out.println(parameter);

		}

	}

}
