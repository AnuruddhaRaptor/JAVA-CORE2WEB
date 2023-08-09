

class Raptor {

	public static void main(String [] args) {
	
		int bill = 0;
		int units = 200;

		if(units <= 100) {
			bill += units;
			System.out.println("Bill Amount : " + bill);
		} 
		else {
			units = 100;
			bill += 100;
			bill += units * 2;
			System.out.println("Bill Amounnt : " + bill);
		}
	}
}
