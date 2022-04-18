package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraytoSet {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4,5,4,5,6,7,7,8,8));
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		ArrayList<Integer> al = new ArrayList<Integer>(set);
		
		System.out.println(al);
		
		

	}

}
