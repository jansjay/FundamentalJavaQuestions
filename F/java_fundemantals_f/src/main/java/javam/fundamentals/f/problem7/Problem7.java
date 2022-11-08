package javam.fundamentals.f.problem7;

public class Problem7 {
	static int stantonMeasure(int[] a) {
		if (a == null) {
			return 0;
		}
		int countOfOne = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				countOfOne++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == countOfOne) {
				count++;
			}
		}
		return count;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] {1});
		printAndCall(new int[] {0});
		printAndCall(new int[] {3, 1, 1, 4});
		printAndCall(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4});
		printAndCall(new int[] {});
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
		System.out.println(" Result = " + stantonMeasure(a));
	}

}
