

import java.util.Scanner;

class Raptor{

	public static void main(String [] args){
		
		int count = 0;
		float marks = 0.0f;
		float totalmarks = 0.0f;
		float percentage = 0.0f;

		Scanner sc;
		sc = new Scanner(System.in);
		
	//	System.out.println("***** ENTER NUMBER OF SUBJECTS *****");
	//	count = sc.nextInt();

		{
			System.out.println("*** PLEASE ENTER YOUR MARKS BETWEEN 0-100 *** ");
			System.out.println("==============================================");
		System.out.println("ENTER YOUR ENGLISH SCORE : " );
		int s1 = sc.nextInt();
		System.out.println("============================================");
		
		System.out.println("ENTER YOUR PHYSICS SCORE : " );
		int s2 = sc.nextInt(); 
		System.out.println("============================================");
		
		System.out.println("ENTER YOUR CHEMISTRY SCORE : " );
		int s3 = sc.nextInt(); 
		System.out.println("============================================");
		
		System.out.println("ENTER YOUR MATHEMATICS SCORE : " );
		int s4 = sc.nextInt();
		System.out.println("============================================");
		
		System.out.println("ENTER YOUR BIOLOGY SCORE : " ); 
		int s5 = sc.nextInt();
		System.out.println("============================================");
		
		if(s1<40 || s2<40 || s3<40 || s4<40 || s5<40){
			System.out.println("YOU FAILED IN EXAM !!!\n");
			System.out.println("COPYA PN NHI KRTA YET KA ");
			return;
		}

		if(s1>100 || s2>100 || s3>100 || s4>100 || s5>100 ){
		
			System.out.println("100 CHYA VRCHE MARK TA BAPANA DELE KA ?? ");
			return;
		}	

		totalmarks = s1+s2+s3+s4+s5;

		}

		System.out.println();

		System.out.println("YOUR TOTAL MARKS BECOMES : " + totalmarks);
		System.out.println("=============================");

		percentage = (totalmarks / (5*100))*100; 
	 	
	 	switch((int) percentage / 10){
		
			case 10 :
			
			case 9 : 
				System.out.println("***** ABOVE DISTINCTION ***** ");
				System.out.println(" CONGRATULATIONS !!!");
				break;

			case 8 : 
				System.out.println("***** DISTINCTION ***** ");
				System.out.println(" GREAT !! ");
				break;

			case 7 :	
				System.out.println("***** FIRST CLASS ***** ");
				System.out.println(" KEEP IT UP ! ");
				break;

			case 6 : 
				System.out.println("***** SECOND CLASS ***** ");
				System.out.println(" YOU NEED TO PRACTICE MORE.");
				break;

			case 5 : 

			case 4 : 	
				System.out.println("***** THIRD CLASS ***** ");
				System.out.println(" NEED MORE EFFORTS. ");
				break; 

			default : 
				System.out.println("***** YOU FAILED IN EXAM ***** ");
				System.out.println(" COPYA PN NHI KRTA YET KA ");
				break;


		}
		System.out.println("****************** SCORE EVALUATION ****************** ");
		System.out.println("=======================================================");
		System.out.println("IF YOUR SCORE LIES BETWEEN 450-500 : ABOVE DISTINCTION ");
		System.out.println("IF YOUR SCORE LIES BETWEEN 400-449 : DISTINCTION ");
		System.out.println("IF YOUR SCORE LIES BETWEEN 350-399 : FIRST CLASS ");	
		System.out.println("IF YOUR SCORE LIES BETWEEN 300-349 : SECOND CLASS ");
		System.out.println("IF YOUR SCORE LIES BETWEEN 200-299 : THIRD CLASS ");
		System.out.println("IF YOUR SCORE IS <=199 : YOU FAILED IN THE EXAM ");
		System.out.println("========================================================");
	}
}
