package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		
	ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C"));
	ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","D"));
	ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C"));
	
	Collections.sort(l1);
	Collections.sort(l2);
	Collections.sort(l3);
	
	System.out.println(l1.equals(l2));
	System.out.println(l1.equals(l3));
	
	//Compare two lists and find out the additional elements
	ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	
	ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
//	l4.removeAll(l5);
//	System.out.println("v "+l4); //F

	//Find out the missing elements
	l5.removeAll(l4);
	System.out.println("S "+l5);//E
	
	//Find out the common elements
	
	ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Ram","Charan","Test"));
	ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Ravi","Gopi","Ram"));
	
	lang1.retainAll(lang2);
	System.out.println(lang1);//
	
	}

}
