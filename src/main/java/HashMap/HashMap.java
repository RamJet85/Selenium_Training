package HashMap;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
//HashMap is a class, It implements the Map interface which is used to store key and value pairs, 
//where keys should be unique. If you try to insert the duplicate key, it will replaced the previous key with the latest key. 
//It is easy to perform operations using the key index like updation, deletion, etc.
//Hashmap should be in key and value format, it is not index based 
//we can store null values In hashmap we can have no of null values but we have only one null key if more than 1 it will replace with new key
		
	  java.util.HashMap<Integer, String> maps = new java.util.HashMap<Integer,String>();
	  
	 
	  
	  
	  maps.put(1, "Ram");
	  maps.put(2, "Charan");
	  maps.put(3, "Anusha");
	  maps.put(null, "Krishna");
	  maps.put(null, "india");
	  maps.put(2, "Testing");//duplicate key
	  
	  System.out.println(maps.get(1));
	  System.out.println(maps.get(89)); // if you don't have key u should get null
	  
	  //Entry set will give u the each pair 
	  System.out.println("*********************");
	  
	  for(Map.Entry<Integer, String> e:maps.entrySet()) { // entry set will give u the sets set means pair
		  System.out.println(e.getKey()+ " "+e.getValue());
		 
	  }
	  System.out.println("*********************");
	  //To get only keys using keySet
	  for (Integer s1 : maps.keySet()) {
		System.out.println("key = "+s1);
	  }
	  System.out.println("*********************");
	  //To get only values using 
	  
	  for(String s2 : maps.values()){
		  System.out.println("values "+s2);
	  }
	  
	  for (Map.Entry<Integer, String> d : maps.entrySet()) {
		  System.out.println(d.getKey()+ " "+ d.getValue());
		
	}
	  
		
	}
	  
	 }


