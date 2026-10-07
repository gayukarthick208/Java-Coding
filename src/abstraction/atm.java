package abstraction;

public interface  atm {
	void withdraw(int amount ) ;
	
		default void check_balance() {
			System.out.println("available amount  RS:65000" );
			
		}
		static void accountholder() {
			System.out.println("name:josh");
			System.out.println("bank name: ICICI");
	}

}
