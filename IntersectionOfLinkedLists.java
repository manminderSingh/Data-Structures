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
public class IntersectionOfLinkedLists {
    
    
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
    
    
    public Node push(Node head, int new_Data)
    {
        Node pNode = new Node();
        pNode.data = new_Data;
        pNode.next = head;
        head = pNode;
        return pNode;
    }
    
    public int getIntersection(Node head1, Node head2)
    {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d = 0;
        
        if(c1>c2)
        {
            d = c1-c2;
            return _getIntersection(d, head1, head2);
        }
        else
        {
            d = c2-c1;
            return _getIntersection(d, head2, head1);
        }
    }
    
    
    public int _getIntersection(int d, Node head1, Node head2)
    {
     Node current1 = head1;
     Node current2 = head2;
     
     for(int i=0;i<2;i++)
     {
         if(current1==null)
         {
             return -1;
         }
         else
             current1 = current1.next;
     }
     
     
         while(current1!=null&&current2!=null)
         {
             if(current1==current2)
             {
                 return current1.data;
             }
             else
             {
                 current1 = current1.next;
                 current2 = current2.next;
             }
         }
     return -1;
    }
    
    
    public static void main (String args[])
    {
        
    }
    
}
