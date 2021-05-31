package com.foxmula.assignment1;

class Trapezoid extends Quadrilateral
{
    private int h;
    
    Trapezoid(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int h)
    {
        super(x1,y1,x2,y2,x3,y3,x4,y4);
        this.h = h;
    }
    
    double area()
    {
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
        double area = ((a+b)/2)*h;
        return area;
    }
    
}
