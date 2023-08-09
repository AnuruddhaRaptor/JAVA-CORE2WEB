

// Stack

import java.util.*;

class StackDemo {

	public static void main(String [] args) {
	
		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
	}
}


// POINTS : 1) It preserves insertion order.
//          2) It got this feature from List.

// Stack Methods

/* 1) s.pop(); ---> remove and return
 *    output : [10,20,30]
 *
 * 2) s.peek(); ---> return
 *    output : [40]
 *
 * 3) s.search(30);
 *    output : 2 
*/

