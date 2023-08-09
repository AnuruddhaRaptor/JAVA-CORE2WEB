

import java. util.Scanner;
import arithfun.Subtraction;

class Client {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		Subtraction obj = new Subtraction(x,y);

		System.out.println(obj.sub());
	}
}
