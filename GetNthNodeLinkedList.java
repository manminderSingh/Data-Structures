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
public class GetNthNodeLinkedList {
    
    
    //This class specifies the index number related to Linked list. head being 0 head.next being 1 and so on.
    private class Node
    {
        int data;
        Node next;
    }
    
    
    public Node push (Node head, int new_data)
    {
        Node pNode  = new Node();
        
        pNode.data  = new_data;
        pNode.next = head;
        
        head = pNode;
        return head;
    }
    
    //Time Complexity O(n)
    public int getNth (Node head, int index)
    {
        Node current  = head;
        int count  = 0;
        
        while(current!=null)
        {
        if(count==index)
            return current.data;
        count++;
        current = current.next;
            
        }
        return 0;
    }
    
    
    public static void main (String args[])
    {
        
        Node head = null;
        GetNthNodeLinkedList gn =  new GetNthNodeLinkedList();
        head = gn.push(head, 1);
        head = gn.push(head, 2);
        head = gn.push(head, 3);
        head = gn.push(head, 4);
        
        System.out.println(gn.getNth(head, 1));
        System.out.println(gn.getTh(head, 1));
    }
    
    public int getTh (Node head, int index)
    {
        Node current = head;
        int count =0 ;
        while(current!=null)
        {
            if(count==index)
                return current.data;
            count++;
            current = current.next;
        }
        return -1;
    }
}
