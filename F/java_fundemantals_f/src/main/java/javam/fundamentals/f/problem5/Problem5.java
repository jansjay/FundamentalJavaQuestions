package javam.fundamentals.f.problem5;

public class Problem5 {
	static int findPorcupineNumber(int a) {
		if (a < 1) {
			return -1;
		}
		int i = a++;
		int porcupineCandidate = -1;
		boolean lastPrimeIsPorcupineCandidate = false;
		while (true) {
			i++;
			if (isPrime(i)) {
				if (porcupineCandidate != -1 && i%10 == 9 && lastPrimeIsPorcupineCandidate) {
					return porcupineCandidate;
				}
				if (i%10 == 9) {
					porcupineCandidate = i;
					lastPrimeIsPorcupineCandidate = true;
				}
				else {
					porcupineCandidate = -1;
					lastPrimeIsPorcupineCandidate = false;				
				}
			}
		}
	}

	static boolean isPrime(int value) {
		if (value < 2)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall();
	}

	// Utility functions for displaying
	static void printAndCall() {
		for (int i = 0; i < 150; i++) {
			System.out.println(" Procupine No of " + i + ", is " + findPorcupineNumber(i));
		}
	}

}
