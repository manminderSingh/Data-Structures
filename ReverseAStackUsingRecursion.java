/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackGeek;

/**
 *
 * @author manmindersinghsodhi
 */
public class ReverseAStackUsingRecursion {
    
    private class Node
    {
        int data;
        Node next;
    }
    
    
    public void push(Node top, int newData)
    {
        Node pNode  = new Node();
        
        if(pNode==null)
        {
            System.out.println("Stack Overflow");
            
        }
        
        pNode.data = newData;
        pNode.next = top;
        
        top = pNode;
    }
    
    public int pop(Node top)
    {
        int res = 0;
       
        
        if(top==null)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            
            res = top.data;
            top = top.next;
            
        }
        return res;
    }
    
    public boolean isEmpty(Node top)
    {
        return (top==null)?true:false;
    }
    
    
    public void print(Node top)
    {
        System.out.println("");
        while(top!=null)
        {
            System.out.println(top.data);
            top = top.next;
        }
    }
    
    public static void main(String args[])
    {
       
        Node s = null;
        ReverseAStackUsingRecursion rs = new ReverseAStackUsingRecursion();
       
        rs.push(s, 4);
        rs.push(s, 3);
        rs.push(s, 2);
        rs.push(s, 1);
        
        System.out.println("Original Sgtack ");
        rs.print(s);
        rs.reverse(s);
        System.out.println("Reversed Stack");
        rs.print(s);
        
    }
    
    
    public void reverse (Node top)
    {
        int temp;
        if(!isEmpty(top))
        {
            temp = pop(top);
            reverse(top);
            
            insertAtBottom(top, temp);
        }
    }
    
    
    public void insertAtBottom(Node top, int item)
    {
        int temp;
        if(isEmpty(top))
        {
            push(top, item);
        }
        else
        {
            temp = pop(top);
            insertAtBottom(top, item);
            push(top, temp);
        }
    }
}
