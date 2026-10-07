package String;

//Remove Duplicates from a String - 
//Write a program to remove all duplicate characters from a string
public class duplicate {
	public static void main(String[] args) {
		String name = "mathematics";

		System.out.println("original String :" + name);

		for (int i = 0; i < name.length(); i++) {
			int j ;
	       for (j = 0; j < i; j++) {
			

		if (name.charAt(i) == name.charAt(j)) {
			break;
		}
	       }
		if(i==j)	{
			System.out.print(name.charAt(i));
		}
 
		}
	}
	}



