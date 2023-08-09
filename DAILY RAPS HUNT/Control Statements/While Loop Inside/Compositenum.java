
import java.io.*;
class Raptor{

	static void Compositenum(int a){
	
		int count = 0;
		for(int i = 1; i<=a; i++){
			if(a%2==0)
				count++;
		}
		if(count==2){
			System.out.println("Not a Composite Number");
		}
		else if(count>2){
			System.out.println("Composite Number");
		}
		else{
			System.out.println("Not a Composite Number nor a Prime Number");
	
		}
	}
	 public static void main(String [] args)throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Number");
			int a = Integer.parseInt(br.readLine());
			Compositenum(a);
         } 
}
