package homework160526;

public class Series {
	public static void main(String[] args) {
		double a = 1.0;
		for (int n = 1; n < Integer.MAX_VALUE; n++) {
			a = 1.0/((n+1)*(n+1));
			if (a<0){
				break;
			}
			if(a <0.000001){
				System.out.println(a);
				System.out.println(n);
				
			}
		}
	}

}
