package lesson160331;

public class Account {
	
	final static int GROSS_SALARY = 55000;

	public static void main(String[] args) {
		
		double netSalary = GROSS_SALARY - GROSS_SALARY * 0.13;
		System.out.println(netSalary);

	}

}
