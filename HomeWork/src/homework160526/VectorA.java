package homework160526;

public class VectorA {
	public static void main(String[] args) {
		System.out.println(maxsum(0, 2, 5, 11, 10, 9, 4));

	}

	static double maxsum(double... a) {
		int len = a.length;
		int halflen = len % 2 == 0 ? len / 2 : len / 2 + 1;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < halflen; i++) {
			max = Math.max(a[i] + a[len - 1 - i], max);
		}
		return max;
	}

}
