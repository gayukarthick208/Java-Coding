package Control;

//Matrix Addition - Perform matrix addition using nested `for` loops. 
public class Matrix_add {
	public static void main(String[] args) {
		int a[][] = { { 1, 3 }, { 3, 2 } };
		int b[][] = { { 4, 2 }, { 6, 3 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			System.out.println();
			
		}

	}

}
