/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manmindersinghsodhi
 */
public class NextGreaterElement {
    
    private int stackSize = 10;
    
    private class Stacks
    {
        int top;
        int items []  = new int [stackSize];
    }
    
    public void push(Stacks s, int x)
    {
        if(s.top==stackSize-1)
        {
            System.out.println("Cannot insert");
            System.out.println("Extending the size of the array");
            s.items = Arrays.copyOf(s.items, stackSize + s.items.length + 10);
        }
        
        else
        {
            s.items[++s.top] = x;
        }
    }
    
    public int pop(Stacks s)
    {
       if(isEmpty(s))
       {
           System.out.println("Stack is Empty");
           return 0;
       }
      return s.items[s.top--];
      
            
        
    }
    
    
    public boolean isEmpty(Stacks s)
    {
        if(s.top==-1)
            return true;
        return false;
    }
    
    
    public void printNge(int arr[], int n)
    {
        int i = 0;
        Stacks s = new Stacks();
        s.top=-1;
        int element, next;
        
        
        push(s, arr[0]);
        
        for(i=1;i<n;i++)
        {
            next = arr[i];
            if(isEmpty(s)==false)
            {
                element = pop(s);
            
            
            while(element<next)
            {
                System.out.println(element + ", " + next);
                if(isEmpty(s)==true)
                    break;
                
                element = pop(s);
            }
            
            if(element>next)
            {
                push(s, element);
            }
        }
            push(s, next);
    }
        while(isEmpty(s)==false)
        {
            element = pop(s);
            next = -1;
            System.out.println(element + ", " + next);
        }
}
    
    public static void main (String args[])
    {
        {
    int arr[]= {11, 13, 21, 3};
    int n = 4;
            NextGreaterElement nge = new NextGreaterElement();
            nge.printNge(arr, n);
   
  
}
    }
}
