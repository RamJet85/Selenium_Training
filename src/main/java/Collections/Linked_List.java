package Collections;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		//Linked List is a very commonly used linear data structure which consists of group of nodes in a sequence.

        //Each node holds its own data and the address of the next node hence forming a chain like structure.
		
		//LinkedList should be used where modifications to a collection are frequent like addition/deletion operations. 
		//LinkedList is much faster as compare to ArrayList in such cases. In case of read-only collections or 
		//collections which are rarely modified, ArrayList is suitable.

		LinkedList<Object> list = new LinkedList<Object>();
		
		list.add(10);
		list.add("Ram");
		list.add(10.23);
		list.add('M');
		list.add(1233213434324l);
		
		for (Object ele : list) {
			System.out.println(ele);
		}
		
		list.addFirst("Charan");
		
		list.addLast("Hero");		
		
		for (Object ele : list) {
			System.out.println(ele);
		}
		
		list.removeFirst();
		list.addFirst("chari");
		
		System.out.println(list);
		list.remove(2);
		
	}

}
