

class ForDemo{


	public static void main(String[] args){	
		
		int row = 4;

		for(int i = 1; i<=row; i++){
			
			for(int j = 1; j<=row-i+1; j++){
			
				System.out.print(i++ + " ");
			} 
			System.out.println();
		}
	}
}
