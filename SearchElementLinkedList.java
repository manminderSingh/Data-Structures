/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListGeek;

import java.net.SocketOptions;

/**
 *
 * @author manmindersinghsodhi
 */
public class SearchElementLinkedList {
    
    
    private class Node 
    {
        Node next;
        int data;
    }
    
    public Node push(Node head, int data)
    {
        Node pNode = new Node();
        pNode.data = data;
        
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    
    public boolean search (Node head, int data)
    {
        Node current = head;
        while(current!=null)
        {
            if(current.data==data)
                return true;
            current = current.next;
        }
        return false;
    }
    
    public int positionOfNode(Node head, int data)
    {
        Node current = head;
        int count = -1;
        while(current!=null)
        {
            count++;
            if(data==current.data)
                return count;
            
            current = current.next;
        }
        return -1;
    }
    
    public boolean searchRecursive (Node head, int x)
    {
        if(head==null)
        {
            return false;
        }
        if(head.data==x)
            return true;
        return searchRecursive(head.next, x);
    }
    
    public static void main (String args[])
    {
        Node head = null;
        int x =  14;
        
        SearchElementLinkedList sa = new SearchElementLinkedList();
        head =sa.push(head, 10);
        head =sa.push(head, 30);
        head =sa.push(head, 11);
        head =sa.push(head, 21);
        head =sa.push(head, 14);
        
        System.out.println(sa.search(head, x));
        System.out.println(sa.positionOfNode(head, x));
        
    }
    
}
