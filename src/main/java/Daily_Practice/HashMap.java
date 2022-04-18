package Daily_Practice;

public class HashMap {
	
	static java.util.HashMap<String, String> hmap;

	public static void main(String[] args) {
		
		
		hmap = new java.util.HashMap<String, String>();
		
		hmap.put("user", "Ram : Charan");
		hmap.put("Cadmin", "RR : NTR");
		hmap.put("Gadmin", "CRR : SSR");
		hmap.put("user", "Charan : Ram");
		
		
		HashMap.multiLogin("user");
		
		
	
		
		
	}
	
	public static void multiLogin(String details) {
		
		
		String userName = hmap.get(details).split(":")[0].trim();	
		String passWord = hmap.get(details).split(":")[1].trim();
		
		System.out.println("Username is: "+userName+" and"+ " Password is: "+passWord);
		
		
	}

}
