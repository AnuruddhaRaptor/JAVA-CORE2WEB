
import java.util.*;

class Raptor{
		
	static void armstrong(int a ){
	
		int count = 0;
		int sum = 0;
		int temp1 = a;
		int temp2 = a;
			
			while(temp1!=0){
				count++;
				temp1 = temp1/10;
			} 
			
			while(a!=0){
				int rem = a % 10;
				int mult = 1;
					for(int i = 1; i<=count;i++){
						mult = mult*rem;
					}
					
					sum = sum + mult;
					a = a/10;
			}

			if(temp2 == sum){
				System.out.println("It is an Armstrong Number");
			} 
			else{
				System.out.println("It is not an Armstrong Number");
			} 

	}
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Int value");

		int a = sc.nextInt();
		armstrong(a);

	}
}
