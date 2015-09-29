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
public class MoveLastElementToFirstLinkedList {
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public void moveToFront(Node head)
    {
        if(head==null||head.next==null)
        {
            return;
        }
        
        Node secLast = null;
        Node last = head;
        
        while(last.next!=null)
        {
            secLast = last;
            last = last.next;
        }
        
        secLast.next = null;
        last.next = head;
        head = last;
            
    }
    
}
