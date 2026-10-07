package abstraction;

public interface forest {
	void reptiles();

	default void animals() {
		System.out.println("this is a dog");

	}
static void birds() {
	System.out.println("this  is pigeon");
	
}
}
