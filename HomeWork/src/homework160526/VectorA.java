package homework160526;

public class VectorA {
	public static void main(String[] args) {
		System.out.println(maxsum(0, 2, 5, 8, 9, 4));

	}

	static double maxsum(double... a) {
		int len = a.length;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < len / 2; i++) {
			max = Math.max(a[i] + a[len - 1 - i], max);
		}
		return max;
	}

}
