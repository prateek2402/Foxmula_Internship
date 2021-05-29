package com.foxmula.assignments;

public class Quadrilateral
{
	protected int x1,y1,x2,y2,x3,y3,x4,y4;
	
	Quadrilateral(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
	    this.x1 = x1;
	    this.y1 = y1;
	    this.x2 = x2;
	    this.y2 = y2;
	    this.x3 = x3;
	    this.y3 = y3;
	    this.x4 = x4;
	    this.y4 = y4;
	}
	
    public static void main(String args[])
    {
        Trapezoid t = new Trapezoid(6,7,16,31,34,31,50,7,15);
        System.out.println("Area of Trapezoid:" +t.area());
        
        Parallelogram p = new Parallelogram(6,7,18,26,48,26,36,7,19);
        System.out.println("Area of Parallelogram:" +p.area());
        
        Rectangle r = new Rectangle(2,3,2,5,5,9,9,3);
        System.out.println("Area of Rectangle:" +r.area());
        
        Square s = new Square(7,4,7,26,29,26,26,4);
        System.out.println("Area of Square:" +s.area());
    }
}










    



