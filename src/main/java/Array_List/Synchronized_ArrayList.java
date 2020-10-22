package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_ArrayList {

	public static void main(String[] args) {
	  //Explicit Synchronized arrayList
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Ram");
		list.add("charan");
		//We don't need explicit synchronization for add or delete
		//To fetch/Traverse the value from the list we have to use explicit synchronization 
		
		synchronized (list) {
			
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		//
		CopyOnWriteArrayList<String> li = new CopyOnWriteArrayList<String>();
		li.add("hari");
		li.add("2345");
		Arrays.asList(3,6,7,8,9);
		
		Iterator<String> er = li.iterator();
		while (er.hasNext()) {
			System.out.println(er.next());
		}
		
		
		}
	}