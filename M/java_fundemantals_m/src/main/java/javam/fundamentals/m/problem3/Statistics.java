package javam.fundamentals.m.problem3;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically
	 * computes and returns the sum
	 * of all the salaries of all the employees/managers in the list.
	 */
	public static double computeSumOfSalaries(List<Payable> aList) {
		if (aList == null || aList.size() == 0) {
			return 0.0;
		}
		//implement
		//compute sum of all salaries of people in aList and return
		double sumOfSalaries = 0;
		for(Payable payable : aList)
		{
			sumOfSalaries += payable.getSalary();
		}
		return sumOfSalaries;
	}
}
