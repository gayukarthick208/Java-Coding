package operators;

//Find the Minimum of Three Numbers: Write a Java program to find the minimum of three numbers using the ternary operator
public class min_threenum {
	public static void main(String[] args) {
		int a = 10;
		int b=20;
		int c = 30;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("c :"+c);
		int minimum = (a<b)?((a<c) ? a : c) :((b<c)?b:c);
			System.out.println("Minimum of three numbers: "+ minimum);
		}
		
		

	}
	

