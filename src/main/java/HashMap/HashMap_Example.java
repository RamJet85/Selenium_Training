package HashMap;

import java.util.HashMap;

public class HashMap_Example {
	
	static HashMap<String, String> map;

	public static void main(String[] args) {
		
		//Hashmap with different logins
		
		map = new HashMap<String, String>();
		
		map.put("Fraudshare", "ram@user.com : ram@123");
		map.put("CompanyAdmin", "ram@cadmin.com : cadmin@123");
		map.put("LLGAdmin", "ram@llgadmin.com : llgadmin@123");
		
		
		HashMap_Example hash = new HashMap_Example();
		
		hash.dologin("LLGAdmin");
		hash.dologin("Fraudshare");

	}
	
	public void dologin(String role) {
		
		String username = map.get(role).split(":")[0].trim(); //because username & password combined as 1 string
		//so we should split 
		String password = map.get(role).split(":")[1].trim();
		
		System.out.println("login with "+username + " and "+ password);
		
		
	}

}
