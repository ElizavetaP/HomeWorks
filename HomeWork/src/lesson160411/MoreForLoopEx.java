package lesson160411;

public class MoreForLoopEx {

	public static void main(String[] args) {

		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {

			System.out.print(y + " ");

		}
		System.out.println(" ");
		System.out.println(x);
		
/*		for (; x < 100;) {
			System.out.println(x);
			x++;
		}*/
		
//		while(x<100){
//			System.out.println(x);
//			x++;
//		}

	}

}
