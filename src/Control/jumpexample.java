package Control;
//Using all the Jump Statements in the same program: Write a Java program that includes the
//use of break, continue, and return statements
public class jumpexample {
	//return
	int square(int num) {
	return num*num;
}
	public static void main(String[] args) {
		int num=8;
		jumpexample j = new jumpexample();
	int	Result=j.square(num);
	System.out.println("Number :" +num);
	System.out.println("sqaure :" +Result);
	
	//continue
	System.out.println("Print odd numbers:");
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			continue;
		}
		
		System.out.println(i);
	}
	System.out.println("Print  numbers:");
	for(int i=1;i<=10;i++) {
		if(i==9) {
			break;
		}
		System.out.println(i);
	}
	}
	
	}
