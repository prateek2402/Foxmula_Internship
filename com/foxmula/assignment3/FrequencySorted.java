package com.foxmula.assignment3;

import java.util.*;

public class FrequencySorted 
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be stored");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i =0;i<size;i++)
		{
			System.out.println("Enter the element : ");
			int e = sc.nextInt();
			arr[i] = e;
		}
		
		for(int a :arr)
		{
			int value = hm.getOrDefault(a, 0);
			hm.put(a, value + 1);
			al.add(a);
		}
		Comparison c = new Comparison(hm);
		Collections.sort(al,c);
		System.out.println("Elements sorted by frequency are : ");
		System.out.println(al);
		sc.close();
		
	}
}