class Raptora{
	public static void main(String [] args){
	
		int n = 376;
		int sq = n*n;
		int temp = n;
		int digit = 0;
		while(n!=0){
			digit++;
			n = n/10;
		} 
		n = temp;
		int rem = 0;
		int rev = 0;
		while(digit>0){
			rem = sq %10;
			rev = rev*10 +rem;
			sq = sq / 10;
			digit--;
		} 
		int rev1 = 0;
		int temp2 = rev1;
		while(rev!=0){
			rem = rev % 10;
			rev1=rev1*10+rem;
			rev=rev/10;
		} 
		if(temp==rev1)
			System.out.println("It is an Automorphic Number");
		else
			System.out.println("It is not an Automorphic Number");	
	}

}
