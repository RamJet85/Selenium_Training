package Constructor;

public class Constructor {
	
//	Constructor is used to perform initialization of an object
//	Initialization means while creating the object we should perform initialization of the object
//	Whenever the object got created all the(props) instance variables photo copy will be given to object This means current object
   
	int age;
	String name;
	double salary;
	
	public Constructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Constructor(String name) {
		this.name = name;
	}
	public Constructor(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public static void calling() {
		System.out.println("calling");
	}
	public static void main(String[] args) {
		
		calling();
		
		Constructor ct = new Constructor("Ram");
		System.out.println(ct.name);
		Constructor ct1 = new Constructor(26, "Charan");
		
		Constructor ct2 = new Constructor(23, "Ravi");
		System.out.println(ct2.age+ " "+ct2.name);
		
		
		System.out.println(ct1.age+ " "+ct1.name);
		
		Constructor ct3 = new Constructor(23, "Anusha", 12.65);
		System.out.println(ct3.name+" "+ct3.age+" "+ct3.salary);
		
		}
	
	
}
