package abstraction;

public interface student {
	void name();
	default void result(){
		System.out.println("student passed");
		
		
	}
static void  rollno (){
	System.out.println("rollno" + 12);
	
}
}
