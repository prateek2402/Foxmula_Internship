package com.foxmula.assignment2;

import java.util.*;

public class Occurence 
{
	 private ArrayList<Integer> al = new ArrayList<Integer>();
	 
	//Method to determine frequency of all elements
	 void countFrequency(ArrayList<Integer> al)
	{
		HashSet<Integer> hs = new HashSet<Integer>(al);
		for(int s:hs)
		{
			System.out.println("Element : " +s +" Frequency : " +Collections.frequency(al,s));
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// Creating instance of Occurence class
		Occurence o = new Occurence();
		
		System.out.println("Enter the number of elements to be stored in the ArrayList");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{	
			//Adding elements to the ArrayList from user input by add() method
			System.out.println("Enter element to be added");
			int inp = sc.nextInt();
			o.al.add(inp);
		}
		o.countFrequency(o.al);
		sc.close();
		
	}
}
