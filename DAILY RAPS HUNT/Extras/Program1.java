

import java.util.Scanner;

class SessionExpiredException extends RuntimeException {

	SessionExpiredException(String msg) {
	
		super(msg);
	}
}

class ChangePassword {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean authentication = false;
		int consecutiveFailedAttempts = 0;
		int arr1[] = new int[16];
		int arr2[] = new int[4];

	
		for(;;) {
			
			System.out.println("ENTER YOUR DEBIT CARD NUMBER (16-digit): " );
			long cardNumber = sc.nextLong();
					
			System.out.println("ENTER YOUR ATM PIN (4-digit): " );
			int pin = sc.nextInt();	

			if(cardNumber == arr1[15] && pin == arr2[3]) {
					
				authentication =  true;
				break;

			} else {
				consecutiveFailedAttempts ++;
				System.out.println("Invalid Credentials! " );
				System.out.println("*****One Failed Attempt!***** ");
				System.out.println("*****One Attempt Remaining.***** ");

				if(consecutiveFailedAttempts >=2) {				
						break;
				}
			}
		}

		if(authentication){
			
			System.out.println("Login Successfull ! ");

		} else{
		
			throw new SessionExpiredException("Your Session Has Been Expired ! Please Login After Sometime");
		}

	}
}
