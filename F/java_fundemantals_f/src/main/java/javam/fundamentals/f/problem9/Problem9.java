package javam.fundamentals.f.problem9;

public class Problem9 {
	static int[] solve10() {
		int maxNumber = 20;
		int[] returnArr = new int[2];
		int factorials[] = new int[maxNumber];
		for (int i = 0; i <factorials.length; i++)
		{
			factorials[i] = factorial(i);
		}
		for (int i = 0; i < factorials.length ; i++) {
			for (int j = factorials.length - 1; j >= 0; j--) {
				if (factorials[i] + factorials[j] == factorials[9] ) {
					returnArr[0] = i;
					returnArr[1] = j;
					return returnArr;
				}
			}
		}
		return null;
	}

	static int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	// Test your implementation.
	public static void main(String[] args) {
		callAndPrint();
	}

	// Utility functions for displaying
	static void callAndPrint() {
		int[] a = solve10();
		System.out.print("{");
		for (int i = 0; a != null && i < a.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(a[i]);
		}
		System.out.print("}");
	}

}
