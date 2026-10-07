package Control;

//Leap Year Check - Determine if a year is a leap year using `if-else`
public class leapyear {
	public static void main(String[] args) {
		int Year = 2024;
		System.out.println("Year :"+ Year);


	if((Year% 400 == 0) || (Year%4==0 && Year %100!=0) ){
		System.out.println("Its a Leap Year ");

}
	else {
		System.out.println("Not a Leap Year");
	}
	}
}
