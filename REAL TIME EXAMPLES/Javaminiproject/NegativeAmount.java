package HomeWork;

public class NegativeAmount extends Exception {

	public NegativeAmount() {
        super("Invalid amount: amount cannot be negative");
		System.out.println("Invalid amount: amount cannot be negative");
    }
}
