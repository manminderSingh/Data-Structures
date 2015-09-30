/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author manmindersinghsodhi
 */
public class StackUsingTwoQueues {
    
    public static void main (String args [])
    {
        
    }
    
    
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    
    public int pop()
    {
        if(q1.peek()==null)
        {
            System.out.println("Stack is Empty, Nothing to return");
            int i = 0;
            return i;
        }
        else
        {
            int pop = q1.remove();
            return pop;
        }
    }
    
    
    // 
    
    public void push(int data)
    {
        if(q1.peek()==null)
        {
            q1.add(data);
            
        }
        
        else
        {
            for(int i=q1.size();i>0;i--)
            {
                q2.add(q1.remove());
            }
            
            q1.add(data);
            for(int j = q2.size();j>0;j--)
            {
                q1.add(q2.remove());
            }
        }
    }
    
    
    
}
