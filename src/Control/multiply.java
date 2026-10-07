package Control;
// Print the multiplication table of a number using a `for` loop
public class multiply {
	public static void main(String[] args) {
		int number=8;
		System.out.println("Multiplication table of : "+ number);
		for(int i=1;i<=10;i++) {
			System.out.println(i+ "*" + number + "=" + (number*i));
		}
		
		
		
	}

}
