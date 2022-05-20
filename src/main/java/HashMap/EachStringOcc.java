package HashMap;

import java.util.HashMap;

public class EachStringOcc {

	public static void main(String[] args) {
		
		
		String str = "aabbccddttrr";
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		//i'll maintain one hashmap which stores char and int data key and value pair format
	
		char array[] = str.toCharArray();
		
		//char type array
		for(char c: array) {
			//i'll put one condition i.e, if the hmap contains 
			if(hmap.containsKey(c)) {
				//why contains key it represents key as character
				//if the it contains the first character next i'll add those values by using put
				hmap.put(c, hmap.get(c)+1);
			}
			//i'll maintain one that is else in that i'm going to update the hashmap with whatever value that you're passing
			else {
				hmap.put(c, 1);
			}
		}
		
		System.out.println(hmap);
		
		
	}

}