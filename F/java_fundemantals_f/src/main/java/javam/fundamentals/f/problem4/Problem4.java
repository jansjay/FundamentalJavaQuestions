package javam.fundamentals.f.problem4;

public class Problem4 {
	static int getSquarePairCount(int[] a) {
		int count = 0;
		for (int i = 0; a != null && i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > 0 && a[j] > 0 && isPerfectSquare(a[i] + a[j])) {
					count++;
				}
			}
		}
		return count;
	}

	static boolean isPerfectSquare(int value) {
		if (value < 2)
			return false;
		for (int i = 0; i < value; i++) {
			if (i * i == value) {
				return true;
			}
		}
		return false;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 9, 0, 2, -5, 7 });
		printAndCall(new int[] { 9 });
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
		System.out.println(" Result = " + getSquarePairCount(a));
	}

}
