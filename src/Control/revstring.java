package Control;
//Reverse a String - Write a program to reverse a string using a `for` loop
public class revstring {
	String Reverse (String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		return rev;
			}
	public static void main(String[] args) {
		revstring r = new revstring();
		String Text="gayathri";
		String Result = r.Reverse(Text);
				System.out.println("Original String :" +  Text);
				System.out.println("Reversed String :" +  Result);
		
	}

}
