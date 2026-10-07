package String;

//Remove All White Spaces from a String - 
//Write a program to remove all white spaces from a string.
public class Rem_space {
	public static void main(String[] args) {

		String name = "Welcome  to Java  Programming";

		System.out.println("Orignal Name :" + name);

		String replace = name.replace(" ", "");

		System.out.println("After Space  Removed :" + replace);

	}

}
