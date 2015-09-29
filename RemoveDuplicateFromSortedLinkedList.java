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
public class RemoveDuplicateFromSortedLinkedList {
    
    
    private class Node
    {
        int data;
        Node next;
    }
    
     public Node push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    
    public void printLists(Node head)
    {
        Node current = head;
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    
    public void removeDuplicates(Node head)
    {
        Node current = head;
        Node nextNode;
        
        if(current==null)
            return;
        
        while(current.next!=null)
        {
            if(current.data==current.next.data)
            {
                nextNode = current.next.next;
                current.next = nextNode;
            }
            else
            {
                current = current.next;
            }
        }
    }
    
    
    
    public static void main (String args[])
    {
        Node head = null;
        RemoveDuplicateFromSortedLinkedList rs =  new RemoveDuplicateFromSortedLinkedList();
        head = rs.push(head, 11);
        head = rs.push(head, 11);
        head = rs.push(head, 11);
        head = rs.push(head, 20);
        head = rs.push(head, 13);
        head = rs.push(head, 13);
        head = rs.push(head, 14);
        
        
        rs.printLists(head);
        
        rs.removeDuplicates(head);
        System.out.println("");
        rs.printLists(head);
        
    }
    
}
