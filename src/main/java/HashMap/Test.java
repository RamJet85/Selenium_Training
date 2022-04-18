package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Ram");
		hmap.put(null, "Taui");
		hmap.put(2, "diamond");
		hmap.put(3, "slowq");
		hmap.put(null, "wara");
		
		
		//to iterate the hashmap we should user iterator or entryset
		
		for (Map.Entry<Integer, String> e : hmap.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		
	}
	
	

}
