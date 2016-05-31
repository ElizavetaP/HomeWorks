package homework160526;

public class Series {
	public static void main(String[] args) {
		number(0.000005);
	}

	static int number(double epsilon) {
		double a = 1;
		int n = 1;
		for (; a >= epsilon; n++) {
			a = 1.0 / ((n + 1) * (n + 1));

			/*double a is out of range */
			if (a < 0) {
				System.out.println(-1);
				return -1;
			}
			
			System.out.println(a);

		}
		System.out.println(n - 1);
		return n - 1;
	}

}
