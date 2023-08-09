
class Raptor{

	public static void main(String [] args){
	
		long sum = 0;
		long n1 = 0;
		long n2 = 1;
		int count = 50;
			while(count>0){
			//	sum = n1 + sum;
			//	n1 = n2;
				System.out.println(sum);
				n1=n2;
				n2 = sum;
				sum = n1 + n2;
				count--;
			}
	}
}
