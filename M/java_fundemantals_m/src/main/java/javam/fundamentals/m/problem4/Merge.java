package javam.fundamentals.m.problem4;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		Integer value1 = null;
		Integer value2 = null;
		if(!list1.isEmpty())
		{
			value1 = list1.pollLast();
		}
		if(!list2.isEmpty())
		{
			value2 = list2.pollLast();
		}
		LinkedList<Integer> mergedList;
		if(value1 != null && value2 != null)
		{
			if(value2 > value1)
			{
				list1.add(value1);
				mergedList = merge(list1, list2);
				mergedList.addLast(value2);					
				list2.add(value2);
			}
			else if(value1 > value2)
			{
				list2.add(value2);
				mergedList = merge(list1, list2);
				mergedList.addLast(value1);										
				list1.add(value1);					
			}
			else
			{
				mergedList = merge(list1, list2);
				mergedList.addLast(value1);
				mergedList.addLast(value2);					
				list1.add(value1);
				list2.add(value2);
			}
		}
		else
		{
			if(value1 == null && value2 == null)
			{
				return new LinkedList<Integer>();
			}
			else if(value1 == null)
			{
				mergedList = merge(list1, list2);					
				mergedList.addLast(value2);
				list2.add(value2);
			}
			else //if(value2 == null)
			{
				mergedList = merge(list1, list2);					
				mergedList.addLast(value1);
				list1.add(value1);
			}
		}			
		return mergedList;
	
	}
	//test your code
	//Expected output:  [2, 4, 5, 9, 17, 21, 25]
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		Merge m = new Merge();
		LinkedList<Integer> list3 = m.merge(list1, list2);
		System.out.println("List 1 = " + list1);
		System.out.println("List 2 = " + list2);
		if(list3 != null) System.out.println("Sorted List = " + list3);
	}
}
