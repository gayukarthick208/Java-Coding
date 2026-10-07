package Interface;

//Create an interface Payment with a method pay(). Implement different payment methods.
//Create an interface Payment.
//Declare the method pay().
//Create: CreditCard, UPI and NetBanking classes.
//Implement the pay() method.
//Payment made using Credit Card. Payment made using UPI. Payment made using Net Banking.

public interface Payment {
	void pay();

	default void Creditcard() {
		System.out.println("payment by credit card");
	}

	default void UPI() {
		System.out.println("payment  by UPI");
	}

	static void Netbanking() {
		System.out.println("payment using Netbanking");
	}

}
