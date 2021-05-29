package com.foxmula.assignments;
import java.util.*;


public class Stack
{
    private int max, top;
    LinkedList<Integer> ll = new LinkedList<Integer>(); 
    
    Stack(int max)
    {
        this.max = max;
        top = -1;
    }
    
    void push(int a)
    {
        if(top < max)
        {
            top = top + 1;
            ll.add(top,a);
            
        }
    }
    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            top = top - 1;
            System.out.println("New top element:" +ll.get(top));
        }
    }
    
    boolean checkEmpty()
    {
        if(top == -1)
        
            return true;
        else
            return false;
    }
    
    
    int count()
    {
        if(top>-1)
            return top + 1;
        else
            return 0;
    }
    
    void equal(Stack s1, Stack s2)
    {
        if(s1.count() == s2.count())
            System.out.println("Number of elements:" +s1.count());
    }
    
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(10);
        Stack s2 = new Stack(10);
        
        while(true)
        {
            System.out.println("1. Push s1");
            System.out.println("2. Push s2");
            System.out.println("3. Pop s1");
            System.out.println("4. Pop s2");
            System.out.println("5. Check if s1 is empty");
            System.out.println("6. Check if s2 is empty");
            System.out.println("Enter Choice:");
            int a = sc.nextInt();
            
            switch(a)
            {
                case 1:
                    System.out.println("Enter data to be pushed");
                    int d1 = sc.nextInt();
                    s1.push(d1);
                    s1.equal(s1,s2);
                    break;
               
                case 2:
                    System.out.println("Enter data to be pushed");
                    int d2 = sc.nextInt();
                    s2.push(d2);
                    s2.equal(s1,s2);
                    break;
              
                case 3:
                    s1.pop();
                    s1.equal(s1,s2);
                    break;
                
                case 4:
                    s2.pop();
                    s2.equal(s1,s2);
                    break;
                    
                case 5:
                    System.out.println(s1.checkEmpty());
                    break;
                    
                case 6:
                	System.out.println(s2.checkEmpty());
                    break;
                    
                default:
                    System.out.println("Exit");
            }
            if(a>6)
                break;
        }
        
        sc.close();
        
    }   
}










