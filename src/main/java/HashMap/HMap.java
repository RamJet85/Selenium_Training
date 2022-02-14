package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		
		java.util.HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Ramas");
		hm.put(2, "Krishna");
		hm.put(3, "Height");
		hm.put(4, "Weight");
		hm.put(1, "Ram");
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> Hash : hm.entrySet()){
			
			System.out.println(Hash.getKey() + " "+ Hash.getValue());
			
		}

	}

}
