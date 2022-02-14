package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sample {
	
	//what is data structure??
	//Data Structure is a way to store and organize data so that it can be used efficiently

	public static void main(String[] args) {
        //Compare
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("R","A","S","D"));
		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("R","A","S","F"));
		
		Collections.sort(a1);
		Collections.sort(a2);
		
		System.out.println(a1.equals(a2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
