
import java.io.*;

class Raptor{

	static void palindrome(int a){
		int rev = 0;
		int rem = 0;
		int temp = a;
			
			while(a!=0){
				
				rem = a % 10;
				rev = rev*10 + rem;
				a = a/10;
			} 
			if(temp == rev){
				System.out.println("It is a Palindrome Number");
			}
			else{ 
				System.out.println("It is not a Palindrome Number");
			} 
	}
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");

		int a = Integer.parseInt(br.readLine());

		palindrome(a);

	}
}
