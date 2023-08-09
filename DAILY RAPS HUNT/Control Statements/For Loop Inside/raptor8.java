class raptor8{

	public static void main(String [] args){
	
	
		int n= 370;
		int arm = 0;
		int temp = n;
		for(; n>0;){
			int rem = n%10;
			arm = arm + (rem*rem*rem);
			n = n/10;
		} 
		if(temp==arm)
			System.out.println("Armstrong no");
		else
			System.out.println("Not");
	}
}
