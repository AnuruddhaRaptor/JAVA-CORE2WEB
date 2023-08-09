

// CURSOR [Again] , in first try no one in class understood this concept.

import java.util.*;

class CursorDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("C2W");

		for(var x : al) {
			
			System.out.println(x.getClass().getName());
		}
	}
}

// POINTS
/*
 * getClass() he method Object class chi aahe je ki originally Class navachya class mdhe aahe.
 * ha class eka sachya sarkha aahe.
 * java mdhle sagde class ya class la pahun bnavlya jatat.
 * yala metaclass dekhil mhntat.
*/
