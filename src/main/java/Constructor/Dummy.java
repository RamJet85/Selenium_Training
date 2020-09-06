package Constructor;

public class Dummy {

	public static void main(String[] args) {
		
		
		Constructor ct = new Constructor("Ram");
		System.out.println(ct.name);
		
		Constructor ct1 = new Constructor(26, "Charan");
		
		Constructor ct2 = new Constructor(23, "Ravi");
		System.out.println(ct2.age+ " "+ct2.name);
		
		System.out.println(ct1.age+ " "+ct1.name);
		
		Constructor ct3 = new Constructor(23, "Anusha", 12.65);
		System.out.println(ct3.name+ " "+ct3.age+" "+ct3.salary);
		
		//Constructor c1 = new Constructor();
	}

}
