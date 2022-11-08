package javam.fundamentals.f.problem2;
public class Problem2 {
	static boolean isMadhavArray(int[] a) {
		if(a == null || a.length < 3)
		{
			return false;
		}
		int sum = a[0];		
		int index = 1;	
		for(int i = 2; i < a.length && index < a.length; i++)
		{
			int runningSum = 0;
			if((i * (i + 1)/2) > a.length)
			{
				return false;
			}
			for(int j = 0; j < i && index < a.length; j++)
			{
				runningSum += a[index];				
				index ++;
			}
			if(sum != runningSum)
			{
				return false;
			}
		}
		return true;
	}

	// Test your implementation.
	public static void main(String[] args) {
		printAndCall(new int[]{2, 1, 1});
		printAndCall(new int[]{2, 1, 1, 4, -1, -1});
		printAndCall(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		printAndCall(new int[]{18, 9, 10, 6, 6, 6});
		printAndCall(new int[]{-6, -3, -3, 8, -5, -4});
		printAndCall(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		printAndCall(new int[]{3, 1, 2, 3, 0});
	}

	// Utility functions for displaying
	static void printAndCall(int[] a) {
		System.out.print("{");
		for(int i = 0; a != null && i < a.length; i++)
		{
			if(i != 0)
			{
				System.out.print(",");
			}
			System.out.print(a[i]);
		}
		System.out.print("}");
		System.out.println(" Result = " + isMadhavArray(a));		
	}

}
