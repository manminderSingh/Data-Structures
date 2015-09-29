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

/* This can be done using two Methods 
    1. Traverse the whole list completely. Set a count and use this count for traversing second time. 
    2. use slow fast method/ hare-tortoise solutio
*/

public class PrintMiddleOfLinkedList {
    
    
    private class Node 
    {
        int data;
        Node next;
              
    }
    
    //Method 1 - Traversing two times.
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        
        pNode.next = head;
        head = pNode;
    }
    
    
    public void printList(Node head)
    {
        Node p = head;
        while(p!=null)
        {
            System.out.println(p.data);
            p = p.next;
            
        }
    }
    
    public static void main (String args[])
    {
        Node head = null;
        PrintMiddleOfLinkedList ds = new PrintMiddleOfLinkedList();
        int count  = ds.Method1(head);
        int middle = count/2;
        System.out.println("The middle of Linked List is " + middle);
        
    }
    
    //This method has complexity as O(n)
    public int Method1(Node head)
    {
        int count  = 0;
        Node p = head;
        while(p!=null)
        {
            count++;
            p = p.next;
        }  
        
        return count;
    }
    
  public void Method2 (Node head)
  {
      Node slow = head;
      Node fast = head;
      
      if(head!=null)
      {
          while(fast!=null && fast.next!=null)
          {
              slow = slow.next;
              fast = fast.next.next;
          }
          System.out.println("The middle element is " + slow.data);
      }
  }
    
}
