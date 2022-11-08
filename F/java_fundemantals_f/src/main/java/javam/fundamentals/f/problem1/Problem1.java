package javam.fundamentals.f.problem1;

public class Problem1 {
	static int primeCount(int start, int end) {
		int intStart = start;
		int intEnd = end;
		int count = 0;
		if (end < 0 || start < 0) {
			return 0;
		}
		if (end < start) {
			intStart = end;
			intEnd = start;
		}
		for (int i = intStart; i <= intEnd; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		return count;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(10, 30);
	}

	// Utility functions for displaying
	static void printAndCall(int start, int end) {
		System.out.println("Start = " + start + ", End = " + end + ", No of prime numbers in-between (inclusive) = "
				+ primeCount(start, end));
	}

}
