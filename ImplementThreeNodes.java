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
public class ImplementThreeNodes {
    
    
    private static class Node 
    {
        int data;
        Node next;
    }
    
    
    public static void main (String [] args)
    {
        Node head = null;
        Node second = null;
        Node third = null;
        
        head = new Node();
        second = new Node();
        third = new Node();
        
        
        head.data = 1;
        head.next = second;
        
        
        second.data = 2;
        second.next = third;
        
        third.data = 3;
        third.next=  null;
        
        ImplementThreeNodes im =  new ImplementThreeNodes();
        im.printList(head);
    }
    
    
    public void printList (Node n)
    {
        while(n!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }
    
}
