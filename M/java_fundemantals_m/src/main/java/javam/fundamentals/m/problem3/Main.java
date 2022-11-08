package javam.fundamentals.m.problem3;

import java.util.*;

public class Main {

	/*
	 * Combines the lists that are populated here into a single list and pass to
	 * computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("John", 110000));
		emps.add(new Employee("Tom", 110000));
		emps.add(new Employee("Edward", 120000));
		emps.add(new Employee("Rich", 90000));
		emps.add(new Employee("Kevin", 100000));

		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager("Andrew", 110000, 10000));
		managers.add(new Manager("Rabelais", 130000, 5500));
		managers.add(new Manager("Phil", 135000, 12000));
		managers.add(new Manager("Tony", 95000, 8000));

		double salarySum = 0.0;
		// implement by combining the lists above into a single list and passing to
		List<Payable> payables = new ArrayList<>();
		for (Employee e : emps) {
			payables.add(e);
		}
		for (Manager m : managers) {
			payables.add(m);
		}
		// computeSumOfSalaries below
		salarySum = Statistics.computeSumOfSalaries(payables);
		System.out.println("Salary " + salarySum);
	}
}
