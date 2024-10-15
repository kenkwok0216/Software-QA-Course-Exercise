package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Input the number of rows of the matrix: ");
		int m = scan.nextInt();
		System.out.print("Input the number of columns of the matrix: ");
		int n = scan.nextInt();

		int[][] matrix_1 = new int[m][n];
		int[][] matrix_2 = new int[m][n];
		int[][] sum = new int[m][n];

		// row by row, column by column
		System.out.print("Input the elements of the first matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix_1[i][j] = scan.nextInt();
			}
		}

		// row by row, column by column
		System.out.print("Input the elements of the second matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix_2[i][j] = scan.nextInt();
			}
		}

		System.out.println("Sum of the matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
			}
		}

		// Print matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		scan.close();

	}
}