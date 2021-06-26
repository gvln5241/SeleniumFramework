package collectionsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add("first");
		ll.add("second");
		ll.add(true);
		ll.add("null");
		ll.add("hello");
		ll.add("null");
		
//		System.out.println(ll);
		System.out.println("---------------------------size:" + ll.size());
		
//		
//		ll.remove(2);
//		System.out.println("after remove: " + ll);
//		System.out.println("---------------------------");
//		ll.addFirst("sec");
//		System.out.println("after add first: " + ll);
//		System.out.println("---------------------------");

		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
			if (o.equals(100)) {
				System.out.println("---------------------------");
				ll.set(0, 200);
			}
			
		}
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		
	}

}
