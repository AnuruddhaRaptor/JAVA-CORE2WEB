

// Different Iterators.

import java.util.*;

class CursorDemo {

        public static void main(String [] args) {

                ArrayList al = new ArrayList();

                al.add("Ashish");
                al.add("Kanha");
                al.add("Rahul");
                al.add("Badhe");

                // 1) Iterator

		// Iterator ---> interface
		// curosr internally ---> ArrayList$iterator

		Iterator cursor = al.iterator();
		while(cursor.hasNext()) {
		
			if("Kanha".equals(cursor.next()))
				cursor.remove();
		}

		System.out.println(al);
		/*
		

		// 2) ListIterator 
		
		// litr internally  ---> ArrayList$ListItr

		ListIterator litr = al.listIterator();

		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		

		// 3) Enumeration 
		
		// curosr internally ---> Vector$1
		// Enumeration cursor internally ananoymous inner class aahe vector cha.
			
		Enumeration cursor = al.elements(); // error cannot find symbol

		while(cursor.hasMoreElements()) {
			System.out.println(cursor.nextElement());
		}
		*/
        }
}

