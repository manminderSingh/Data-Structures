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
public class ReverseRecursive {
    
    
    private class Node
    {
        int data;
        Node next;
        
    }
    
    
    public Node push(Node head, int new_Data)
    {
     Node pNode = new Node ();
     pNode.data = new_Data;
     pNode.next = head;
     head= pNode;
     return pNode;
    }
    
    
    public void printLists(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    
    public Node recursiveReverse(Node head, Node previous)
    {
   
       if(head==null)
       {
          
           return null;
       }
       
       if(head.next==null)
       {
           head.next = previous;
           return head;
       }
       
      Node r = recursiveReverse(head.next, head);
      head.next = previous;
      return r;
      
       
    }
    
    
 
    public static void main (String args[])
    {
        Node head = null;
        ReverseRecursive rs = new ReverseRecursive();
        head = rs.push(head, 1);
        head = rs.push(head, 2);
        head = rs.push(head, 3);
        
        rs.printLists(head);
        
        System.out.println("");
//        Node r = rs.recursive(head);
        head = rs.recursiveReverse(head, null);
        System.out.println("");
        
        rs.printLists(head);
    }
    
}
