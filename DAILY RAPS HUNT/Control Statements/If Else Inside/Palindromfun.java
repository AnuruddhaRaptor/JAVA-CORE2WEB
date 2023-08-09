
import java.util.*;

class Raptor{

		static void palindrome(int a){
	
		int rev = 0;
		int temp = a;
		int rem = 0;

			while(a!=0){
			
				rem = a%10;
				rev = rev*10 + rem;
				a = a/10;
			}
			if(temp==rev){
				System.out.println("It is a Palindrome Number");
			}	
			else{
				System.out.println("It is not a Palindrome Number");
			}

		}

		public static void main(String [] args){

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter int values");
			int a = sc.nextInt();
			palindrome(a);		
		}
}
