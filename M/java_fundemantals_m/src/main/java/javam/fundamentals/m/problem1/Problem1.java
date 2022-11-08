package javam.fundamentals.m.problem1;

import java.util.*;

public class Problem1 {
	/**
	 * Implement a recursive strategy to compute the sum of the test scores that are
	 * found as values in the scores HashMap
	 */
	/* Do not modify the signature of this method */
	private double computeSum(HashMap<String, String> scores) {
		if (scores == null || scores.size() == 0)
			return 0;
		HashMap<String, String> clone = new HashMap<>(scores);
		Object[] keys = clone.keySet().toArray();
		String value = clone.remove(keys[0]);
		try {
			return Double.parseDouble(value) + computeSum(clone);
		} catch (Exception ex) {
			return 0;
		}

	}

	/* Do not modify this code. */
	public double computeAverage(HashMap<String, String> scores) {
		computeSum(scores);
		if (scores.size() > 0) {
			return (double) computeSum(scores) / scores.size();
		} else {
			return 0.0;
		}
	}

	// Test your implementation here. Expected output is approximately 9.666.
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("John William", "77.5");
		map.put("Annette Jones", "91.0");
		map.put("Kevin Specker", "88.8");
		Problem1 m = new Problem1();
		System.out.println(m.computeAverage(map));
		System.out.println(m.computeAverage(new HashMap<>()));
	}

}
