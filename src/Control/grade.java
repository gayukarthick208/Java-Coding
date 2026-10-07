package Control;
//Assign a grade (A, B, C, D, F) based on a score input by the user using `ifelse`. 
public class grade {
	public static void main(String[] args) {
		int score = 85;
		System.out.println("score:" + score);
		if(score>=85) {
			System.out.println("Grade A");
		}
		else if(score>= 70) 
		{
			System.out.println("Grade B");
		}
		else if(score>= 50) 
		{
			System.out.println("Grade C");
		}else if (score>=35)
		{
			System.out.println("Grade D");
		}
		else{
			System.out.println("Fail");
		}
	}
	

}
