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
public class InsertInLinkedListInSortedWay {
    
    
    private class Node 
    {
        int data;
        Node next;
    }
    
    
    public void sortedInsert(Node head, Node pNode)
    {
        Node current;
        if(head==null||head.data>=pNode.data)
        {
            pNode.next = head;
            head= pNode;
        }
        
        else
        {
            current = head;
            while(current!=null&&current.next!=null&&current.next.data<pNode.data)
            {
                current = current.next;
            }
            
            pNode.next = current.next;
            current.next = pNode;
            
        }
    }
    
    public Node pNode (int new_data)
    {
        Node pNode = new Node();
        pNode.data = new_data;
        pNode.next = null;
        return pNode;
    }
    
    
    public void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main (String args[])
    {
        Node head = null;
        InsertInLinkedListInSortedWay is = new InsertInLinkedListInSortedWay();
        Node pNode = is.pNode(5);
        is.sortedInsert(head, pNode);
        pNode = is.pNode(10);
        is.sortedInsert(head, pNode);
    }
    
    
    
}
