package javam.fundamentals.f.problem11;

public class Problem11 {
	static int isCentered15(int[] a) {
		if (a == null) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length - i; j++) {
				sum += a[j];				
			}
			if (sum == 15) {
				return 1;
			}
		}
		return 0;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 3, 2, 10, 4, 1, 6, 9 });
		printAndCall(new int[] { 2, 10, 4, 1, 6, 9 });
		printAndCall(new int[] { 3, 2, 10, 4, 1, 6 });
		printAndCall(new int[] { 1, 1, 8, 3, 1, 1 });
		printAndCall(new int[] { 9, 15, 6 });
		printAndCall(new int[] { 9, 15, 6 });
		printAndCall(new int[] { 1, 1, 2, 2, 1, 1 });
		printAndCall(new int[] { 1, 1, 15 - 1, -1 });
	}

	// Utility functions for displaying
	static void printAndCall(int[] a) {
		System.out.print("{");
		for (int i = 0; a != null && i < a.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(a[i]);
		}
		System.out.print("}");
		System.out.println(" Result = " + isCentered15(a));
	}
}
