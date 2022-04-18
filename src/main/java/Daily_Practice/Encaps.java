package Daily_Practice;

public class Encaps {
	
	
	public String name;
	private int id;
	private double salary;
	
	
	public void getName(String name) {
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Encaps(String name,int id, double salary) {
		
		this.name = name;
		this.id =id;
		this.salary = salary;
		
	}

	
	
	
	

}
