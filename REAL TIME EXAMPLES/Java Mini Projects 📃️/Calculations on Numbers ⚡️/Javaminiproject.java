

import java.io.*;
class Raptor{


	static void reverse(int x){
		int rev = 0;
		int rem = 0;
		while(x != 0) {
		
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x/10;

		}
		
		System.out.println("Reverse of your input number is :  " + rev);
		
		System.out.println("======================================================================================= ");

		
	}

	static void perfect(int x) {
	
	
		int sum = 0;

		for(int i = 1; i<x; i++){
			if(x % i==0){
				sum = sum + i;
			}
		}
		System.out.println(sum);

		if(sum==x){
			System.out.println("Entered number "+ x +" is a Perfect Number");
		}
		else{
			System.out.println("Entered number "+ x +" is not a Perfect Number");
		}

		System.out.println("======================================================================================= ");

	}

	static void armstrong(int x) {
	
		int count = 0;
		int sum = 0;
		int temp1 = x;
		int temp2 = x;

		while(temp1 != 0) {
		
			count ++;
			temp1 = temp1/10;

		}

		while(x != 0) {
		
			int rem = x % 10;
			int mult = 1;
			
			for(int i=1; i<=count; i++) {
			
				mult = mult * rem;

			}

			sum = sum + mult;
			x = x/10;

		}

		if(temp2 == sum)
		
			System.out.println("Entered number "+ temp2 +" is an Armstrong Number ");

		else 
			System.out.println("Entered number "+ temp2 +" is not an Armstrong Number : ");


		System.out.println("======================================================================================= ");

	}

	static void palindrome(int x) {
	
		int rev = 0;
		int temp = x;
		int rem = 0;

			while(x!=0){

				rem = x%10;
				rev = rev*10 + rem;
				x = x/10;
			}
			if(temp==rev){
				System.out.println("Entered number "+ temp +" is a Palindrome Number");
			}
			else{
				System.out.println("Entered number "+ temp +" is not a Palindrome Number");
			}


		System.out.println("======================================================================================= ");


	}

	static void prime(int x){
	
		int count = 0;
		for(int i = 1; i<=x; i++){
			if(x % i == 0){
				count++;
			}
		} 
		if(count==2)
			 System.out.println("Entered number "+ x +" is a Prime Number");
		else
			System.out.println("Entered number "+ x +" is not a Prime Number");
	
		System.out.println("======================================================================================= ");

	}

	static void composite(int x){

		int count = 0;
		for(int i = 1; i<=x; i++){
			if(x%2==0)
				count++;
		}
		if(count==2){
			System.out.println("Entered number "+ x +" is not a Composite Number");
		}
		else if(count>2){
			System.out.println("Entered number "+ x +" is a Composite Number");
		}
		else{
			System.out.println("Entered number "+ x +" is not a Composite Number nor a Prime Number");

		}

		System.out.println("======================================================================================= ");


	}

	static void automorphic(int x){

		int sq = x*x;
		int temp = x;


			while(temp!=0){
				if(temp%10 == sq%10){
					temp = temp/10;
					sq = sq/10;
				}
				else{
					break;
				}

			}
			if(temp == 0){
				System.out.println("Entered number " + x +" is an Automorphic Number");
			}
			else{
				System.out.println("Entered number "+ x +" is not an Automorhic Number");
			}

		System.out.println("======================================================================================= ");


	}

	static void strong(int x){
	
		int sum = 0;
		int temp = x;
		int rem = 0;

			while(x!=0){
			        rem = x % 10;
		        	int fact = 1;
					for(int i = 1; i<=rem; i++){
						fact = fact*i;
				        }
				        sum = sum + fact;
			         	x = x/10;
			}

			if(sum == temp){
				System.out.println("Entered number "+ temp +" is a Strong Number");
			}
			else{
				System.out.println("Entered number "+ temp +" is not a Strong Number");
			}
	
		System.out.println("======================================================================================= ");

	}


	public static void main(String [] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch;

		do {
		
		System.out.println("======================================================================================= ");

		System.out.println("Enter any Number : ");

		int x = Integer.parseInt(br.readLine());

		System.out.println("======================================================================================= ");

		System.out.println("1.REVERSE NUMBER ");

		System.out.println("2.PERFECT NUMBER ");

		System.out.println("3.ARMSTRONG NUMBER ");

		System.out.println("4.PALINDROME NUMBER ");

		System.out.println("5.PRIME NUMBER ");

		System.out.println("6.COMPOSITE NUMBER ");

		System.out.println("7.AUTOMORPHIC NUMBER ");

		System.out.println("8.STRONG NUMBER ");

		System.out.println("======================================================================================= ");

		System.out.println("Enter Your Choice : ");

		int y = Integer.parseInt(br.readLine());
		
		System.out.println("======================================================================================= ");

		switch(y){

			case 1 :
				reverse(x);
				break;
		
			case 2 :
				perfect(x);
				break;

			case 3 : 
				armstrong(x);
				break;

			case 4 : 
				palindrome(x);
				break;

			case 5 :
				prime(x);
				break;

			case 6 :
				composite(x);
				break;

			case 7 :
				automorphic(x);
				break;

			case 8 : 
				strong(x);
				break;

			default : 
				System.out.println("Please Enter Valid Option ");

		}


		System.out.println("Do you want to continue (Y/N) : ");

		ch = (char)br.read();
		br.skip(1);

		System.out.println("======================================================================================= ");

		} while (ch == 'Y' || ch == 'y');

	}
}
