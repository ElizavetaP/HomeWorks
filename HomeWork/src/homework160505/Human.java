package homework160505;

public class Human {

	private String name;
	private String profession;
	private boolean isTired = false;
	
	public Human(String name, String profession){
		this.name=name;
		this.profession=profession;
	}
	
	public void work(String task){
		if (isTired){
			System.out.println(profession +" " + name + " идет пить кофе");
		}else{
			System.out.println(profession +" " + name + " делает " + task + ", пока не устанет");
			isTired = true;
		}
	}
	
	public void sleep(){
		if (isTired){
			System.out.println(profession +" " + name + " спит, пока не отдохнет");
			isTired = false;
		}else{
			System.out.println(profession +" " + name + " занимается полезными делами");
		}
		
	}

}
