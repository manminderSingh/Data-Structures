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
public class Structure {
    
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
    
    public static void main (String args[])
    {
        
    }
    
    
}
