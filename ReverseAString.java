/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;

import java.util.Arrays;

/**
 *
 * @author manmindersinghsodhi
 */
public class ReverseAString {
    
    int DEFAULT_CAPACITY  =10;
    int top = -1;
    char a [] = new char[DEFAULT_CAPACITY];
    
    
    public void push (char str)
    {
        if(DEFAULT_CAPACITY==a.length)
        {
            a = Arrays.copyOf(a, a.length+10);
        }
        a[++top] = str;
    }
    
    public char pop()
    {
        if(top==-1)
        {
            System.out.println("Cannot remove");
        }
       return a[top--];
    }
    
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    
    public void reverse(char str[])
    {
        int n = str.length;
        
        int i;
        for(i=0;i<n;i++)
        {
            push(str[i]);
        }
        
        for(i=0;i<n;i++)
        {
            str[i] = pop();
        }
    }
    
    public static void main (String args[])
    {
        String str1 = "GeekQuiz";
        char str[] = str1.toCharArray();
        
        ReverseAString rs = new ReverseAString();
        rs.reverse(str);
        
        System.out.println(str);
    }
    
}
