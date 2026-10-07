package java_demo;

//reverse string
public class rev_string {
	public static void main(String[] args) {
		String str = "gayu";
		String reverse = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Original name:" + str);
		System.out.println("String Reversed: " + reverse);
	


if(str==reverse) {
	System.out.println("its a palindrome");
}
else {
	System.out.println("its not a palindrome");
}

}
}