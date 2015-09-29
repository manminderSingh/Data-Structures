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
public class RecursiveFunctionToPrintReverse {
    
    //This can be done in two ways.
    //1. It can be done using Iterative method
    //2. This can be done using Recursive
    
    private class Node
    {
        int data;
        Node next;
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
    
    
    public Node push(Node head, int new_data)
    {
     Node pNode = new Node();
     pNode.data = new_data;
     pNode.next = head;
     head = pNode;
     return pNode;
    }
    
    
  
    
    
    public void printReverse(Node head)
    {
        if(head==null)
        {
            return;
        }
        printReverse(head.next);
        
        System.out.println(head.data);
    }
    
    public static void main (String args[])
    {
        Node head = null;
        
        RecursiveFunctionToPrintReverse rs = new RecursiveFunctionToPrintReverse();
        head = rs.push(head, 5);
        head = rs.push(head, 4);
        head = rs.push(head, 3);
        
        head = rs.push(head, 2);
        head = rs.push(head, 1);
        
        rs.printLists(head);
              System.out.println("");
        rs.printReverse(head);
        
//        rs.reverseRecursive(head);
        
  
        
       // rs.printLists(head);
        
    }
    
    
}
