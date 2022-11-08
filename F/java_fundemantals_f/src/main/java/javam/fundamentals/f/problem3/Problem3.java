package javam.fundamentals.f.problem3;

public class Problem3 {
	static int isInertial(int[] a) {
		if (a == null || a.length < 1) {
			return 0;
		}
		boolean containsAtLeastOneOdd = false;
		boolean maxIntValueDefined = false;
		boolean nextMaxIntValueDefined = false;
		int maxIntValue = 0;
		int nextMaxIntValue = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				containsAtLeastOneOdd = true;
			} else {
				if (maxIntValueDefined) {
					if (maxIntValue > a[i]) {
						nextMaxIntValue = a[i];
						nextMaxIntValueDefined = true;
					} else if (nextMaxIntValue != a[i]) {
						nextMaxIntValue = maxIntValue;
						maxIntValue = a[i];
						nextMaxIntValueDefined = true;
					}
				} else {
					maxIntValue = a[i];
				}
				maxIntValueDefined = true;
			}
		}
		if (!maxIntValueDefined || !containsAtLeastOneOdd) {
			return 0;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				if ((nextMaxIntValueDefined && a[i] < nextMaxIntValue) || (maxIntValue < a[i])) {
					return 0;
				}
			}
		}
		return 1;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 1 });
		printAndCall(new int[] { 2 });
		printAndCall(new int[] { 1, 2, 3, 4 });
		printAndCall(new int[] { 1, 1, 1, 1, 1, 1, 2 });
		printAndCall(new int[] { 2, 12, 4, 6, 8, 11 });
		printAndCall(new int[] { 2, 12, 12, 4, 6, 8, 11 });
		printAndCall(new int[] { -2, -4, -6, -8, -11 });
		printAndCall(new int[] { 2, 3, 5, 7 });
		printAndCall(new int[] { 2, 4, 6, 8, 10 });
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
		System.out.println(" Result = " + isInertial(a));
	}

}
