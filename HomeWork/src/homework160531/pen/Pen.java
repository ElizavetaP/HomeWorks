package homework160531.pen;

public class Pen {
	
	private String color;
	private String design; //ball, feather, capillary.
	private boolean isWriting = true;
	private int numberOfrecords = 0;
	private String records = "";
	
	public Pen(String color, String design){
		this.color=color;
		this.design=design;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getDesign(){
		return design;
	}
	
	public void write(String text){
		if(isWriting){
			records += text +"\n";
			System.out.println(text);
			numberOfrecords++;
			if (numberOfrecords >= 5){
				isWriting = false;
			}
		}else{
			System.out.println("Pen isn't writing");
		}
	}
	
	public void fill(){
		isWriting = true;
		System.out.println("Pen is writing");
		numberOfrecords = 0;
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
		return records;
		
	}

}
