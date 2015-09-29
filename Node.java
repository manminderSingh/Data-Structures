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
public class Node {
    
    
    int data;
    Node next;
    
    public Node push(Node head, int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = head;
        head = pNode;
        return pNode;
    }
    
    
    public void printLists(Node head)
    {
        Node current = head;
        if(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}
