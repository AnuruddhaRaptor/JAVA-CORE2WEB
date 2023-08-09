
import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException {
    	public InsufficientBalanceException(String message) {
        	super(message);
    	}
}

class LaxmiChitFund {
    	private double balance;

    	public LaxmiChitFund(double initialBalance) {
        	this.balance = initialBalance;
    	}

    	public void withdraw(double amount) throws InsufficientBalanceException {
        	if (amount > balance) {
            		throw new InsufficientBalanceException("Ye Fraud Hai mat lagana Iske Chakkar me paise . Ye " + amount + "$ bhul jao ...aur IAS vas bano Desh ki seva kro ");
        	}
        	balance -= amount;
		System.out.println("Abe 21 Din to hone de Abhi Paise Diye abhi Nikal bhi raha hai");
        	System.out.println("Anuradha In Parallel Universe . Aapki Baki Dhanrashi : " + balance + "$");
		System.out.println("Baki ke invest kiye hai 21 din baad aana");
    	}
}

class Client {
    	public static void main(String[] args) {
	
        	Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Baburao : Delhi ka capital India , Mumbai ka capital Dharavi");
		System.out.println("Raju : Aagayi Aagayi Mal Aagaya Aagaya Aagaya");
		System.out.println("Anuradha to Raju : Raju ye konsi Degree Hai aapki ITUS ");
		System.out.println("Raju : Good good International Talent Of Ultimate Student , kafi Difficult course hai ");
		System.out.println("Anuradha : Are you satisfied Mister Shayam ");
		System.out.println("Anuradha :  App Tinho ke Paise double ho jayege");
		System.out.println("Aap tinho Jald hi Crorepati ban ne wale hai");
		System.out.println("Shayam : Mai to sirf Pati ban na chahata hu ... ");
		System.out.print("Anuradha : Paise Do : " ); 
        	double initialBalance = sc.nextDouble();

		LaxmiChitFund account = new LaxmiChitFund(initialBalance);

		System.out.println("------------------------------------------------------------------------------------------");
        	System.out.println("Baburao : Kaha gaya Laxmi chit fund wali ka office ... ye raha ");
		System.out.print("Kitni Dhanrashi Nikalni hai : ");
        	double withdrawalAmount = sc.nextDouble();
		System.out.println("------------------------------------------------------------------------------------------");

        	try {
            		account.withdraw(withdrawalAmount);
        	} catch (InsufficientBalanceException ib) {
         		System.out.println("Exception: " + ib.getMessage());
        	}
    	}
}

