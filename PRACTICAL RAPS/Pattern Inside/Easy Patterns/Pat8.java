
class Raptor{

	public static void main(String[] args){
		
		int n = 4;
		int x = 1;
		for(int i = 1; i<=n; i++){
		
			for(int j = 1; j<=i; j++){
			
				if(j%2==1){
					System.out.print((x*x)+ " ");
				} 
				else{
					System.out.print(x+ " ");
				} 
				x++;
			} 
			System.out.println();
		}
	}
}

//		1
//		4   3
//		16  5  36
//		49  8  81  100
