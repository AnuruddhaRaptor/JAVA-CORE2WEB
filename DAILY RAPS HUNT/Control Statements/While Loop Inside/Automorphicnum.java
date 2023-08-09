
import java.io.*;
class Raptor{
	
	static void Automorphicnum(int a){
	
		int sq = a*a;
		int temp = a;

	
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
				System.out.println("Automorphic Number");
			}
			else{
				System.out.println("Not Automorhic Number");
			}
		
	} 
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int a = Integer.parseInt(br.readLine());
		Automorphicnum(a);
	}
}
