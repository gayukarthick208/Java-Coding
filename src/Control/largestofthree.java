package Control;

//Find Largest of Three Numbers - Use if-else to find the largest of three numbers.
public class largestofthree {
	public static void main(String[] args) {
		int a = 4545;
		int b = 8687;
		int c = 3445;
		if ((a > b) && (a > c)) {
			System.out.println(a + " :Largest number");
		} else if ((b > a) && (b > c)) {
			System.out.println(b + " :Largest number ");

		} else {
			System.out.println(c + " : Largest number");
		}

	}

}
