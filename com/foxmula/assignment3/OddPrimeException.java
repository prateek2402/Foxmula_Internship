package com.foxmula.assignment3;

import java.util.*;

public class OddPrimeException extends Exception
{
	OddPrimeException(String s)
	{
		super(s);
	}
	
	public static void main(String args[])
	{
		try 
		{
			int n, i = 2;
			boolean flag = false;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number to be checked : ");
			n = scanner.nextInt();
			scanner.close();
			if(n%2 == 0)
			{
				return;
			}
			while(i<=n/2)
			{
				if(n%i == 0)
				{
					flag = true;
					break;
				}
				
				++i;
			}
			
			if(!flag) 
			{
				throw new OddPrimeException("Number is Invalid");
			}
			else
			{
				return;
			}
		}
			
		catch(OddPrimeException op)
		{
			System.out.println(op.getMessage());
		}
			
	}
}

