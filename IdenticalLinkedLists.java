/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListGeek;

/**
 *
 * @author manmindersinghsodhi
 */
public class IdenticalLinkedLists {
    
    //1. Iterative
    //2. Recursive 
    
    
    //Iterative Approach
    
    private class Node
    {
        int data;
        Node next;
    }
    
    
    public boolean areIdentical(Node a, Node b)
    {
        while(true)
        {
            if(a==null&&b==null)
            {
                return true;
            }
            if(a==null&&b!=null)
            {
                return false;
            }
            
            if(a!=null&&b==null)
            {
                return true;
            }
            
            if(a.data!=b.data)
            {
                return false;
            }
            
            a = a.next;
            b = b.next;
        }
    }
    
    public void push(Node head, int new_data)
    {
        Node pNode  = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
    }
    
    public static void main (String args [])
    {
        Node a = null;
        Node b = null;
        
    }
    
}
