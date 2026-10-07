package Interface;

public class Pay_type implements Payment {
	public void pay() {
		System.out.println("payment type");
	}

	public static void main(String[] args) {
		Payment p = new Pay_type();
		p.Creditcard();
		p.UPI();
		Payment.Netbanking();
	}

}
