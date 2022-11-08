package javam.fundamentals.f.problem10;

public class Problem10 {
	static int repsEqual(int[] a, int n) {
		if (a == null || a.length < 1) {
			return 0;
		}
		for (int i = a.length - 1; i > 0; i--) {
			if (n % 10 != a[i]) {
				return 0;
			}
			n = n / 10;
		}
		return 1;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 3, 2, 0, 5, 3 }, 32053);
		printAndCall(new int[] { 3, 2, 0, 5 }, 32053);
		printAndCall(new int[] { 2, 3, 0, 5, 3 }, 32053);
		printAndCall(new int[] { 9, 3, 1, 1, 2 }, 32053);
		printAndCall(new int[] { 0, 3, 2, 0, 5, 3 }, 32053);
	}

	// Utility functions for displaying
	static void printAndCall(int[] a, int n) {
		System.out.print("{");
		for (int i = 0; a != null && i < a.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(a[i]);
		}
		System.out.print("}, " + n + ",");
		System.out.println(" Result = " + repsEqual(a, n));
	}
}
