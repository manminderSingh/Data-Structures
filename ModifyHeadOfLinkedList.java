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
public class ModifyHeadOfLinkedList {
    
    
    private class Node
    {
        int data;
        Node next;
    }
    
    //This method adds a particular value to all the nodes of the Linked list including Head of the List. 
    
    
    public void addValueToEachNode (Node head, int data)
    {
        Node p = head;
        
        //This will modify the value of each and every and every node. 
        //In order toavoid the updation of the head node it is better to write p =head.next;
        while(p!=null)
        {
            p.data = p.data + data;
            p = p.next;
                    
        }
    }
    

    
    public void deleteFirst(Node head)
    {
        if(head!=null)
        {
            Node temp = head;
            head = head.next;
        }
    }
    
    
}
