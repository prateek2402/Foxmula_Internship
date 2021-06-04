package com.foxmula.assignment3;

import java.util.*;

public class Frequency 
{
	
	void frequency(HashMap<Integer,Integer> hm, int[] arr)
	{
		for(int i:arr)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i) + 1);
			}
			else
			{
				hm.put(i, 1);
			}
		}
		
		for(Map.Entry e:hm.entrySet())
		{
			System.out.println("Element : " + e.getKey() + " Frequency : " + e.getValue());
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Frequency f = new Frequency();
		int size = 0, a;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		System.out.println("Enter size of Array");
		size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number to be added : ");
			a = sc.nextInt();
			arr[i] = a;
		}
		
		f.frequency(hm,arr);
		sc.close();
	}
}
