package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
public static void main(String[] args) {
		
		//LinkedHashSet <Integer>lset=new LinkedHashSet<Integer>();
		//HashSet lset=new HashSet();
		LinkedHashSet lset=new LinkedHashSet();
		
		lset.add(100);
		lset.add(200);
		lset.add(900);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset); //[400, 100, 500, 200, 300]
		ArrayList alset=new ArrayList(lset);
		Collections.sort(alset,Collections.reverseOrder());
		System.out.println(alset);
		
		//line in local files

	}
}
