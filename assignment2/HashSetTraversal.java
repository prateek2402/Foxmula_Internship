package com.foxmula.assignment2;

//import java.util.HashSet;
import java.util.*;

public class HashSetTraversal 
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be stored in the HashSet");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{	
			//Adding elements to the HashSet from user input by add() method
			System.out.println("Enter element to be added");
			String inp = sc.next();
			hs.add(inp);
		}
		
		
		// Traversing using Iterator
		Iterator<String> itr = hs.iterator();
		System.out.println("All elements in the HashSet :");
		while(itr.hasNext())
			System.out.println(itr.next());
		sc.close();
	}
}
