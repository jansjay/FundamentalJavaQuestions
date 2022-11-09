package javam.fundamentals.f.problem12;

public class Problem12 {
	static int henry(int i, int j) {
		if (i < 0 || j < 0) {
			return -1;
		}
		int first = i > j ? j : i;
		int second = i > j ? i : j;
		int perfectSum = 0;
		int perfectCount = 0;
		for (int k = 0; ;k++) {
			if (isPerfectNumber(k)) {
				perfectCount++;
				if (perfectCount == first) {
					perfectSum = k;
				} 
				if (perfectCount == second) {
					return perfectSum + k;
				}
			}
		}
	}

	static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
			if (sum > n) {
				break;
			}
		}
		return n > 1 && sum == n;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(1, 3);
		printAndCall(3, 4);
		printAndCall(1, 1);
		printAndCall(1, 2);
		printAndCall(2, 4);
	}

	// Utility functions for displaying
	static void printAndCall(int a, int b) {
		System.out.println("henry(" + a + ", " + b + ") = " + henry(a, b));
	}
}
