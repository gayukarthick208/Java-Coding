package abstraction;

public interface bank {
	void deposit();
	default void  accountdetails() {
		System.out.println("account number : 657789887");
	}
	static void messages() {
		System.out.println("enter the number correctly");
	}

}
