

// Cursor

// NOTE : Always use CURSOR in Collection instead of any loops.
/* Types
 *
 * 1) iterator (Universal [List, Set, Queue])
 * 2) List iterator (only List)
 * 3) Enumeration (Legacy class [Vector, Stack])
 * 4) Spliterator (Stream)
 *
 * METHODS of iterator
 *
 * 1) public abstract boolean hasNext();
 * 2) public abstract E next();
 * 3) public default void remove();
 * 4) public default void forEachRemaining(.....);
 */

import java.util.*;

class IteratorDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add("Kanha");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
		
			if("Rahul".equals(itr.next()))
				itr.remove();

			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}
