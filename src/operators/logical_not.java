package operators;
//Logical NOT (!): Write a Java program to invert a Boolean condition.
public class logical_not {
	public static void main(String[] args) {
		boolean cardblocked=true;
		
		if(!cardblocked) {
			System.out.println("Card can be used");
		}
		else
			System.out.println("card cant be used");
	}

}
