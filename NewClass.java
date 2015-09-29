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
public class NewClass {
    
    public class Node
    {
        int data;
        Node next;
    }
    
    public void push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head= pNode;
    }
    
}
