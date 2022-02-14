package HashMap;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		
		String obj = Test.hashMap().get(1);
		System.out.println(obj);
		
		System.out.println(obj.split(":")[0]);
		System.out.println(obj.split(":")[1].trim());
		//System.out.println(obj.split(":")[3].trim());
		
		
	}
	
	public static HashMap<Integer,String> hashMap(){
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram : 9492567100");
		map.put(2, "Hari : 457645868");
		
		return map;
		
		
		
	}

}
