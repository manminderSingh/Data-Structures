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

//1. Simply using two loops
//2. Mark Visited Nodes
//3. Using different of Node Counts
//4. Make Circle in Forst List

//This class will show the thord method. 

public class IntersectionPointOfLinkedLists {
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public int getCount(Node head)
            {
                
                Node current = head;
                int count = 0;
                while(current!=null)
                {
                    count++;
                    current = current.next;
                }
                
                return count;
                
            }
    
    
    //This is a method to get the intersection where head1 has more d nodes than head2
    public int _getIntersectionNode (int d, Node head1, Node head2)
    {
        int i;
        Node current1 = head1;
        Node current2 = head2;
        
        for(i=0;i<d;i++)
        {
            if(current1==null)
            {
                return -1;
            }
            current1 = current1.next;
        }
        
        while(current1!=null&&current2!=null)
        {
            if(current1==current2)
            {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
        
    }
    
    
    public int getInstersectionNode (Node head1, Node head2)
    {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        
        int d;
        if(c1>c2)
        {
            d = c1-c2;
            return _getIntersectionNode(d, head1, head2);
        }
        
        else
        {
            d = c2-c1;
            return _getIntersectionNode(d, head2, head1);
        }
        
    }
    
    public static void main (String args[])
    {
        Node pNode ;
        
    }
    
}
