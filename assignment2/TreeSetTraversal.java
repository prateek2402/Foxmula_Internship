package com.foxmula.assignment2;

import java.util.*;

public class TreeSetTraversal
{
	public static void main(String args[])
	{
		TreeSet<Double> ts = new TreeSet<Double>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be stored in the TreeSet");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{	
			//Adding elements to the TreeSet from user input by add() method
			System.out.println("Enter element to be added");
			double inp = sc.nextDouble();
			ts.add(inp);
		}
		
		//Traversing the TreeSet using Iterator
		Iterator<Double> itr = ts.iterator();
		System.out.println("All the elements oin the TreeSet : ");
		while(itr.hasNext())
			System.out.println(itr.next());
		sc.close();
		
	}
}
