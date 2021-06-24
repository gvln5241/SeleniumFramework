package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List alist1 = new ArrayList();
		
		alist1.add("12345");
		alist1.add("3first element");
		//Collections.sort(alist1);
		Collections.reverse(alist1);
		
		
		System.out.println(alist1 + " " + alist1.size());
		
		alist1.add(1,"sample");
		
		//alist1.removeAll(alist1);
		System.out.println(alist1 + " " + alist1.size());
		System.out.println(alist1.isEmpty());
		System.out.println(alist1.get(1));
		alist1.set(2, "after change");
		
		System.out.println(alist1 + " " + alist1.size());
		System.out.println(alist1.contains("sample"));
		System.out.println("----------");
		Iterator itr=alist1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------");
		for(int i=0;i<alist1.size();i++) {
			System.out.println(alist1.get(i));
		}
		
		
	}
	
	

}
