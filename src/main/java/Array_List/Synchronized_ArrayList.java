package Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_ArrayList {
//by default array list is non synchronized collection, not thread safe
	//to synchronize we have two ways
	//Collections.synchronzied method return sync list
	//CopyOnWriteArrayList -Thread safe varient of arrayList
	public static void main(String[] args) {
	  //to generate Synchronized arrayList
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		//Collections.synchronizedList(new ArrayList<String>());
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
		//Thread safe varient of arrayList, what is the name of thred safe arraylist
		CopyOnWriteArrayList<Object> li = new CopyOnWriteArrayList<Object>();
		li.add("hari");
		li.add("2345");
		Arrays.asList(3,6,7,8,9);
		
		Iterator<Object> er = li.iterator();
		while (er.hasNext()) {
			System.out.println(er.next());
		}
		
		
		}
	}