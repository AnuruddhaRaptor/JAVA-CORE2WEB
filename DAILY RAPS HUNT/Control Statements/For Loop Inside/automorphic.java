class Raptorautomorphic{
	public static void main(String [] args){
		int n = 376;
		int y = n*n;
		int temp = n;
		boolean b = false;
		while(temp!=0){
			if(temp % 10 == y % 10){
				temp = temp / 10;
				y = y/10;
			}
		
		        else{
				b = true;
				break;
			}
		} 
		if(b == false)
			System.out.println("It is an Automorphic Number");
		else
			System.out.println("It is not an Automorphic Number");
	
	}

}
