package javam.fundamentals.f.problem6;

public class Problem6 {
	static int isGuthrieSequence(int[] a) {
		if (a == null || a.length < 1) {
			return 0;
		}
		boolean endsWithOne = a[a.length - 1] == 1;
		boolean startsWithPositiveNumber = a[0] > 0;
		boolean allConditionsMeets = true;
		for (int i = a.length - 1; endsWithOne && startsWithPositiveNumber && i >= 1; i--) {
			if ((((a[i] - 1) / 3) == a[i - 1]) || (a[i] * 2 == a[i - 1])) {
				continue;
			} else {
				allConditionsMeets = false;
				break;
			}
		}
		return endsWithOne && startsWithPositiveNumber && allConditionsMeets ? 1 : 0;

	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[] { 8, 4, 2, 1 });
		printAndCall(new int[] { 8, 17, 4, 1 });
		printAndCall(new int[] { 8, 4, 1 });
		printAndCall(new int[] { 8, 4, 2 });
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
		System.out.println(" Result = " + isGuthrieSequence(a));
	}

}
