package com.foxmula.assignment2;

import java.util.*;

public class Pair 
{
	private ArrayList<Integer> al = new ArrayList<Integer>();
	
	// Method to find elements whose sum is k
	void sum(Pair p,int k)
	{
		HashSet<Integer> hs = new HashSet<Integer>(p.al);
		System.out.println("Elements with the sum "+k +" are : ");
		
		for(int i:hs)
		{
			for(int j:hs)
			{
				if(i + j == k)
					System.out.println(i +" " +j);
					
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int k,n;
		Pair p = new Pair();
		System.out.println("Enter the number of elements to be stored in the ArrayList");
		n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{	
			//Adding elements to the ArrayList from user input by add() method
			System.out.println("Enter element to be added");
			int inp = sc.nextInt();
			p.al.add(inp);
		}
		System.out.println("Enter the value of Sum");
		k = sc.nextInt();
		
	p.sum(p, k);
	sc.close();
	}

}
