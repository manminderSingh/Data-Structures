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
public class ReverseALinkedList {
    
    
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    public static void reverse (Node head)
    {
       Node previous =  null;
       Node current = head;
       Node temp;
       while(current!=null)
       {
           temp  = current.next;
           current.next = previous;
           previous = current;
           current = temp;
       }
       
       head = previous;
    }
    
    
    public void printList (Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public Node push(Node head, int new_data)
    {
        Node pNode  = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    public static void main (String args[])
    {
        
    }
    
    
    public void reverseAList(Node head)
    {
        Node current = head;
        Node temp ;
        Node previous = null;
        if(current!=null)
        {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        
        head = previous;
    }
    
}
