package academy.teenfuture.crse;

import java.util.Arrays;
import java.util.Scanner;

class Problem_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Input for first array
		System.out.print("Enter the size of the first array (p): ");
		int p = scan.nextInt();
		int[] A = new int[p];
		System.out.println("Enter the elements of the first sorted array: ");
		for (int i = 0; i < p; i++) {
			A[i] = scan.nextInt();
		}

		// Input for second array
		System.out.print("Enter the size of the second array (q): ");
		int q = scan.nextInt();
		int[] B = new int[q];
		System.out.println("Enter the elements of the second sorted array: ");
		for (int i = 0; i < q; i++) {
			B[i] = scan.nextInt();
		}

		System.out.print("The input Array A: ");
		System.out.println(Arrays.toString(A));
		System.out.print("The input Array B: ");
		System.out.println(Arrays.toString(B));

		MergeSortArray(A, p, B, q);

		System.out.print("The output Array A: ");
		System.out.println(Arrays.toString(A));
		System.out.print("The output Array B: ");
		System.out.println(Arrays.toString(B));

	}

	public static void MergeSortArray(int[] A, int p, int[] B, int q) {
		int[] temp = new int[p + q];

		for (int i = 0; i < p; i++) {
			temp[i] = A[i];
		}

		for (int i = 0; i < q; i++) {
			temp[p + i] = B[i];
		}

		Arrays.sort(temp);

		for (int i = 0; i < p; i++) {
			A[i] = temp[i];
		}

		for (int i = 0; i < q; i++) {
			B[i] = temp[p + i];
		}
	}
}