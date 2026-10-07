package Control;

//Write a program to check if a string is a palindrome using a `for` loop. 
public class palindrome {
	public static void main(String[] args) {

		String str = "lishaan";
		String reverse = "";
for (int i=str.length()-1;i>=0;i--)
	reverse=reverse+str.charAt(i);
	
if (str.equals(reverse)) {
	System.out.println(str  + "  :It's a palindrome" );
}
else
{
System.out.println(str   + " :It's not a palindrome");
}
}
}