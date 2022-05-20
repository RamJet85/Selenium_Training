package Practice;

import java.util.HashMap;

public class occurances {

	public static void main(String[] args) {
		
		String str = "aabbddrreeaaffggssww";
		
		int length = str.length();
		
		System.out.println(length);
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//i'll
		char array[] = str.toCharArray();
		
		for (char c : array) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}
			
			else {
				
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		
	}

}
