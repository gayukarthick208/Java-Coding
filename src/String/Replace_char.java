package String;

//Replace Characters in a String - 
//Write a program to replace all occurrences of a specific character in a string with another character
public class Replace_char {
	
	public static void main(String[] args) {
		
		String name= "JOSHETHA";
		System.out.println("Original Name :" + name);
		
		System.out.println();
		String X = name.replace("ETHA", "AAN");

		
		System.out.println("After Replacing :"+X);
		
	}

}
