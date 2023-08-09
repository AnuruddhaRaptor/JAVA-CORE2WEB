class Raptor {

	public static void main(String[] args){
		/*int row=6;
		for(int i=1;i<=row;i++){
			char ch=(char)(71-i);
			for(int j=1;j<=i;j++){
				System.out.print(ch+++" ");
			}
			System.out.println();
		}*/

		int row=6;
		char ch='F';
		char ch1;
		for(int i=1;i<=row;i++){
			ch1=ch;
			for(int j=1;j<=i;j++){
				System.out.print(ch1+++" ");
			}
			ch--;
			System.out.println();
		}
	}

	// F
	// E F
	// D E F
	// C D E F
	// B C D E F
	// A B C D E F
}
