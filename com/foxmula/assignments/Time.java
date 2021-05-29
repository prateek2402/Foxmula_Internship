package com.foxmula.assignments;

public class Time
{
	private int hour, min, sec;
	
	Time(int hour, int min, int sec)   // Parameterized Constructor
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	void add(Time t)     // Add Function
	{
		int h, m, s;
		h = this.hour + t.hour;
		m = this.min + t.min;
		s = this.sec + t.sec;
		if(s>= 60)
		    {
		        m = m+1;
		        s = s-60;
		    }
		if(m>=60)
		    {
		        h = h+1;
		        m = m-60;
		    }
		System.out.println("Hour: " +h);
		System.out.println("Minutes: " +m);
		System.out.println("Seconds: " +s);
	}   


    public static void main(String args[])    //Main Function
    {
    	Time t1 = new Time(1,59,59);
    	Time t2 = new Time(2,11,30);
    	t1.add(t2);
    }
}