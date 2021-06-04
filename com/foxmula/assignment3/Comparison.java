package com.foxmula.assignment3;

import java.util.*;
public class Comparison implements Comparator<Integer>
{
	final HashMap<Integer,Integer> hm;
	
	Comparison(HashMap<Integer,Integer> hm)
	{
		this.hm = hm;
	}
	
	public int compare(Integer i, Integer j)
	{
		return hm.get(i).compareTo(hm.get(j));
	}
}
