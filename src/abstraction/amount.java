package abstraction;

public class amount implements atm {
	public void withdraw(int amount) {
		System.out.println("withdraw amount :" + amount);
	}
	public static void main(String[] args) {
		//interface name obj =new class name();
		atm a = new amount();
		
		a.withdraw(5000);
		a.check_balance();
		
	}
}
