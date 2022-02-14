package HashMap;

public class ComparisionOfHashMap {

	public static void main(String[] args) {

		
		java.util.HashMap<Integer, String> map1 = new java.util.HashMap<Integer,String>();
		map1.put(1, "Ram");
		map1.put(2, "Charan");
		
		java.util.HashMap<Integer, String> map2 = new java.util.HashMap<Integer,String>();
		map2.put(1, "Hanuman");
		map2.put(2, "Kiran");
		
		java.util.HashMap<Integer, String> map3 = new java.util.HashMap<Integer,String>();
		map3.put(3, "Charan");
		map3.put(4, "Ram");
		map3.put(5, "Hi"); // set will ignore the duplicates
		
		//Comparison on the basis of key-value : use equals method
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//Comparison on the basis of key-set
		
		System.out.println(map1.keySet().equals(map2.keySet())); // both keys are same
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
