package com.foxmula.assignment2;

import java.util.*;

public class ArrayListManipulation
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the number of values to be stored in ArrayList");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter Value to be added");
			int inp = sc.nextInt();
			al.add(inp);
		}
		
		System.out.println("Enter value to be searched");
		int v = sc.nextInt();
		System.out.println(v + " is contained in the ArrayList : " +al.contains(v));
		sc.close();
	}
	
	
	

}
