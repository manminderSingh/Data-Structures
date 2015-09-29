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
public class DeleteALinkedList {
    
    
    private class Node 
    {
        int data;
        Node next;
    }
    
    
    public void deleteList(Node head)
    {
        if(head!=null)
        {
        head =null;
        }
    }
    
    
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        
        pNode.next = head;
        head = pNode;
    }
    
    public void printList(Node head)
    {
        if(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
            printList(head);
        }
    }
    
    public static void main (String args[])
    {
        
    }
    
    
}
