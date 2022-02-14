package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CovertHmapToArrayList {

	public static void main(String[] args) {
		
		
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "RealPage");
	map.put(2, "TestEngineer");
	map.put(3, "Trianz");
	
	Iterator<Integer> it = map.keySet().iterator();
	
	while(it.hasNext()){
		Integer key = it.next();
		String value = map.get(key);
		System.out.println("key "+key +" values "+value);
	}
	
	for (Map.Entry<Integer, String> st: map.entrySet()) {
		
		System.out.println(st.getKey()+" "+st.getValue());
		
	}
	
	//Convert hash map to arrayList
	
	List<Integer>list = new ArrayList<Integer>(map.keySet());
	System.out.println("Keys size: "+list.size());
	for (Integer keys : list) {
		System.out.println(keys);
	}
	
	
	List<String>list1 = new ArrayList<String>(map.values());
	System.out.println("values size: "+list1.size());
	for (String values : list1) {
		System.out.println(values);
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
