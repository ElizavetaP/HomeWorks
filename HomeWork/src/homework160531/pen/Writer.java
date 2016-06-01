package homework160531.pen;

public class Writer {

	public static void main(String[] args) {
		Pen feather = new Pen("black", "feather");
		
		feather.write("feather");
		feather.write("feather");
		feather.write("feather");
		feather.write("feather");
		feather.write("feather");
		feather.write("feather");
		
		feather.fill();
		feather.write("feather");
		
		System.out.println(feather);
		
		Pen capillary = new Pen("black", "capillary");
		System.out.println(feather.equals(capillary));
		
		Pen feather2 = new Pen("black", "feather");
		System.out.println(feather.equals(feather2));



		

	}

}
