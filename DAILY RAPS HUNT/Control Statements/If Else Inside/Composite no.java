class Raptorc{
	public static void main(String [] args){
	
		int n = 1;
		int count = 0;

		for(int i = 1; i<=n; i++){
			if(n%2==0)
				count++;	
		}
		if(count==2){
			System.out.println("It is not a Composite Number");
		} 
		else if(count>2){
			System.out.println("It is a Composite Number");
		} 
		else{
			System.out.println("It is neither Composite nor Prime");
		}
	}

}
