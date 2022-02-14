package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class SampleHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
		
		Hmap.put(1, "Ram");
		Hmap.put(2, "Test");
		Hmap.put(3, "Sush");
		Hmap.put(2, "Anusha");
		
		System.out.println(Hmap.get(1));
		System.out.println(Hmap.get(89)); // if you don't have key u should get null
		
		//To iterate hashmap use iterator concept
		
		Iterator<Integer> it = Hmap.keySet().iterator(); // directly we don't have method is use keyset then get iterator
		
		while(it.hasNext()){
			Integer key = it.next();
			String value = Hmap.get(key);
			System.out.println("key "+key +" values "+value);
			
		}
		//To iterate hashmap use entry set
		
		for(Map.Entry<Integer, String> e : Hmap.entrySet()){
			
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		//Convert hashmap to arrayList
		
		List<String> list = new ArrayList<String>();
		for (String st : list) {
			System.out.println("The list is: "+st);
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
