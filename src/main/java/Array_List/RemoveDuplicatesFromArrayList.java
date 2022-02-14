package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,4,1,2,5,6,7,7,8,9,8,9,8,7));
		// we can add using add method also
		//Use linkedHash set
		Set<Integer> set = new LinkedHashSet<Integer>(values); //Set can't have duplicate values
		
		ArrayList<Integer> valu = new ArrayList<Integer>(set);  //To store fresh data we need another list
		
		for (Integer ls : valu) {
			System.out.println(ls);
			
		}
		
		
		
		
	}

}
