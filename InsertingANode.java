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

//The cases covered in this class
/* 1. Inserting a Node at the front of the linked list
   2. After a specific Node
   3. At the emd of the Linked List
*/
public class InsertingANode {
    
    private class Node 
    
    {
        Node next;
        int data;
    }
    
    //Complexity of this is O(1)
    public void addAtFront (Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        
        pNode.next = head;
        head= pNode;
        
        
    }
    
    //Complexity of this is O(n)
    //It can be made O(n) if we specify previous node. 
    public void addAfterNode (Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        
        Node p = head;
        
        while(p!=null)
        {
           if(p.data==new_data)
               
           {
               break;
           }
           p = p.next;
        }
        
        if(p==null)
        {
            System.out.println("Node does not exist");
        }
        
        else
           
        {
            pNode.next = p.next;
            p.next = pNode;
            
        }
    }
    
    
    //Complexity of this is O(n)
    public void AddAtEnd(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        Node p = head;
        while(p.next!=null)
        {
            if(p.next==null)
            {
                p.next = pNode;
                pNode.next = null;
            }
            p =p.next;
        }
    }
    
}
