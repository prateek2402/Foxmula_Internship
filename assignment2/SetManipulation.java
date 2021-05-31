package com.foxmula.assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class SetManipulation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
			
		System.out.println("Enter the number of values to be stored in the set");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter Value to be added");
			String inp = sc.next();
			hs.add(inp);
		}
		System.out.println("Enter value to be searched");
		String v = sc.next();
		System.out.println(v + " is contained in the Set : " +hs.contains(v));
		sc.close();
	}
		

}
	


