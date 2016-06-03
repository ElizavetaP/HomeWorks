package homework160531.pen;

public class Pen {
	
	private String color;
	private String design; //ball, feather, capillary.
	private double price;
	
	public Pen(String color, String design, double price){
		this.color=color;
		this.design=design;
		this.price=price;
	}

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor(){
		return color;
	}
	
	public String getDesign(){
		return design;
	}

	@Override
	public int hashCode() {
		int result = color != null ? color.hashCode() : 0;
		result = 31 * result + (design != null ? design.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object pen){
		if (pen==null){
			return false;
		}
		if(pen==this){
			return true;
		}
		if (pen.getClass() != getClass()){
			return false;
		}
		Pen other = (Pen) pen;
	        if (color != other.getColor())
	            return false;
	        if (design != other.getDesign())
	            return false;
	        return true;      

	}
	
	@Override
	public String toString(){
		return color + " " + design +" pen";
		
	}

}
