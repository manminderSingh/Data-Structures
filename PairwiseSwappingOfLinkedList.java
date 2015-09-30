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


//This can be done using two ways
//1. Iterative and Swapping the values inside the Nodes.
//2. Using Recursive function.

public class PairwiseSwappingOfLinkedList {
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public Node push(Node head, int new_Data)
    {
        Node pNode = new Node();
        pNode.data = new_Data;
        pNode.next = head;
        head = pNode;
        return head;
    }
    
    
    public void printLists(Node head)
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    
    public void swap (Node head)
    {
        Node current = head;
        int temp = 0;
        while(current!=null&&current.next!=null)
        {
            temp= current.data;
            current.data = current.next.data;
            current.next.data = temp;
            
            current=current.next.next;
        }
    }
    
    public void swapping(int a, int b)
            
    {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
    
    
    public void recursiveSwap(Node head)
    {
        int temp = 0;
       if(head!=null&&head.next!=null)
       {
           temp = head.data;
           head.data = head.next.data;
           head.next.data = temp;
           
            recursiveSwap(head.next.next);
       }
       
       
    }
    
    
    
    public static void main (String args[])
    {
        Node head = null;
        PairwiseSwappingOfLinkedList ps = new PairwiseSwappingOfLinkedList();
        head = ps.push(head, 2);
        head = ps.push(head, 1);
        head = ps.push(head, 4);
        head = ps.push(head, 3);
        
        ps.printLists(head);
        
        System.out.println("");
        
        ps.swap(head);
        
        ps.printLists(head);
        
        System.out.println("");
        
        ps.recursiveSwap(head);
        
        
        ps.printLists(head);
        
        
        
    }
    
}
