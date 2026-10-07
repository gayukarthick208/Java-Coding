package arrays;

//print 2 dimensional array
public class arraydim {
	public static void main(String[] args) {
		int[][] number = { 
				{ 1, 3, 5 },
				{ 2, 5, 7 }, 
				{ 4, 6, 8 } };
		for (int i = 0; i < number.length; i++)
		{
			for (int j = 0; j < number[i].length; j++) {

				System.out.print(number[i][j] + "  ");
			}
			
			System.out.println();
		}

	}
}
