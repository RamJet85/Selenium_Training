package Set_Interface;

import java.util.Arrays;
import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		
		//Hashset is a class it implements set interface
		java.util.Set<Object> hs = new java.util.HashSet<Object>();  
		hs.add("Ram");
		hs.add("Ravi");
		hs.add("sushma");
		hs.add("Ram"); // set doesn't allow duplicates
		hs.add(null);
		hs.add(10);	
		
		System.out.println(hs);
		
		System.out.println(hs.contains("sushma"));
		System.out.println("for each loop");
		
		// Print using for each loop 
		for (Object e : hs) {
			System.out.println(e);
					
		}
		
		// Print using iterator
		System.out.println("using iterator");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		hs.remove(null);
		System.out.println(hs);
		
		
		java.util.Set<Integer> set1 = new java.util.HashSet<Integer>();  
		set1.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,11,13,34}));
		
		
		java.util.Set<Integer> set2 = new java.util.HashSet<Integer>();  
		set2.addAll(Arrays.asList(new Integer[] {2,4,6,8,10,12,13,29}));

		//get union --> all the elements in sorted wise
		java.util.Set<Integer> union = new java.util.HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);
				
		//get intersection-->Common elements
		java.util.Set<Integer> intersection = new java.util.HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		//Common values from the first it will remove aprt from 13 it will show all 
		java.util.Set<Integer> diff = new java.util.HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println(diff);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
