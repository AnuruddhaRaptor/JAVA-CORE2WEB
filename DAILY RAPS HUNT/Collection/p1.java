
// ArrayList 

import java.util.*;

class ArrayListDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		// 1) add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("Anuruddha");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		// 2) size();
		System.out.println(al.size());

		// 3) contains(Object)
		System.out.println(al.contains("Anuruddha"));

		// 4) indexOf(Object)
		System.out.println(al.indexOf(20.5f));

		// 5) lastIndexOf(Object)
		System.out.println(al.lastIndexOf(20.5f));

		// 6) get(int)
		System.out.println(al.get(3));

		// 7) set(int, E)
		System.out.println(al.set(3, "Incubator"));

		// 8) add(int,E)
		System.out.println(al.add(3, "Core2Web"));
		
		// 9) remove(int)
		System.out.println(al.remove(3));

		// 10) clear()
		System.out.println(al.clear());

		// 11) toArray()		
		//System.out.println(Object arr[] = al.toArray());
		
		// 12) remove(Object)
		// 13) addAll(Collection)
		// 14) addAll(int, Collection)
		// 15) removeRange(int, int)
	}
}
