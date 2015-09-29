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

//Instructions : It is not possible in Java to have a pointer and use that pointer to delete a node. 
public class DeleteNodeUsingSpecificPointer {
    
    
    private class Node
    {
        int data;
        Node next;
    }
    
    public void push (Node head, int new_data)
    {
        Node pNode = new Node();
        
        if(pNode!=null)
        {
        pNode.data = new_data;
        
        pNode.next  = head;
        head = pNode;
        }
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
    
    //Delete a node using the pointer is onluy valid for C or C++
    //For java I am considering that the value of the key will be given.
    public void deleteNode (Node head, int data)
    {
        Node p = head;
        while(p!=null)
        {
            if(p.data==data)
                break;
            p = p.next;
        }
    }
    
}
