package arrays;
//String array using scanner

import java.util.Scanner;

public class arr_sc {
public static void main(String[] args) {
	String[] names= new String[3];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the names:");
	for(int i=0;i<names.length;i++) {
		names[i]=sc.nextLine();
	}
	System.out.println("Names entered:");
	for(String name:names) {
		System.out.println(name);
	
}
	sc.close();
}
}
