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
public class NthNodeFromEndOfLinkedList {
    
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    
    public void printNthNodeFromLast(Node head, int n)
    {
        int len = 0, i;
        Node temp = head;
        
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        
        if(len<n)
        {
            System.out.println("Cannot find the value");
        }
        
        
        temp = head;
        
        for(i=1;i<len-n+1;i++)
        {
            temp = temp.next;
            System.out.println(temp.data);
        }
        
        
    }
    
    public Node push(Node head, int new_data)
    {
     
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head =pNode;
        return head;
    }
    
    
    public void getN(Node head, int n)
    {
        Node current = head;
        int len = 0;
        while(current!=null)  
        {
            
          current = current.next; 
          len++;
        }
        
        if(len<n)
        {
            System.out.println("There is nothing to display in the list");
        }
        
        current = head;
        
        for(int i=1;i<len-n+1;i++)
        {
            current = current.next;
            System.out.println(current.data);
        }
        
    }
    
    
    
}
