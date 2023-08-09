

// LinkedList

//Methods
/* 1) public E getFirst();
 * 2) public E getLast();
 * 3) public E removeFirst();
 * 4) public E removeLast();
 * 5) public void addFirst(E);
 * 6) public void addLast(E); 
 * 7) java util.LinkedList$Node3<E> node<int> */

import java.util.*;

class LinkedListDemo {

	public static void main(String [] args) {
	
		LinkedList ll = new LinkedList();

		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);
		System.out.println(ll);

		ll.add(2, 25);
		System.out.println(ll);

	}
}


