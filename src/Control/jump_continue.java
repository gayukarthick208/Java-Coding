package Control;
//Write a program to print numbers from 1 to 10, but skip the number 5 using the
//continue statement.
public class jump_continue {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
			
	}

}
