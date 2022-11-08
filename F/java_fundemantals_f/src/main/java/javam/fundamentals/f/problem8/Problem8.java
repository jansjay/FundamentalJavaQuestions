package javam.fundamentals.f.problem8;

public class Problem8 {
	static int sumFactor(int[] a) {
		if (a == null) {
			return 0;
		}
		int sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == sum) {
				count++;
			}
		}
		return count;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 3, 0, 2, -5, 0 });
		printAndCall(new int[] { 9, -3, -3, -1, -1 });
		printAndCall(new int[] { 1 });
		printAndCall(new int[] { 0, 0, 0 });
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
		System.out.println(" Result = " + sumFactor(a));
	}

}
