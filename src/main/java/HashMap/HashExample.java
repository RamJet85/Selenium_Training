package HashMap;

import java.util.HashMap;

public class HashExample {
	
	static HashMap<String, String> hmap;

	public static void main(String[] args) {
		
		//role based 
		hmap = new HashMap<String, String>();
		hmap.put("FraudShare", "user@gmail.com : ram@123");
		hmap.put("Companydmin","cadmin@gmail.com : cadmin@123");
		hmap.put("LLgAdmin", "LLgadmin@gmail.com : LLGAdmin@123");
		
		doLogin("FraudShare");
		
		

	}
	
	public static void doLogin(String role){
		
		String userName = hmap.get(role).split(" : ")[0].trim();
		String passWord = hmap.get(role).split(":")[1].trim();
		
		System.out.println("Username: "+userName+ " and "+passWord);
		
	}

}
