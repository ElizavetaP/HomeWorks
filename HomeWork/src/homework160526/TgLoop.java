package homework160526;

public class TgLoop {

	public static void main(String[] args) {
		double first = 0;
		double end = 3 * Math.PI / 2;
		double step = Math.PI / 8;
		functionTg(first, end, step);

	}

	static void functionTg(double first, double end, double step) {
		for (double F, corner = first; corner <= end; corner += step) {
			System.out.printf("%.5f   ", corner);
			F = Math.tan(2*corner)-3;
			System.out.printf("%.3e\n", F);
		}
	}

}
