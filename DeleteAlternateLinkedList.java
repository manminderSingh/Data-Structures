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
public class DeleteAlternateLinkedList {
    
    //1. Iterative 
    //2. Recursive
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
    }
    
    
    public void printLists(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    public void deleteAlternate(Node head)
    {
        if(head==null)
        {
            return;
        }
        
        Node current = head;
        Node pNode = head.next;
        
        while(current!=null&&pNode!=null)
        {
            current.next = pNode.next;
            current= current.next;
            if(pNode!=null)
            {
                pNode = current.next;
            }
        }
    }
    
    public void deleteAlternateRecursive(Node head)
    {
        if(head==null)
        {
            return;
        }
        
        Node pNode = head.next;
        if(pNode==null)
        {
            return;
        }
        
        head.next = pNode.next;
        
        deleteAlternateRecursive(head.next);
    }
    
    public static void main (String args[])
    {
        
    }
    
}
